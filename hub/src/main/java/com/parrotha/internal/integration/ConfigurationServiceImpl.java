/**
 * Copyright (c) 2021-2023 by the respective copyright holders.
 * All rights reserved.
 * <p>
 * This file is part of Parrot Home Automation Hub.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.parrotha.internal.integration;

import com.parrotha.device.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.introspector.BeanAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ConfigurationServiceImpl implements ConfigurationService {
    private static final Logger logger = LoggerFactory.getLogger(ConfigurationServiceImpl.class);

    Map<String, Object> configuration;
    private Map<String, IntegrationConfiguration> integrations;

    @Override
    public List<IntegrationSetting> getIntegrationConfiguration(String integrationId) {
        IntegrationConfiguration integrationConfiguration = getIntegrationById(integrationId);
        if (integrationConfiguration != null) {
            return integrationConfiguration.getSettings();
        }
        return null;
    }

    @Override
    public String getIntegrationConfigurationValue(String integrationId, String configurationId) {
        IntegrationConfiguration integrationConfiguration = getIntegrationById(integrationId);
        if (integrationConfiguration != null) {
            IntegrationSetting setting = integrationConfiguration.getSettingByName(configurationId);
            if (setting != null) {
                return setting.getValue();
            }
        }
        return null;
    }

    @Override
    public void updateIntegrationConfigurationValue(String integrationId, String configurationKey, Object configurationValue, String type,
                                                    boolean multiple) {
        IntegrationConfiguration integrationConfiguration = getIntegrationById(integrationId);
        if (integrationConfiguration != null) {
            IntegrationSetting setting = integrationConfiguration.getSettingByName(configurationKey);
            if (setting != null) {
                if (configurationValue != null) {
                    setting.setValue(configurationValue.toString());
                } else {
                    setting.setValue(null);
                }
                setting.setType(type);
                setting.setMultiple(multiple);
                saveIntegration(integrationId);
            }
        }
    }

    public ConfigurationServiceImpl() {
        this.loadConfiguration();
    }

    @Override
    public void initialize() {
        // TODO: check if we are already initialized
        createDirectory("./config");
        createDirectory("./config/devices");
        createDirectory("./config/installedAutomationApps");
        createDirectory("./config/integrations");

        //TODO: load configuration files

        // load integration configurations
        loadIntegrations();
    }

    public String addIntegration(Protocol protocol, String integrationTypeId, List<IntegrationSetting> settings) {
        IntegrationConfiguration integrationConfiguration = new IntegrationConfiguration();
        integrationConfiguration.setId(UUID.randomUUID().toString());
        integrationConfiguration.setProtocol(protocol);
        integrationConfiguration.setIntegrationTypeId(integrationTypeId);
        integrationConfiguration.setSettings(settings);

        getIntegrationMap().put(integrationConfiguration.getId(), integrationConfiguration);
        saveIntegration(integrationConfiguration.getId());

        return integrationConfiguration.getId();
    }

    @Override
    public boolean removeIntegration(String integrationId) {
        //delete file in integrations
        File integrationConfig = new File("./config/integrations/" + integrationId + ".yaml");
        boolean deleted = integrationConfig.delete();
        if (!deleted) {
            logger.warn("Unable to remove integration config file for " + integrationId);
            return false;
        }

        getIntegrationMap().remove(integrationId);

        return true;
    }

    public void updateIntegration(IntegrationConfiguration integrationConfiguration) {
        if (this.integrations != null) {
            this.integrations.put(integrationConfiguration.getId(), integrationConfiguration);
            saveIntegration(integrationConfiguration.getId());
        }
    }

    private void saveIntegration(String integrationConfigurationId) {
        IntegrationConfiguration integrationConfiguration = getIntegrationMap().get(integrationConfigurationId);
        //synchronize this on each integration configuration, don't need to synchronize for all
        synchronized (integrationConfiguration) {
            try {
                Yaml yaml = new Yaml();
                yaml.setBeanAccess(BeanAccess.FIELD);
                File file = new File("./config/integrations/" + integrationConfigurationId + ".yaml");
                FileWriter fileWriter = new FileWriter(file);
                yaml.dump(integrationConfiguration, fileWriter);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public IntegrationConfiguration getIntegrationById(String id) {
        return getIntegrationMap().get(id);
    }

    @Override
    public Collection<IntegrationConfiguration> getIntegrations() {
        return getIntegrationMap().values();
    }

    private Map<String, IntegrationConfiguration> getIntegrationMap() {
        if (integrations == null) {
            loadIntegrations();
        }
        return integrations;
    }

    synchronized private void loadIntegrations() {
        if (integrations != null) {
            return;
        }
        Map<String, IntegrationConfiguration> integrationsTemp = new HashMap();
        File integrationConfigDir = new File("config/integrations/");
        if (integrationConfigDir.exists() && integrationConfigDir.isDirectory()) {
            File[] integrationConfigFiles = integrationConfigDir.listFiles(pathname -> pathname.isFile() &&
                    pathname.getName().endsWith(".yaml"));

            if (integrationConfigFiles != null && integrationConfigFiles.length > 0) {
                Yaml yaml = new Yaml();
                yaml.setBeanAccess(BeanAccess.FIELD);
                for (File f : integrationConfigFiles) {
                    try {
                        IntegrationConfiguration integration = yaml.load(new FileInputStream(f));
                        integrationsTemp.put(integration.getId(), integration);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        integrations = integrationsTemp;
    }

    private void createDirectory(String directory) {
        File directoryFile = new File(directory);
        if (!directoryFile.exists()) {
            directoryFile.mkdir();
        }
    }

    public void loadConfiguration() {
        configuration = new HashMap<>();
        Yaml yaml = new Yaml();
        try {
            File configurationFile = new File("config/configuration.yaml");
            if (configurationFile.exists()) {
                configuration = yaml.load(new FileInputStream(configurationFile));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Map loadConfigurationFile(String filename) {
        Map configuration = new HashMap<>();
        Yaml yaml = new Yaml();
        try {
            File configurationFile = new File(filename);
            if (configurationFile.exists()) {
                configuration = yaml.load(new FileInputStream(configurationFile));
            }
            return configuration;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

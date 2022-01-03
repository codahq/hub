/**
 * Copyright (c) 2021-2022 by the respective copyright holders.
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
package com.parrotha.zwave.commands.versionv2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class VersionReport extends com.parrotha.zwave.commands.versionv1.VersionReport {
    private Short zWaveLibraryType = 0;
    private Short zWaveProtocolVersion = 0;
    private Short zWaveProtocolSubVersion = 0;
    private Short firmware0Version = 0;
    private Short firmware0SubVersion = 0;
    private Short hardwareVersion = 0;
    private Short numberOfFirmwareTargets = 0;
    private List<Short> firmwareTargets;

    public Short getZWaveLibraryType() {
        return zWaveLibraryType;
    }

    public void setZWaveLibraryType(Short zWaveLibraryType) {
        this.zWaveLibraryType = zWaveLibraryType;
    }

    public Short getZWaveProtocolVersion() {
        return zWaveProtocolVersion;
    }

    public void setZWaveProtocolVersion(Short zWaveProtocolVersion) {
        this.zWaveProtocolVersion = zWaveProtocolVersion;
    }

    public Short getZWaveProtocolSubVersion() {
        return zWaveProtocolSubVersion;
    }

    public void setZWaveProtocolSubVersion(Short zWaveProtocolSubVersion) {
        this.zWaveProtocolSubVersion = zWaveProtocolSubVersion;
    }

    public Short getFirmware0Version() {
        return firmware0Version;
    }

    public void setFirmware0Version(Short firmware0Version) {
        this.firmware0Version = firmware0Version;
    }

    public Short getFirmware0SubVersion() {
        return firmware0SubVersion;
    }

    public void setFirmware0SubVersion(Short firmware0SubVersion) {
        this.firmware0SubVersion = firmware0SubVersion;
    }

    public Short getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(Short hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public Short getNumberOfFirmwareTargets() {
        return numberOfFirmwareTargets;
    }

    public void setNumberOfFirmwareTargets(Short numberOfFirmwareTargets) {
        this.numberOfFirmwareTargets = numberOfFirmwareTargets;
    }

    public List<Short> getFirmwareTargets() {
        return firmwareTargets;
    }

    public void setFirmwareTargets(List<Short> firmwareTargets) {
        this.firmwareTargets = firmwareTargets;
    }

    public List<Short> getPayload() {
        List<Short> retList = Stream.of(zWaveLibraryType, zWaveProtocolVersion, zWaveProtocolSubVersion, firmware0Version, firmware0SubVersion, hardwareVersion, numberOfFirmwareTargets).collect(Collectors.toList());
        retList.addAll(firmwareTargets);
        return retList;
    }

    public void setPayload(List<Short> payload) {
        if (payload == null) return;
        if (payload.size() > 0) {
            zWaveLibraryType = payload.get(0);
        }
        if (payload.size() > 1) {
            zWaveProtocolVersion = payload.get(1);
        }
        if (payload.size() > 2) {
            zWaveProtocolSubVersion = payload.get(2);
        }
        if (payload.size() > 3) {
            firmware0Version = payload.get(3);
        }
        if (payload.size() > 4) {
            firmware0SubVersion = payload.get(4);
        }
        if (payload.size() > 5) {
            hardwareVersion = payload.get(5);
        }
        if (payload.size() > 6) {
            numberOfFirmwareTargets = payload.get(6);
        }
        if (payload.size() > 7) {
            firmwareTargets = payload.subList(7, (payload.size() - 1));
        }
    }

    @Override
    public String toString() {
        return "VersionReport(" +
                "zWaveLibraryType: " + zWaveLibraryType +
                ", zWaveProtocolVersion: " + zWaveProtocolVersion +
                ", zWaveProtocolSubVersion: " + zWaveProtocolSubVersion +
                ", firmware0Version: " + firmware0Version +
                ", firmware0SubVersion: " + firmware0SubVersion +
                ", hardwareVersion: " + hardwareVersion +
                ", numberOfFirmwareTargets: " + numberOfFirmwareTargets +
                ", firmwareTargets: " + firmwareTargets +
                ')';
    }
}

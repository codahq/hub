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
package com.parrotha.zwave.commandclasses;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class NetworkManagementInclusionV2 {
    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAdd nodeAdd() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAdd();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAdd nodeAdd(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAdd cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAdd();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAddStatus nodeAddStatus() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAddStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAddStatus nodeAddStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAddStatus cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeAddStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemove nodeRemove() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemove();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemove nodeRemove(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemove cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemove();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemoveStatus nodeRemoveStatus() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemoveStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemoveStatus nodeRemoveStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemoveStatus cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv2.NodeRemoveStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

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
package com.parrotha.zwave.commandclasses;

import com.parrotha.zwave.internal.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class NetworkManagementInclusionV1 {
    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAdd nodeAdd() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAdd();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAdd nodeAdd(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAdd cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAdd();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAddStatus nodeAddStatus() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAddStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAddStatus nodeAddStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAddStatus cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeAddStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemove nodeRemove() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemove();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemove nodeRemove(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemove cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemove();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemoveStatus nodeRemoveStatus() {
        return new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemoveStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemoveStatus nodeRemoveStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemoveStatus cmd = new com.parrotha.zwave.commands.networkmanagementinclusionv1.NodeRemoveStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

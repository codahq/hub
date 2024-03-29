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
public class NetworkManagementBasicV1 {
    public com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSet learnModeSet() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSet();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSet learnModeSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSet cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSetStatus learnModeSetStatus() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSetStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSetStatus learnModeSetStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSetStatus cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSetStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequest networkUpdateRequest() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequest();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequest networkUpdateRequest(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequest cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequest();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequestStatus networkUpdateRequestStatus() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequestStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequestStatus networkUpdateRequestStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequestStatus cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.NetworkUpdateRequestStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.NodeInformationSend nodeInformationSend() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.NodeInformationSend();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.NodeInformationSend nodeInformationSend(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.NodeInformationSend cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.NodeInformationSend();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSet defaultSet() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSet();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSet defaultSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSet cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSetComplete defaultSetComplete() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSetComplete();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSetComplete defaultSetComplete(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSetComplete cmd = new com.parrotha.zwave.commands.networkmanagementbasicv1.DefaultSetComplete();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

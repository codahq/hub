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
public class NetworkManagementBasicV2 {
    public com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSet learnModeSet() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSet();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSet learnModeSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSet cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSetStatus learnModeSetStatus() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSetStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSetStatus learnModeSetStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSetStatus cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.LearnModeSetStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequest networkUpdateRequest() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequest();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequest networkUpdateRequest(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequest cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequest();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequestStatus networkUpdateRequestStatus() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequestStatus();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequestStatus networkUpdateRequestStatus(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequestStatus cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.NetworkUpdateRequestStatus();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.NodeInformationSend nodeInformationSend() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.NodeInformationSend();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.NodeInformationSend nodeInformationSend(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.NodeInformationSend cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.NodeInformationSend();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSet defaultSet() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSet();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSet defaultSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSet cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSetComplete defaultSetComplete() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSetComplete();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSetComplete defaultSetComplete(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSetComplete cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.DefaultSetComplete();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DSKGet dSKGet() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.DSKGet();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DSKGet dSKGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.DSKGet cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.DSKGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DSKReport dSKReport() {
        return new com.parrotha.zwave.commands.networkmanagementbasicv2.DSKReport();
    }

    public com.parrotha.zwave.commands.networkmanagementbasicv2.DSKReport dSKReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.networkmanagementbasicv2.DSKReport cmd = new com.parrotha.zwave.commands.networkmanagementbasicv2.DSKReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

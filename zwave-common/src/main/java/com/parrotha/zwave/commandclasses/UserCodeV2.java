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
public class UserCodeV2 {
    public com.parrotha.zwave.commands.usercodev2.UserCodeSet userCodeSet() {
        return new com.parrotha.zwave.commands.usercodev2.UserCodeSet();
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeSet userCodeSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.usercodev2.UserCodeSet cmd = new com.parrotha.zwave.commands.usercodev2.UserCodeSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeGet userCodeGet() {
        return new com.parrotha.zwave.commands.usercodev2.UserCodeGet();
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeGet userCodeGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.usercodev2.UserCodeGet cmd = new com.parrotha.zwave.commands.usercodev2.UserCodeGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeReport userCodeReport() {
        return new com.parrotha.zwave.commands.usercodev2.UserCodeReport();
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeReport userCodeReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.usercodev2.UserCodeReport cmd = new com.parrotha.zwave.commands.usercodev2.UserCodeReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.usercodev2.UsersNumberGet usersNumberGet() {
        return new com.parrotha.zwave.commands.usercodev2.UsersNumberGet();
    }

    public com.parrotha.zwave.commands.usercodev2.UsersNumberGet usersNumberGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.usercodev2.UsersNumberGet cmd = new com.parrotha.zwave.commands.usercodev2.UsersNumberGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.usercodev2.UsersNumberReport usersNumberReport() {
        return new com.parrotha.zwave.commands.usercodev2.UsersNumberReport();
    }

    public com.parrotha.zwave.commands.usercodev2.UsersNumberReport usersNumberReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.usercodev2.UsersNumberReport cmd = new com.parrotha.zwave.commands.usercodev2.UsersNumberReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeCapabilitiesGet userCodeCapabilitiesGet() {
        return new com.parrotha.zwave.commands.usercodev2.UserCodeCapabilitiesGet();
    }

    public com.parrotha.zwave.commands.usercodev2.UserCodeCapabilitiesGet userCodeCapabilitiesGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.usercodev2.UserCodeCapabilitiesGet cmd = new com.parrotha.zwave.commands.usercodev2.UserCodeCapabilitiesGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

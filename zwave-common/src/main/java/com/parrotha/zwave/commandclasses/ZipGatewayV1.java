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
public class ZipGatewayV1 {
    public com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationSet unsolicitedDestinationSet() {
        return new com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationSet();
    }

    public com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationSet unsolicitedDestinationSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationSet cmd = new com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationGet unsolicitedDestinationGet() {
        return new com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationGet();
    }

    public com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationGet unsolicitedDestinationGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationGet cmd = new com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationReport unsolicitedDestinationReport() {
        return new com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationReport();
    }

    public com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationReport unsolicitedDestinationReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationReport cmd = new com.parrotha.zwave.commands.zipgatewayv1.UnsolicitedDestinationReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

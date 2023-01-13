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
public class AssociationV3 {
    public com.parrotha.zwave.commands.associationv3.AssociationSet associationSet() {
        return new com.parrotha.zwave.commands.associationv3.AssociationSet();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationSet associationSet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationSet cmd = new com.parrotha.zwave.commands.associationv3.AssociationSet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationGet associationGet() {
        return new com.parrotha.zwave.commands.associationv3.AssociationGet();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationGet associationGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationGet cmd = new com.parrotha.zwave.commands.associationv3.AssociationGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationReport associationReport() {
        return new com.parrotha.zwave.commands.associationv3.AssociationReport();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationReport associationReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationReport cmd = new com.parrotha.zwave.commands.associationv3.AssociationReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationRemove associationRemove() {
        return new com.parrotha.zwave.commands.associationv3.AssociationRemove();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationRemove associationRemove(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationRemove cmd = new com.parrotha.zwave.commands.associationv3.AssociationRemove();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationGroupingsGet associationGroupingsGet() {
        return new com.parrotha.zwave.commands.associationv3.AssociationGroupingsGet();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationGroupingsGet associationGroupingsGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationGroupingsGet cmd = new com.parrotha.zwave.commands.associationv3.AssociationGroupingsGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationGroupingsReport associationGroupingsReport() {
        return new com.parrotha.zwave.commands.associationv3.AssociationGroupingsReport();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationGroupingsReport associationGroupingsReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationGroupingsReport cmd = new com.parrotha.zwave.commands.associationv3.AssociationGroupingsReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupGet associationSpecificGroupGet() {
        return new com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupGet();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupGet associationSpecificGroupGet(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupGet cmd = new com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupGet();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

    public com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupReport associationSpecificGroupReport() {
        return new com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupReport();
    }

    public com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupReport associationSpecificGroupReport(Map values) throws InvocationTargetException, IllegalAccessException {
        com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupReport cmd = new com.parrotha.zwave.commands.associationv3.AssociationSpecificGroupReport();
        BeanUtils.populate(cmd, values);
        return cmd;
    }

}

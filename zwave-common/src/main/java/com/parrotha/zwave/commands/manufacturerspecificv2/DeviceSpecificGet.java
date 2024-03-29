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
package com.parrotha.zwave.commands.manufacturerspecificv2;

import com.parrotha.zwave.Command;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class DeviceSpecificGet extends Command {
    public static final Short DEVICE_ID_TYPE_OEM = 0;
    public static final Short DEVICE_ID_TYPE_SERIAL_NUMBER = 1;
    public static final Short DEVICE_ID_TYPE_PSEUDO_RANDOM = 2;

    public String getCMD() {
        return "7206";
    }

    private Short deviceIdType = 0;

    public Short getDeviceIdType() {
        return deviceIdType;
    }

    public void setDeviceIdType(Short deviceIdType) {
        this.deviceIdType = deviceIdType;
    }

    public List<Short> getPayload() {
        Short data0 = (short) ((deviceIdType & 7));

        return Stream.of(data0).collect(Collectors.toList());
    }

    public void setPayload(List<Short> payload) {
        if (payload == null) return;
        if (payload.size() > 0) {
            deviceIdType = (short) (payload.get(0) & 7);
        }
    }

    @Override
    public String toString() {
        return "DeviceSpecificGet(" +
                "deviceIdType: " + deviceIdType +
                ')';
    }
}

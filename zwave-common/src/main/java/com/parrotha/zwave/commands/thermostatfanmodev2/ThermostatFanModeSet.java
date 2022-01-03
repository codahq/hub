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
package com.parrotha.zwave.commands.thermostatfanmodev2;

import com.parrotha.zwave.Command;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class ThermostatFanModeSet extends Command {
    public static final Short FAN_MODE_AUTO_LOW = 0;
    public static final Short FAN_MODE_LOW = 1;
    public static final Short FAN_MODE_AUTO_HIGH = 2;
    public static final Short FAN_MODE_HIGH = 3;
    public static final Short FAN_MODE_AUTO_MEDIUM = 4;
    public static final Short FAN_MODE_MEDIUM = 5;

    public String getCMD() {
        return "4401";
    }

    private Short fanMode = 0;
    private Boolean off = false;

    public Short getFanMode() {
        return fanMode;
    }

    public void setFanMode(Short fanMode) {
        this.fanMode = fanMode;
    }

    public Boolean getOff() {
        return off;
    }

    public void setOff(Boolean off) {
        this.off = off;
    }

    public List<Short> getPayload() {
        Short data0 = (short) ((fanMode & 15) | 
                (off == true ? (1 << 7) : 0));

        return Stream.of(data0).collect(Collectors.toList());
    }

    public void setPayload(List<Short> payload) {
        if (payload == null) return;
        if (payload.size() > 0) {
            fanMode = (short) (payload.get(0) & 15);
            off = ((payload.get(0) >> 7) & 1) == 1;
        }
    }

    @Override
    public String toString() {
        return "ThermostatFanModeSet(" +
                "fanMode: " + fanMode +
                ", off: " + off +
                ')';
    }
}

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
package com.parrotha.app;

import com.parrotha.internal.device.Device;
import com.parrotha.internal.device.DeviceService;
import com.parrotha.internal.hub.LocationService;
import com.parrotha.internal.entity.EntityService;

import java.util.Map;

public class ChildDeviceWrapperImpl extends DeviceWrapperImpl implements ChildDeviceWrapper {
    private EntityService entityService;
    private Device device;

    public ChildDeviceWrapperImpl(Device device, DeviceService deviceService, EntityService entityService, LocationService locationService) {
        super(device, deviceService, entityService, locationService);
        this.entityService = entityService;
        this.device = device;
    }

    public Object methodMissing(String methodName, Object arguments) {
        if (this.device != null) {
            return this.entityService.runDeviceMethodAndReturn(this.device.getId(), methodName, arguments);
        } else {
            throw new RuntimeException("Device not found");
        }
    }


    public void sendEvent(Map properties) {
        entityService.sendEvent(properties, this);
    }
}

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
package com.parrotha.zwave.commands.doorlockv1;

import com.parrotha.zwave.Command;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class DoorLockOperationReport extends Command {
    public static final Short DOOR_LOCK_MODE_DOOR_UNSECURED = 0;
    public static final Short DOOR_LOCK_MODE_DOOR_UNSECURED_WITH_TIMEOUT = 1;
    public static final Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES = 16;
    public static final Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_INSIDE_DOOR_HANDLES_WITH_TIMEOUT = 17;
    public static final Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES = 32;
    public static final Short DOOR_LOCK_MODE_DOOR_UNSECURED_FOR_OUTSIDE_DOOR_HANDLES_WITH_TIMEOUT = 33;
    public static final Short DOOR_LOCK_MODE_DOOR_SECURED = 255;

    public String getCMD() {
        return "6203";
    }

    private Short doorLockMode = 0;
    private Short insideDoorHandlesMode = 0;
    private Short outsideDoorHandlesMode = 0;
    private Short doorCondition = 0;
    private Short lockTimeoutMinutes = 0;
    private Short lockTimeoutSeconds = 0;

    public Short getDoorLockMode() {
        return doorLockMode;
    }

    public void setDoorLockMode(Short doorLockMode) {
        this.doorLockMode = doorLockMode;
    }

    public Short getInsideDoorHandlesMode() {
        return insideDoorHandlesMode;
    }

    public void setInsideDoorHandlesMode(Short insideDoorHandlesMode) {
        this.insideDoorHandlesMode = insideDoorHandlesMode;
    }

    public Short getOutsideDoorHandlesMode() {
        return outsideDoorHandlesMode;
    }

    public void setOutsideDoorHandlesMode(Short outsideDoorHandlesMode) {
        this.outsideDoorHandlesMode = outsideDoorHandlesMode;
    }

    public Short getDoorCondition() {
        return doorCondition;
    }

    public void setDoorCondition(Short doorCondition) {
        this.doorCondition = doorCondition;
    }

    public Short getLockTimeoutMinutes() {
        return lockTimeoutMinutes;
    }

    public void setLockTimeoutMinutes(Short lockTimeoutMinutes) {
        this.lockTimeoutMinutes = lockTimeoutMinutes;
    }

    public Short getLockTimeoutSeconds() {
        return lockTimeoutSeconds;
    }

    public void setLockTimeoutSeconds(Short lockTimeoutSeconds) {
        this.lockTimeoutSeconds = lockTimeoutSeconds;
    }

    public List<Short> getPayload() {
        Short data1 = (short) ((insideDoorHandlesMode & 15) | 
                ((outsideDoorHandlesMode & 15) << 4));

        return Stream.of(doorLockMode, data1, doorCondition, lockTimeoutMinutes, lockTimeoutSeconds).collect(Collectors.toList());
    }

    public void setPayload(List<Short> payload) {
        if (payload == null) return;
        if (payload.size() > 0) {
            doorLockMode = payload.get(0);
        }
        if (payload.size() > 1) {
            insideDoorHandlesMode = (short) (payload.get(1) & 15);
            outsideDoorHandlesMode = (short) ((payload.get(1) & 240) >> 4);
        }
        if (payload.size() > 2) {
            doorCondition = payload.get(2);
        }
        if (payload.size() > 3) {
            lockTimeoutMinutes = payload.get(3);
        }
        if (payload.size() > 4) {
            lockTimeoutSeconds = payload.get(4);
        }
    }

    @Override
    public String toString() {
        return "DoorLockOperationReport(" +
                "doorLockMode: " + doorLockMode +
                ", insideDoorHandlesMode: " + insideDoorHandlesMode +
                ", outsideDoorHandlesMode: " + outsideDoorHandlesMode +
                ", doorCondition: " + doorCondition +
                ", lockTimeoutMinutes: " + lockTimeoutMinutes +
                ", lockTimeoutSeconds: " + lockTimeoutSeconds +
                ')';
    }
}

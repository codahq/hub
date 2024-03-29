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
package com.parrotha.zwave.commands.networkmanagementbasicv2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class LearnModeSetStatus extends com.parrotha.zwave.commands.networkmanagementbasicv1.LearnModeSetStatus {
    public static final Short LEARN_MODE_INTERVIEW_COMPLETED = 10;
    public static final Short KEX_FAIL_KEX_KEY = 1;
    public static final Short KEX_FAIL_KEX_SCHEME = 2;
    public static final Short KEX_FAIL_KEX_CURVES = 3;
    public static final Short KEX_FAIL_DECRYPT = 5;
    public static final Short KEX_FAIL_CANCEL = 6;
    public static final Short KEX_FAIL_AUTH = 7;
    public static final Short KEX_FAIL_KEY_GET = 8;
    public static final Short KEX_FAIL_KEY_VERIFY = 9;
    public static final Short KEX_FAIL_KEY_REPORT = 10;

    private Short seqNo = 0;
    private Short status = 0;
    private Short newNodeId = 0;
    private Short grantedKeys = 0;
    private Short kexFailType = 0;
    private List<Short> dsk;

    public Short getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Short seqNo) {
        this.seqNo = seqNo;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getNewNodeId() {
        return newNodeId;
    }

    public void setNewNodeId(Short newNodeId) {
        this.newNodeId = newNodeId;
    }

    public Short getGrantedKeys() {
        return grantedKeys;
    }

    public void setGrantedKeys(Short grantedKeys) {
        this.grantedKeys = grantedKeys;
    }

    public Short getKexFailType() {
        return kexFailType;
    }

    public void setKexFailType(Short kexFailType) {
        this.kexFailType = kexFailType;
    }

    public List<Short> getDsk() {
        return dsk;
    }

    public void setDsk(List<Short> dsk) {
        this.dsk = dsk;
    }

    public List<Short> getPayload() {
        List<Short> retList = Stream.of(seqNo, status, (short) 0, newNodeId, grantedKeys, kexFailType).collect(Collectors.toList());
        retList.addAll(dsk);
        return retList;
    }

    public void setPayload(List<Short> payload) {
        if (payload == null) return;
        if (payload.size() > 0) {
            seqNo = payload.get(0);
        }
        if (payload.size() > 1) {
            status = payload.get(1);
        }
        if (payload.size() > 3) {
            newNodeId = payload.get(3);
        }
        if (payload.size() > 4) {
            grantedKeys = payload.get(4);
        }
        if (payload.size() > 5) {
            kexFailType = payload.get(5);
        }
        if (payload.size() > 22) {
            dsk = payload.subList(6, 22);
        }
    }

    @Override
    public String toString() {
        return "LearnModeSetStatus(" +
                "seqNo: " + seqNo +
                ", status: " + status +
                ", newNodeId: " + newNodeId +
                ", grantedKeys: " + grantedKeys +
                ", kexFailType: " + kexFailType +
                ", dsk: " + dsk +
                ')';
    }
}

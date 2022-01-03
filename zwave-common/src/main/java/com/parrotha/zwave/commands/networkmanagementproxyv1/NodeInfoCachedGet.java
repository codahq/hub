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
package com.parrotha.zwave.commands.networkmanagementproxyv1;

import com.parrotha.zwave.Command;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Note: This code is autogenerated, changes will be overwritten.
 */
public class NodeInfoCachedGet extends Command {
    public String getCMD() {
        return "5203";
    }

    private Short seqNo = 0;
    private Short maxAge = 0;
    private Short nodeId = 0;

    public Short getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Short seqNo) {
        this.seqNo = seqNo;
    }

    public Short getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Short maxAge) {
        this.maxAge = maxAge;
    }

    public Short getNodeId() {
        return nodeId;
    }

    public void setNodeId(Short nodeId) {
        this.nodeId = nodeId;
    }

    public List<Short> getPayload() {
        Short data1 = (short) ((maxAge & 15));

        return Stream.of(seqNo, data1, nodeId).collect(Collectors.toList());
    }

    public void setPayload(List<Short> payload) {
        if (payload == null) return;
        if (payload.size() > 0) {
            seqNo = payload.get(0);
        }
        if (payload.size() > 1) {
            maxAge = (short) (payload.get(1) & 15);
        }
        if (payload.size() > 2) {
            nodeId = payload.get(2);
        }
    }

    @Override
    public String toString() {
        return "NodeInfoCachedGet(" +
                "seqNo: " + seqNo +
                ", maxAge: " + maxAge +
                ", nodeId: " + nodeId +
                ')';
    }
}

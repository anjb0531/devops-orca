package com.mobigen.ni.devops.orca.domain.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseCommon {
    private CommonOutput output;
}
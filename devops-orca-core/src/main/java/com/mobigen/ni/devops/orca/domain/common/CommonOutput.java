package com.mobigen.ni.devops.orca.domain.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
@Setter
public class CommonOutput {

    @Builder.Default
    private Integer code = -2;

    @Builder.Default
    private String message = "System Error";

    public void setResult(CommonOutput input)   {
        this.code       = input.code;
        this.message    = input.message;
    }
}

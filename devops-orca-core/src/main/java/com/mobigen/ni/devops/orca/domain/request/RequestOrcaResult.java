package com.mobigen.ni.devops.orca.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestOrcaResult {

    @NotBlank
    @JsonProperty("work-id")
    private String workId;

    @NotBlank
    @JsonProperty("result-code")
    private Integer resultCode;

    @NotBlank
    @JsonProperty("result-message")
    private String resultMessage;

}

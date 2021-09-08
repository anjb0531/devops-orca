package com.mobigen.ni.devops.orca.domain.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResultData {

    @NotBlank
    @JsonProperty("sequence")
    private Integer sequence;

    @NotBlank
    @JsonProperty("is-affected-equip")
    private Boolean isAffectedEquip;

    @NotBlank
    @JsonProperty("result-code")
    private Integer resultCode;

    @NotBlank
    @JsonProperty("result-message")
    private String resultMessage;

    @NotBlank
    @JsonProperty("result-body")
    private String resultBody;
}

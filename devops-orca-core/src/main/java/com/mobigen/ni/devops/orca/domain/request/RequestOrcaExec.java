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
public class RequestOrcaExec {

    @NotBlank
    @JsonProperty("user-id")
    private String userId;

    @NotBlank
    @JsonProperty("work-id")
    private String workId;

    @JsonProperty("base-path")
    private String basePath;

    @JsonProperty("exec-process")
    private String execProcess;

    @JsonProperty("exec-param")
    private String execParam;

}

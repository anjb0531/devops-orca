package com.mobigen.ni.devops.orca.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mobigen.ni.devops.orca.domain.request.model.ResultData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestOrcaRowResult {

    @NotBlank
    @JsonProperty("work-id")
    private String workId;

    @NotBlank
    @JsonProperty("result-data")
    private List<ResultData> resultData;
}

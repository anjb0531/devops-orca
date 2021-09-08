package com.mobigen.ni.devops.orca.domain.wrapper;

import com.mobigen.ni.devops.orca.domain.request.RequestOrcaExec;
import com.mobigen.ni.devops.orca.domain.request.RequestOrcaResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RequestOrcaWRExec {
    @NotBlank
    private RequestOrcaExec input;
}

package com.mobigen.ni.devops.orca.domain.wrapper;

import com.mobigen.ni.devops.orca.domain.request.RequestOrcaCancel;
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
public class RequestOrcaWRCancel {
    @NotBlank
    private RequestOrcaCancel input;
}

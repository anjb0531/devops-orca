package com.mobigen.ipbh.db.model;

public class CmBatchWorkInputOrca {
    private String workId;

    private Integer sequence;

    private String hostnames;

    private String workBody;

    private String resultCode;

    private String resultMessage;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getHostnames() {
        return hostnames;
    }

    public void setHostnames(String hostnames) {
        this.hostnames = hostnames;
    }

    public String getWorkBody() {
        return workBody;
    }

    public void setWorkBody(String workBody) {
        this.workBody = workBody;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
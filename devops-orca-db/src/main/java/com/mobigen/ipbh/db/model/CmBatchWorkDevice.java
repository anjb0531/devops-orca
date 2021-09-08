package com.mobigen.ipbh.db.model;

public class CmBatchWorkDevice extends CmBatchWorkDeviceKey {
    private Object adminIp;

    private String commitId;

    private Boolean finished;

    private Boolean expired;

    private Boolean rollbackDone;

    private Boolean cfgChanged;

    private Boolean logSavedBefore;

    private Boolean logSavedAfter;

    private String logFilenameBefore;

    private String logFilenameAfter;

    private String connUsername;

    private String connEncryptedPassword;

    private String deviceType;

    private String vendor;

    public Object getAdminIp() {
        return adminIp;
    }

    public void setAdminIp(Object adminIp) {
        this.adminIp = adminIp;
    }

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    public Boolean getRollbackDone() {
        return rollbackDone;
    }

    public void setRollbackDone(Boolean rollbackDone) {
        this.rollbackDone = rollbackDone;
    }

    public Boolean getCfgChanged() {
        return cfgChanged;
    }

    public void setCfgChanged(Boolean cfgChanged) {
        this.cfgChanged = cfgChanged;
    }

    public Boolean getLogSavedBefore() {
        return logSavedBefore;
    }

    public void setLogSavedBefore(Boolean logSavedBefore) {
        this.logSavedBefore = logSavedBefore;
    }

    public Boolean getLogSavedAfter() {
        return logSavedAfter;
    }

    public void setLogSavedAfter(Boolean logSavedAfter) {
        this.logSavedAfter = logSavedAfter;
    }

    public String getLogFilenameBefore() {
        return logFilenameBefore;
    }

    public void setLogFilenameBefore(String logFilenameBefore) {
        this.logFilenameBefore = logFilenameBefore;
    }

    public String getLogFilenameAfter() {
        return logFilenameAfter;
    }

    public void setLogFilenameAfter(String logFilenameAfter) {
        this.logFilenameAfter = logFilenameAfter;
    }

    public String getConnUsername() {
        return connUsername;
    }

    public void setConnUsername(String connUsername) {
        this.connUsername = connUsername;
    }

    public String getConnEncryptedPassword() {
        return connEncryptedPassword;
    }

    public void setConnEncryptedPassword(String connEncryptedPassword) {
        this.connEncryptedPassword = connEncryptedPassword;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}
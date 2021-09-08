package com.mobigen.ipbh.db.model;

import java.util.ArrayList;
import java.util.List;

public class CmBatchWorkDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmBatchWorkDeviceExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWorkIdIsNull() {
            addCriterion("work_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("work_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(String value) {
            addCriterion("work_id =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(String value) {
            addCriterion("work_id <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(String value) {
            addCriterion("work_id >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_id >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(String value) {
            addCriterion("work_id <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(String value) {
            addCriterion("work_id <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLike(String value) {
            addCriterion("work_id like", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotLike(String value) {
            addCriterion("work_id not like", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<String> values) {
            addCriterion("work_id in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<String> values) {
            addCriterion("work_id not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(String value1, String value2) {
            addCriterion("work_id between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(String value1, String value2) {
            addCriterion("work_id not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andAdminIpIsNull() {
            addCriterion("admin_ip is null");
            return (Criteria) this;
        }

        public Criteria andAdminIpIsNotNull() {
            addCriterion("admin_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIpEqualTo(Object value) {
            addCriterion("admin_ip =", value, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpNotEqualTo(Object value) {
            addCriterion("admin_ip <>", value, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpGreaterThan(Object value) {
            addCriterion("admin_ip >", value, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpGreaterThanOrEqualTo(Object value) {
            addCriterion("admin_ip >=", value, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpLessThan(Object value) {
            addCriterion("admin_ip <", value, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpLessThanOrEqualTo(Object value) {
            addCriterion("admin_ip <=", value, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpIn(List<Object> values) {
            addCriterion("admin_ip in", values, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpNotIn(List<Object> values) {
            addCriterion("admin_ip not in", values, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpBetween(Object value1, Object value2) {
            addCriterion("admin_ip between", value1, value2, "adminIp");
            return (Criteria) this;
        }

        public Criteria andAdminIpNotBetween(Object value1, Object value2) {
            addCriterion("admin_ip not between", value1, value2, "adminIp");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNull() {
            addCriterion("commit_id is null");
            return (Criteria) this;
        }

        public Criteria andCommitIdIsNotNull() {
            addCriterion("commit_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommitIdEqualTo(String value) {
            addCriterion("commit_id =", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotEqualTo(String value) {
            addCriterion("commit_id <>", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThan(String value) {
            addCriterion("commit_id >", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdGreaterThanOrEqualTo(String value) {
            addCriterion("commit_id >=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThan(String value) {
            addCriterion("commit_id <", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLessThanOrEqualTo(String value) {
            addCriterion("commit_id <=", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdLike(String value) {
            addCriterion("commit_id like", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotLike(String value) {
            addCriterion("commit_id not like", value, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdIn(List<String> values) {
            addCriterion("commit_id in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotIn(List<String> values) {
            addCriterion("commit_id not in", values, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdBetween(String value1, String value2) {
            addCriterion("commit_id between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andCommitIdNotBetween(String value1, String value2) {
            addCriterion("commit_id not between", value1, value2, "commitId");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("finished is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("finished is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Boolean value) {
            addCriterion("finished =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Boolean value) {
            addCriterion("finished <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Boolean value) {
            addCriterion("finished >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("finished >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Boolean value) {
            addCriterion("finished <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Boolean value) {
            addCriterion("finished <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Boolean> values) {
            addCriterion("finished in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Boolean> values) {
            addCriterion("finished not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Boolean value1, Boolean value2) {
            addCriterion("finished between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("finished not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNull() {
            addCriterion("expired is null");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNotNull() {
            addCriterion("expired is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredEqualTo(Boolean value) {
            addCriterion("expired =", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotEqualTo(Boolean value) {
            addCriterion("expired <>", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThan(Boolean value) {
            addCriterion("expired >", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("expired >=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThan(Boolean value) {
            addCriterion("expired <", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThanOrEqualTo(Boolean value) {
            addCriterion("expired <=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredIn(List<Boolean> values) {
            addCriterion("expired in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotIn(List<Boolean> values) {
            addCriterion("expired not in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredBetween(Boolean value1, Boolean value2) {
            addCriterion("expired between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("expired not between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneIsNull() {
            addCriterion("rollback_done is null");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneIsNotNull() {
            addCriterion("rollback_done is not null");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneEqualTo(Boolean value) {
            addCriterion("rollback_done =", value, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneNotEqualTo(Boolean value) {
            addCriterion("rollback_done <>", value, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneGreaterThan(Boolean value) {
            addCriterion("rollback_done >", value, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rollback_done >=", value, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneLessThan(Boolean value) {
            addCriterion("rollback_done <", value, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneLessThanOrEqualTo(Boolean value) {
            addCriterion("rollback_done <=", value, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneIn(List<Boolean> values) {
            addCriterion("rollback_done in", values, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneNotIn(List<Boolean> values) {
            addCriterion("rollback_done not in", values, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneBetween(Boolean value1, Boolean value2) {
            addCriterion("rollback_done between", value1, value2, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andRollbackDoneNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rollback_done not between", value1, value2, "rollbackDone");
            return (Criteria) this;
        }

        public Criteria andCfgChangedIsNull() {
            addCriterion("cfg_changed is null");
            return (Criteria) this;
        }

        public Criteria andCfgChangedIsNotNull() {
            addCriterion("cfg_changed is not null");
            return (Criteria) this;
        }

        public Criteria andCfgChangedEqualTo(Boolean value) {
            addCriterion("cfg_changed =", value, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedNotEqualTo(Boolean value) {
            addCriterion("cfg_changed <>", value, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedGreaterThan(Boolean value) {
            addCriterion("cfg_changed >", value, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cfg_changed >=", value, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedLessThan(Boolean value) {
            addCriterion("cfg_changed <", value, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedLessThanOrEqualTo(Boolean value) {
            addCriterion("cfg_changed <=", value, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedIn(List<Boolean> values) {
            addCriterion("cfg_changed in", values, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedNotIn(List<Boolean> values) {
            addCriterion("cfg_changed not in", values, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedBetween(Boolean value1, Boolean value2) {
            addCriterion("cfg_changed between", value1, value2, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andCfgChangedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cfg_changed not between", value1, value2, "cfgChanged");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeIsNull() {
            addCriterion("log_saved_before is null");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeIsNotNull() {
            addCriterion("log_saved_before is not null");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeEqualTo(Boolean value) {
            addCriterion("log_saved_before =", value, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeNotEqualTo(Boolean value) {
            addCriterion("log_saved_before <>", value, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeGreaterThan(Boolean value) {
            addCriterion("log_saved_before >", value, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("log_saved_before >=", value, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeLessThan(Boolean value) {
            addCriterion("log_saved_before <", value, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeLessThanOrEqualTo(Boolean value) {
            addCriterion("log_saved_before <=", value, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeIn(List<Boolean> values) {
            addCriterion("log_saved_before in", values, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeNotIn(List<Boolean> values) {
            addCriterion("log_saved_before not in", values, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeBetween(Boolean value1, Boolean value2) {
            addCriterion("log_saved_before between", value1, value2, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedBeforeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("log_saved_before not between", value1, value2, "logSavedBefore");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterIsNull() {
            addCriterion("log_saved_after is null");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterIsNotNull() {
            addCriterion("log_saved_after is not null");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterEqualTo(Boolean value) {
            addCriterion("log_saved_after =", value, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterNotEqualTo(Boolean value) {
            addCriterion("log_saved_after <>", value, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterGreaterThan(Boolean value) {
            addCriterion("log_saved_after >", value, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("log_saved_after >=", value, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterLessThan(Boolean value) {
            addCriterion("log_saved_after <", value, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterLessThanOrEqualTo(Boolean value) {
            addCriterion("log_saved_after <=", value, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterIn(List<Boolean> values) {
            addCriterion("log_saved_after in", values, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterNotIn(List<Boolean> values) {
            addCriterion("log_saved_after not in", values, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterBetween(Boolean value1, Boolean value2) {
            addCriterion("log_saved_after between", value1, value2, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogSavedAfterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("log_saved_after not between", value1, value2, "logSavedAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeIsNull() {
            addCriterion("log_filename_before is null");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeIsNotNull() {
            addCriterion("log_filename_before is not null");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeEqualTo(String value) {
            addCriterion("log_filename_before =", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeNotEqualTo(String value) {
            addCriterion("log_filename_before <>", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeGreaterThan(String value) {
            addCriterion("log_filename_before >", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("log_filename_before >=", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeLessThan(String value) {
            addCriterion("log_filename_before <", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeLessThanOrEqualTo(String value) {
            addCriterion("log_filename_before <=", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeLike(String value) {
            addCriterion("log_filename_before like", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeNotLike(String value) {
            addCriterion("log_filename_before not like", value, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeIn(List<String> values) {
            addCriterion("log_filename_before in", values, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeNotIn(List<String> values) {
            addCriterion("log_filename_before not in", values, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeBetween(String value1, String value2) {
            addCriterion("log_filename_before between", value1, value2, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameBeforeNotBetween(String value1, String value2) {
            addCriterion("log_filename_before not between", value1, value2, "logFilenameBefore");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterIsNull() {
            addCriterion("log_filename_after is null");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterIsNotNull() {
            addCriterion("log_filename_after is not null");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterEqualTo(String value) {
            addCriterion("log_filename_after =", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterNotEqualTo(String value) {
            addCriterion("log_filename_after <>", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterGreaterThan(String value) {
            addCriterion("log_filename_after >", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterGreaterThanOrEqualTo(String value) {
            addCriterion("log_filename_after >=", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterLessThan(String value) {
            addCriterion("log_filename_after <", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterLessThanOrEqualTo(String value) {
            addCriterion("log_filename_after <=", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterLike(String value) {
            addCriterion("log_filename_after like", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterNotLike(String value) {
            addCriterion("log_filename_after not like", value, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterIn(List<String> values) {
            addCriterion("log_filename_after in", values, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterNotIn(List<String> values) {
            addCriterion("log_filename_after not in", values, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterBetween(String value1, String value2) {
            addCriterion("log_filename_after between", value1, value2, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andLogFilenameAfterNotBetween(String value1, String value2) {
            addCriterion("log_filename_after not between", value1, value2, "logFilenameAfter");
            return (Criteria) this;
        }

        public Criteria andConnUsernameIsNull() {
            addCriterion("conn_username is null");
            return (Criteria) this;
        }

        public Criteria andConnUsernameIsNotNull() {
            addCriterion("conn_username is not null");
            return (Criteria) this;
        }

        public Criteria andConnUsernameEqualTo(String value) {
            addCriterion("conn_username =", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameNotEqualTo(String value) {
            addCriterion("conn_username <>", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameGreaterThan(String value) {
            addCriterion("conn_username >", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("conn_username >=", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameLessThan(String value) {
            addCriterion("conn_username <", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameLessThanOrEqualTo(String value) {
            addCriterion("conn_username <=", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameLike(String value) {
            addCriterion("conn_username like", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameNotLike(String value) {
            addCriterion("conn_username not like", value, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameIn(List<String> values) {
            addCriterion("conn_username in", values, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameNotIn(List<String> values) {
            addCriterion("conn_username not in", values, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameBetween(String value1, String value2) {
            addCriterion("conn_username between", value1, value2, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnUsernameNotBetween(String value1, String value2) {
            addCriterion("conn_username not between", value1, value2, "connUsername");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordIsNull() {
            addCriterion("conn_encrypted_password is null");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordIsNotNull() {
            addCriterion("conn_encrypted_password is not null");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordEqualTo(String value) {
            addCriterion("conn_encrypted_password =", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordNotEqualTo(String value) {
            addCriterion("conn_encrypted_password <>", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordGreaterThan(String value) {
            addCriterion("conn_encrypted_password >", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("conn_encrypted_password >=", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordLessThan(String value) {
            addCriterion("conn_encrypted_password <", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordLessThanOrEqualTo(String value) {
            addCriterion("conn_encrypted_password <=", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordLike(String value) {
            addCriterion("conn_encrypted_password like", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordNotLike(String value) {
            addCriterion("conn_encrypted_password not like", value, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordIn(List<String> values) {
            addCriterion("conn_encrypted_password in", values, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordNotIn(List<String> values) {
            addCriterion("conn_encrypted_password not in", values, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordBetween(String value1, String value2) {
            addCriterion("conn_encrypted_password between", value1, value2, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andConnEncryptedPasswordNotBetween(String value1, String value2) {
            addCriterion("conn_encrypted_password not between", value1, value2, "connEncryptedPassword");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andVendorIsNull() {
            addCriterion("vendor is null");
            return (Criteria) this;
        }

        public Criteria andVendorIsNotNull() {
            addCriterion("vendor is not null");
            return (Criteria) this;
        }

        public Criteria andVendorEqualTo(String value) {
            addCriterion("vendor =", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotEqualTo(String value) {
            addCriterion("vendor <>", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThan(String value) {
            addCriterion("vendor >", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThanOrEqualTo(String value) {
            addCriterion("vendor >=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThan(String value) {
            addCriterion("vendor <", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThanOrEqualTo(String value) {
            addCriterion("vendor <=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLike(String value) {
            addCriterion("vendor like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotLike(String value) {
            addCriterion("vendor not like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorIn(List<String> values) {
            addCriterion("vendor in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotIn(List<String> values) {
            addCriterion("vendor not in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorBetween(String value1, String value2) {
            addCriterion("vendor between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotBetween(String value1, String value2) {
            addCriterion("vendor not between", value1, value2, "vendor");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
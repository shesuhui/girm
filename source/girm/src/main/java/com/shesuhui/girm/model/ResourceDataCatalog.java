package com.shesuhui.girm.model;

public class ResourceDataCatalog extends DataCatalog {

    private Integer consumeOrg;

    private String keyword;

    private Integer permissionLevel;

    private Integer busiOf;

   

    public Integer getConsumeOrg() {
        return consumeOrg;
    }

    public void setConsumeOrg(Integer consumeOrg) {
        this.consumeOrg = consumeOrg;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Integer getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(Integer permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public Integer getBusiOf() {
        return busiOf;
    }

    public void setBusiOf(Integer busiOf) {
        this.busiOf = busiOf;
    }
}
package com.shesuhui.girm.model;

public class MetaDataCatalog extends DataCatalog {
  

    private Integer consumeOrg;
  
    private Integer dataType;

    private String valueRange;

    private Integer resourceOf;

    private Integer shareCount;


    public Integer getConsumeOrg() {
        return consumeOrg;
    }

    public void setConsumeOrg(Integer consumeOrg) {
        this.consumeOrg = consumeOrg;
    }


    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getValueRange() {
        return valueRange;
    }

    public void setValueRange(String valueRange) {
        this.valueRange = valueRange == null ? null : valueRange.trim();
    }

    public Integer getResourceOf() {
        return resourceOf;
    }

    public void setResourceOf(Integer resourceOf) {
        this.resourceOf = resourceOf;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }
}
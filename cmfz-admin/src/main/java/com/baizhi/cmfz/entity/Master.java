package com.baizhi.cmfz.entity;

/**
 * Created by fu on 2018/7/7.
 */
public class Master {

    private String masterId;
    private String masterName;
    private String MasterPhoto;
    private String MasterSummary;


    public Master() {
    }

    public Master(String masterId, String masterName, String masterPhoto, String masterSummary) {
        this.masterId = masterId;
        this.masterName = masterName;
        MasterPhoto = masterPhoto;
        MasterSummary = masterSummary;
    }

    @Override
    public String toString() {
        return "Master{" +
                "masterId='" + masterId + '\'' +
                ", masterName='" + masterName + '\'' +
                ", MasterPhoto='" + MasterPhoto + '\'' +
                ", MasterSummary='" + MasterSummary + '\'' +
                '}';
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getMasterPhoto() {
        return MasterPhoto;
    }

    public void setMasterPhoto(String masterPhoto) {
        MasterPhoto = masterPhoto;
    }

    public String getMasterSummary() {
        return MasterSummary;
    }

    public void setMasterSummary(String masterSummary) {
        MasterSummary = masterSummary;
    }
}

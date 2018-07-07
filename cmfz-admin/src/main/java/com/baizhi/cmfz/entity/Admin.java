package com.baizhi.cmfz.entity;

/**
 * Created by fu on 2018/7/4.
 */
public class Admin {

   private String mgrId ;
   private String mgrName;
   private String mgrPwd;
   private String salt;
   private String mgrStatus;


    public Admin() {
    }

    public Admin(String mgrId, String mgrName, String mgrPwd, String salt, String mgrStatus) {
        this.mgrId = mgrId;
        this.mgrName = mgrName;
        this.mgrPwd = mgrPwd;
        this.salt = salt;
        this.mgrStatus = mgrStatus;
    }

    public String getMgrId() {
        return mgrId;
    }

    public void setMgrId(String mgrId) {
        this.mgrId = mgrId;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getMgrPwd() {
        return mgrPwd;
    }

    public void setMgrPwd(String mgrPwd) {
        this.mgrPwd = mgrPwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getMgrStatus() {
        return mgrStatus;
    }

    public void setMgrStatus(String mgrStatus) {
        this.mgrStatus = mgrStatus;
    }

    @Override
    public String toString() {
        return "admin{" +
                "mgrId='" + mgrId + '\'' +
                ", mgrName='" + mgrName + '\'' +
                ", mgrPwd='" + mgrPwd + '\'' +
                ", salt='" + salt + '\'' +
                ", mgrStatus='" + mgrStatus + '\'' +
                '}';
    }
}

package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Master;

import java.util.Map;

/**
 * Created by fu on 2018/7/7.
 */
public interface MasterService {
    public Map<String,Object> queryMaster(int totalSize, int pageIndex, String sele, String masterName);
    public boolean addMaster(Master master);
    public boolean modifyMaster(Master master);
}

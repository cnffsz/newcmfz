package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.AdminDao;
import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fu on 2018/7/4.
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminDao ad;

    @Override
    public Admin queryByName(String name) {

        Admin admin = ad.selectByName(name);

        return admin;

    }
}

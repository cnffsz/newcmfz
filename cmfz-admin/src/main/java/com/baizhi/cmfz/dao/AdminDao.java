package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by fu on 2018/7/4.
 */
@Repository
public interface AdminDao {


    public Admin selectByName(String mgrname );
}

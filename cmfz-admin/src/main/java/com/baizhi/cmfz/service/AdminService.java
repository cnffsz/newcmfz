package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Admin;
import org.springframework.stereotype.Service;

/**
 * Created by fu on 2018/7/4.
 */

public interface AdminService {


    public Admin queryByName(String  name);
}

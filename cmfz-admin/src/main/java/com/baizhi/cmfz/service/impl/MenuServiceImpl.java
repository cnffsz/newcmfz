package com.baizhi.cmfz.service.impl;

import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by fu on 2018/7/5.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao md;


    @Override
    public List<Menu> queryAll() {



      return md.selectAll();
    }
}

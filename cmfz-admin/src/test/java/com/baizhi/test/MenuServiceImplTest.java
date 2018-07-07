package com.baizhi.test;

import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/7/5.
 */
public class MenuServiceImplTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MenuService menuService = (MenuService) applicationContext.getBean("menuServiceImpl");
        List<Menu> menus = menuService.queryAll();
        System.out.println(menus);

    }
}

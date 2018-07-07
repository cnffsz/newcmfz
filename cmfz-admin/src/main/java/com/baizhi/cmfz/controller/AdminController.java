package com.baizhi.cmfz.controller;


import com.baizhi.cmfz.entity.Admin;
import com.baizhi.cmfz.service.AdminService;
import com.baizhi.cmfz.util.NewValidateCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by fu on 2018/7/4.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService as;

    @RequestMapping("/login")
    public void login(HttpSession session,HttpServletResponse response,String mgrName,String mgrPwd,String Vcode,boolean remember) throws Exception {

        System.out.println(mgrName + ":" + mgrPwd+":"+Vcode+"haha");

        String code =(String)session.getAttribute("code");

        if(remember){
            session.setAttribute("name", mgrName );
        }

        if(!Vcode.equals("")) {
            if (code.equalsIgnoreCase(Vcode)) {
                Admin admin1 = as.queryByName(mgrName);
                if (admin1 != null && admin1.getMgrPwd().equals(mgrPwd)) {

                    response.sendRedirect("/cmfz/admin/main/main.jsp");
                } else {

                    response.sendRedirect("/cmfz/admin/login.jsp");
                }
            }else{
                response.sendRedirect("/cmfz/admin/login.jsp");
            }
        }else{

                response.sendRedirect("/cmfz/admin/login.jsp");
            }





    }


    @RequestMapping("/getImage")
    public void getImage(HttpServletResponse response ,HttpSession session) throws Exception{

        System.out.println("来到的了getimage");
        NewValidateCodeUtils utils = new NewValidateCodeUtils(160, 50, 4);

        session.setAttribute("code", utils.getCode());

        utils.write(response.getOutputStream());

    }


}

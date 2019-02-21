package com.grk.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import com.grk.entity.Admin;
import com.grk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/userLogin")
    public String login(String username,String password){

        System.out.println(username);

        boolean login = adminService.login(username, password);
        if(login)
            return "redirect:/employee/getAll";
        return "redirect:/login.jsp";
    }
    @RequestMapping("/register")
    public String register(HttpSession httpSession, Admin admin, String code){

        if(httpSession.getAttribute("code").equals(code)){
           adminService.insertAdmin(admin);
           return "redirect:/login.jsp";
        }else {
            return "redirect:/regist.jsp";
        }
    }

    @RequestMapping("/getCode")
    public void getCode(HttpSession httpSession, HttpServletResponse resp){
        CircleCaptcha cap = CaptchaUtil.createCircleCaptcha(50, 30,4,2);
        String code = cap.getCode();
        httpSession.setAttribute("code",code);
        try {
            cap.write(resp.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }

    }


}

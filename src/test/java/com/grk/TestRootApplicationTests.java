package com.grk;

import com.grk.entity.Admin;
import com.grk.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRootApplicationTests {

    @Autowired
    private AdminService adminService;

    @Test
    public void contextLoads() {
        adminService.insertAdmin(new Admin(0,"admin","qaz"));
    }



}

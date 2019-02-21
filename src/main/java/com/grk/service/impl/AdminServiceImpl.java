package com.grk.service.impl;

import com.grk.dao.AdminDao;
import com.grk.entity.Admin;
import com.grk.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> getAll() {
        return adminDao.selectAll();
    }

    @Override
    public void insertAdmin(Admin admin) {
        adminDao.insertAdmin(admin);
    }

    @Override
    public boolean login(String username, String password) {
        Admin admin = adminDao.selectAdmin(username);
        if(admin == null)
            return false;
        if(!admin.getPassword().equals(password))
            return false;
        return true;

    }
}

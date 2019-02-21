package com.grk.service;

import com.grk.entity.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAll();
    void insertAdmin(Admin admin);

    boolean login(String username,String password);


}

package com.grk.dao;

import com.grk.entity.Admin;

import java.util.List;

public interface AdminDao {
    List<Admin> selectAll();
    void insertAdmin(Admin admin);

    Admin selectAdmin(String username);



}

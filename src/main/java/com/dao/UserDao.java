package com.dao;

import com.modal.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {


    public void delete(int i);
    public void change(User user);
    public String select(int i);

    public void add(User user);

    List<User> selectAll();
}

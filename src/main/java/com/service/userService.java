package com.service;
import com.dao.userDao;
import com.modal.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userService {
    @Resource
    userDao ud;
    public void add(User user) {
        ud.add(user);
    }

    public void delete(int id) {
        ud.delete(id);
    }

    public void change(User user) {

        ud.change(user);
    }

    public String select(int id) {
        String user=ud.select(id);
        System.out.println("user="+user);
        return user;
    }

    public List<User> selectAll() {
        List<User> userList=ud.selectAll();
        return userList;
    }
}

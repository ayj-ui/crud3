package com.service;
import com.dao.UserDao;
import com.modal.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserDao userdao;
    public void add(User user) {
        userdao.add(user);
    }

    public void delete(int id) {
        userdao.delete(id);
    }

    public void change(User user) {
        userdao.change(user);
    }

    public String select(int id) {
        String user=userdao.select(id);
        return user;
    }

    public List<User> selectAll() {
        List<User> userList=userdao.selectAll();
        return userList;
    }
}

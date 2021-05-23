package com.lqt.user.service.impl;

import com.lqt.user.entity.UserDTO;
import com.lqt.user.mapper.UserMapper;
import com.lqt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUser(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<UserDTO> listUser() {
        return null;
    }

    @Override
    public int addUser(UserDTO user) {
        return 0;
    }

    @Override
    public int updateUser(UserDTO user) {
        return 0;
    }

    @Override
    public int deleteUser(Integer id) {
        return 0;
    }
}

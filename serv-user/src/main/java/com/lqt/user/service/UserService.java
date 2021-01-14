package com.lqt.user.service;

import com.lqt.user.entity.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUser(Integer id);

    List<UserDTO> listUser();

    int addUser(UserDTO user);

    int updateUser(UserDTO user);

    int deleteUser(Integer id);
}

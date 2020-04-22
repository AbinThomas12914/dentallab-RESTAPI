package com.denkraft.dentallab.service;

import com.denkraft.dentallab.model.User;
import com.denkraft.dentallab.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}

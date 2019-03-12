package com.modyo.desa.demojpa.jpa.service;

import com.modyo.desa.demojpa.controller.respones.UserDTO;
import com.modyo.desa.demojpa.jpa.model.User;

import java.util.List;

public interface UserService {
    User create(User data);

    List<User> findAll();



    User delete(User data);

    User update(Long id, User data);

    List<UserDTO> findAllOperativos();
}

package com.modyo.desa.demojpa.jpa.service.impl;

import com.modyo.desa.demojpa.controller.respones.UserDTO;
import com.modyo.desa.demojpa.jpa.dao.UserDAO;
import com.modyo.desa.demojpa.jpa.model.User;
import com.modyo.desa.demojpa.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User create(User data) {
        return userDAO.save(data);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }



    @Override
    public User delete(User data) {
        userDAO.delete(data);
        return data;
    }

    @Override
    public User update(Long id, User data) {
        User old = userDAO.getOne(id);
        old.setOperativo(data.isOperativo());
        old.setNombre(data.getNombre());
        return userDAO.save(old);
    }

    @Override
    public List<UserDTO> findAllOperativos() {
        return userDAO.findAllOperativos();
    }
}

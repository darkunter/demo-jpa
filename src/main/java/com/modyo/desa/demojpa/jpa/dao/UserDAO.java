package com.modyo.desa.demojpa.jpa.dao;

import com.modyo.desa.demojpa.controller.respones.UserDTO;
import com.modyo.desa.demojpa.jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDAO extends JpaRepository<User, Long> {

    @Query("select new com.modyo.desa.demojpa.controller.respones.UserDTO(u) " +
            "from User u " +
            "where u.operativo = true")
    List<UserDTO> findAllOperativos();
}

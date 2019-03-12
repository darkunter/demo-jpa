package com.modyo.desa.demojpa.controller;

import com.modyo.desa.demojpa.controller.respones.UserDTO;
import com.modyo.desa.demojpa.jpa.dao.UserDAO;
import com.modyo.desa.demojpa.jpa.model.User;
import com.modyo.desa.demojpa.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/modyo/crud")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    private ResponseEntity<User> create(@RequestBody User data) {
        User result = userService.create(data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    @ResponseBody
    private ResponseEntity<List<User>> read() {
        List<User> result = userService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    private ResponseEntity<User> update(@PathVariable("id") Long id,
                                        @RequestBody User data) {
        User result = userService.update(id, data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    private ResponseEntity<User> delete(@RequestBody User data) {
        User result = userService.delete(data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/read/operativos", method = RequestMethod.GET)
    @ResponseBody
    private ResponseEntity<List<UserDTO>> operativos() {
        List<UserDTO> result = userService.findAllOperativos();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}

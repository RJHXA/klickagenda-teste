package com.test.klickagenda.controller;


import com.test.klickagenda.dto.User.UserDTO;
import com.test.klickagenda.entity.User;
import com.test.klickagenda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserDTO> listUsers() {

        List<User> users = userRepository.findAll();
        return UserDTO.converter(users);
    }
}
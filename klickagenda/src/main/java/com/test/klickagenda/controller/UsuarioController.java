package com.test.klickagenda.controller;


import com.test.klickagenda.dto.User.UpdateUser;
import com.test.klickagenda.dto.User.UserDTO;
import com.test.klickagenda.entity.User;
import com.test.klickagenda.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping
    public User saveUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    @PutMapping("{id}")
    public User updateUser(@PathVariable Long id, @RequestBody UpdateUser form) {

        final Optional<User> optUser = userRepository.findById(id);

        if(optUser.isPresent()) {
            User updateUser = optUser.get();
            form.update(updateUser);

           return userRepository.save(updateUser);
        }

        // Mensagem de Error
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Long id) {
        final Optional<User> optUser = userRepository.findById(id);

        if(optUser.isPresent()) {
            userRepository.deleteById(id);
        }
    }
}
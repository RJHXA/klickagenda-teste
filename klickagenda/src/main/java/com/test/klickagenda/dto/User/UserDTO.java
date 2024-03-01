package com.test.klickagenda.dto.User;

import com.test.klickagenda.entity.User;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class UserDTO {

    private Long id;
    private String nome;

    public UserDTO(User user) {
        id = user.getId();
        nome = user.getName();
    }

    public static List<UserDTO> converter(List<User> users) {
        return users.stream().map(UserDTO::new).collect(Collectors.toList());
    }
}
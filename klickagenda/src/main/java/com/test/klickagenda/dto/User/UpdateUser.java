package com.test.klickagenda.dto.User;

import com.test.klickagenda.entity.User;
import lombok.Getter;

@Getter
public class UpdateUser {
    private String nome;

    public void update(User user) {
        user.setName(String.valueOf(nome));
    }
}
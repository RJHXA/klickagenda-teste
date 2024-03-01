package com.test.klickagenda.entity;

import  jakarta.persistence.Entity;
import  jakarta.persistence.Table;
import  jakarta.persistence.Id;
import  jakarta.persistence.GeneratedValue;
import  jakarta.persistence.GenerationType;
import  jakarta.persistence.Column;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    public Long getId() {
        return id;
    }

    public String getName() {
        return nome;
    }

    public void setId(Long newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.nome = newName;
    }
}

package com.test.klickagenda.entity;

import java.io.Serializable;

import  jakarta.persistence.Column;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class AvailiabilityId implements Serializable{

    @Column(name = "chave_dia", nullable = false)
    private Long chave_dia;

    @Column(name = "usuario_id", nullable = false)
    private Long usuario_id;

    public static AvailiabilityId createInstance(Long chave, Long id) {
        AvailiabilityId test = new AvailiabilityId();
        test.setChaveDia(chave);
        test.setUsuarioId(id);
        return test;
    }

    public Long getChaveDia() {
        return chave_dia;
    }

    public Long getUsuarioId() {
        return usuario_id;
    }

    public void setChaveDia(Long chave) {
        this.chave_dia = chave;
    }

    public void setUsuarioId(Long id) {
        this.usuario_id = id;
    }
}
package com.test.klickagenda.entity;

import java.io.Serializable;
import java.util.Objects;
import  jakarta.persistence.Column;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;

@Embeddable
@Table(name = "disponibilidade")
public class DisponibilidadeId implements Serializable{

    @Column(name = "chave_dia", insertable=false, updatable=false)
    private Long chave_dia;

    @Column(name = "usuario_id", insertable=false, updatable=false)
    private Long usuario_id;

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisponibilidadeId that = (DisponibilidadeId) o;
        return Objects.equals(chave_dia, that.chave_dia) &&
                Objects.equals(usuario_id, that.usuario_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave_dia, usuario_id);
    }

    // Se necessário, forneça um método toString personalizado
    @Override
    public String toString() {
        return "DisponibilidadeId{" +
                "chave_dia=" + chave_dia +
                ", usuario=" + usuario_id +
                '}';
    }
    */
}

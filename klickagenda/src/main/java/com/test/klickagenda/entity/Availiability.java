package com.test.klickagenda.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "disponibilidade")
@Data
public class Availiability {

    @EmbeddedId
    private AvailiabilityId id;

    @ManyToOne
    //@MapsId("usuario")
    @JoinColumn(name = "usuario_id", nullable = false, insertable = false, updatable = false)
    private User usuario;

    @Column(name = "dia_semana")
    private String dia_semana;

    public AvailiabilityId getId() {
        return id;
    }

    public String getDiaSemana() {
        return dia_semana;
    }

    public void setId(AvailiabilityId newId) {
        this.id = newId;
    }

    public void setDiaSemana(String newDiaSmena) {
        this.dia_semana = newDiaSmena;
    }
}
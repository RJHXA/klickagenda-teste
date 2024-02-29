package com.test.klickagenda.entity;

import  jakarta.persistence.Entity;
import  jakarta.persistence.Table;
import  jakarta.persistence.EmbeddedId;
import  jakarta.persistence.ManyToOne;
import  jakarta.persistence.JoinColumn;
import  jakarta.persistence.Column;
import lombok.Data;

@Entity
@Table(name = "disponibilidade")
@Data
public class Disponibilidade {

    @EmbeddedId
    private DisponibilidadeId id;

    @ManyToOne
    //@MapsId("usuario")
    @JoinColumn(name = "usuario_id", nullable = false)
    private User usuario;

    @Column(name = "dia_semana")
    private String diaSemana;
}
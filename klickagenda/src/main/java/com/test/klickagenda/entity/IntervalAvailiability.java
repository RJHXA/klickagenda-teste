package com.test.klickagenda.entity;


import  jakarta.persistence.Entity;
import  jakarta.persistence.Table;
import  jakarta.persistence.Id;
import  jakarta.persistence.ManyToOne;
import  jakarta.persistence.JoinColumn;
import  jakarta.persistence.GeneratedValue;
import  jakarta.persistence.GenerationType;
import  jakarta.persistence.JoinColumns;
import  jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table(name = "intervalo_disponibilidade")
@Data
public class IntervalAvailiability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "chave_dia_id", referencedColumnName = "chave_dia", nullable = false),
            @JoinColumn(name = "usuario_id_", referencedColumnName = "usuario_id", nullable = false)
    })
    private Availiability disponibilidade;

    @Column(name = "horario_inicio")
    private LocalTime horarioInicio;

    @Column(name = "horario_fim")
    private LocalTime horarioFim;
}
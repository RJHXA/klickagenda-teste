package com.test.klickagenda.repository;

import com.test.klickagenda.entity.Disponibilidade;
import com.test.klickagenda.entity.DisponibilidadeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface DisponibilidadeRepository extends JpaRepository<Disponibilidade, DisponibilidadeId>{
}

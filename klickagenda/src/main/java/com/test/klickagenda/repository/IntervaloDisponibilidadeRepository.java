package com.test.klickagenda.repository;

import com.test.klickagenda.entity.IntervaloDisponibilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface IntervaloDisponibilidadeRepository extends JpaRepository<IntervaloDisponibilidade, Long>{
}
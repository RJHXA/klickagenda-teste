package com.test.klickagenda.repository;

import com.test.klickagenda.entity.Availiability;
import com.test.klickagenda.entity.AvailiabilityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:5173/")
@Repository
public interface AvailiabilityRepository extends JpaRepository<Availiability, AvailiabilityId>{
    List<Availiability> findAllByUsuarioId(Long usuarioId);
}

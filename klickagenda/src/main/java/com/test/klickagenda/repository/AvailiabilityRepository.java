package com.test.klickagenda.repository;

import com.test.klickagenda.entity.Availiability;
import com.test.klickagenda.entity.AvailiabilityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:3000")
@Repository
public interface AvailiabilityRepository extends JpaRepository<Availiability, AvailiabilityId>{
}

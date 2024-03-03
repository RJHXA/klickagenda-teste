package com.test.klickagenda.repository;

import com.test.klickagenda.entity.IntervalAvailiability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:5173/")
@Repository
public interface IntervalRepository extends JpaRepository<IntervalAvailiability, Long> {
}
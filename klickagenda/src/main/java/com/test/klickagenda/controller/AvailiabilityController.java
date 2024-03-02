package com.test.klickagenda.controller;

import com.test.klickagenda.entity.Availiability;
import com.test.klickagenda.entity.AvailiabilityId;
import com.test.klickagenda.repository.AvailiabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disponibilidade")
public class AvailiabilityController {

    private static final Logger logger = LoggerFactory.getLogger(AvailiabilityController.class);

    @Autowired
    private AvailiabilityRepository availiabilityRepository;

    @GetMapping
    public List<Availiability> listAvailiability() {

        return availiabilityRepository.findAll();
    }
    @GetMapping("/{chaveDia}/{usuarioId}")
    public ResponseEntity<Availiability> searchAvailiability(@PathVariable Long chaveDia, @PathVariable Long usuarioId) {

        AvailiabilityId availiabilityId =  AvailiabilityId.createInstance(chaveDia, usuarioId);
        availiabilityId.setChaveDia(chaveDia);
        availiabilityId.setUsuarioId(usuarioId);
        Optional<Availiability> availiability = availiabilityRepository.findById(availiabilityId);

        return availiability.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Availiability> addAvailiability(@RequestBody Availiability availiability) {

        Availiability body = availiabilityRepository.save(availiability);
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }


    /*
    @PutMapping("/{chaveDia}/{usuarioId}")
    public ResponseEntity<Availiability> updateAvailiability(@PathVariable Long chaveDia, @PathVariable Long usuarioId, @RequestBody Availiability updatedAvailiability) {

        AvailiabilityId availiabilityId = AvailiabilityId.createInstance(chaveDia, usuarioId);

    }
     */

    @DeleteMapping("/{chaveDia}/{usuarioId}")
    public void deletarDisponibilidade(@PathVariable Long chaveDia, @PathVariable Long usuarioId) {

        AvailiabilityId id = AvailiabilityId.createInstance(chaveDia, usuarioId);
        final Optional<Availiability> optAvailiability = availiabilityRepository.findById(id);

        if(optAvailiability.isPresent()) {
            availiabilityRepository.deleteById(id);
        }
        
    }
}

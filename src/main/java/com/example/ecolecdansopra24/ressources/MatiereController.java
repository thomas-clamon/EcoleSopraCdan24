package com.example.ecolecdansopra24.ressources;

import com.example.ecolecdansopra24.dtos.InMatiereDto;
import com.example.ecolecdansopra24.enumation.typeMatiere;
import com.example.ecolecdansopra24.services.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.Proxy;

@RestController
@RequestMapping("Matiere")
public class MatiereController {

    @Autowired
    private MatiereService service;


    @PostMapping("add")
    public ResponseEntity add (@RequestBody InMatiereDto dto){

        // je dois controller mon dto

        try {
            typeMatiere.valueOf(dto.getType());
        }catch (Exception e) {
            return new ResponseEntity("type matiere incorrect", HttpStatusCode.valueOf(400));
        }

        int id = service.ajouter(dto);
        return new ResponseEntity(id, HttpStatusCode.valueOf(200));
    }

    @GetMapping("get/{id}")
    public ResponseEntity get(@PathVariable String id) {

        Integer ID = Integer.parseInt(id);

        // verification si l'ID existe en base
        if (!service.exist(ID))
            return new ResponseEntity("la matiere n'exsite pas", HttpStatusCode.valueOf(400));

        return new ResponseEntity<>(service.toDto(ID), HttpStatusCode.valueOf(200));

    }
}
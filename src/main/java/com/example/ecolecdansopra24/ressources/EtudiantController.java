package com.example.ecolecdansopra24.ressources;

import com.example.ecolecdansopra24.dtos.OutEtudiantDto;
import com.example.ecolecdansopra24.entities.EtudiantEntity;
import com.example.ecolecdansopra24.repositories.EtudiantRepository;
import com.example.ecolecdansopra24.services.EtudiantService;
import com.example.ecolecdansopra24.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Etudiant")
public class EtudiantController {

    @Autowired
    private EtudiantService service;

    @Autowired
    private NoteService noteService;

    @GetMapping("get/{id}")
    public ResponseEntity get(@PathVariable String id){

        Integer ID = Integer.parseInt(id);

        // verification si l'ID existe en base
        if (!service.exist(ID))
            return new ResponseEntity("l'etudiant n'exsite pas", HttpStatusCode.valueOf(400));



        // sinon
        EtudiantEntity entity = service.get(ID);
        OutEtudiantDto dto = service.toDto(entity);

        // calculer sa moyenne
        Integer moyenne = noteService.getAVG(ID);
        dto.setMoyenne(moyenne);

        return new ResponseEntity(dto, HttpStatusCode.valueOf(200));
    }
}

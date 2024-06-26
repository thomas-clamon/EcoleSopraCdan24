package com.example.ecolecdansopra24.ressources;

import com.example.ecolecdansopra24.dtos.NoteDto;
import com.example.ecolecdansopra24.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Notes")
public class NotesController {

    @Autowired
    private NoteService noteService;

    @PostMapping("add")
    public ResponseEntity ajouter (@RequestBody NoteDto dto){

        Integer ID = noteService.addNotes(dto);
        return new ResponseEntity(ID, HttpStatusCode.valueOf(200));
    }
}

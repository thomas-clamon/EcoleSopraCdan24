package com.example.ecolecdansopra24.services;

import com.example.ecolecdansopra24.dtos.NoteDto;
import com.example.ecolecdansopra24.entities.EtudiantEntity;
import com.example.ecolecdansopra24.entities.MatiereEntity;
import com.example.ecolecdansopra24.entities.NoteEntity;
import com.example.ecolecdansopra24.repositories.EtudiantRepository;
import com.example.ecolecdansopra24.repositories.MatiereRpository;
import com.example.ecolecdansopra24.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService implements INoteService{
    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private MatiereRpository matiereRpository;

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public Integer addNotes(NoteDto dto) {
        // on convertie le dto en entite

        // on recupere l'etudiant
        EtudiantEntity etudiant = etudiantRepository.findById(dto.getEtudiant()).get();
        MatiereEntity matiere = matiereRpository.findById(dto.getMatiere()).get();

        NoteEntity entity = new NoteEntity();
        entity.setValeur(dto.getNotes());
        entity.setDate(dto.getDate());
        entity.setEtudiantEntity(etudiant);
        entity.setMatiereEntity(matiere);
        noteRepository.saveAndFlush(entity);
        return entity.getID();


    }
}

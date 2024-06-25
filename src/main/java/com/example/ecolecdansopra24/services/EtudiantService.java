package com.example.ecolecdansopra24.services;

import com.example.ecolecdansopra24.dtos.OutEtudiantDto;
import com.example.ecolecdansopra24.entities.EtudiantEntity;
import com.example.ecolecdansopra24.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class EtudiantService implements IEtudiantService{

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Boolean exist(int ID) {
        return etudiantRepository.existsById(ID);
    }

    @Override
    public OutEtudiantDto toDto(EtudiantEntity entity) {
        OutEtudiantDto dto = new OutEtudiantDto();

        // je recupere mon entite
        dto.setDisplay_name(entity.getFirstname() + " " + entity.getName());

        // on calcule l'age
        int age = Period.between(entity.getBirth(), LocalDate.now()).getYears();
        dto.setAge(age);

        return dto;
    }

    @Override
    public EtudiantEntity get(int Id) {
        return etudiantRepository.findById(Id).get();
    }
}

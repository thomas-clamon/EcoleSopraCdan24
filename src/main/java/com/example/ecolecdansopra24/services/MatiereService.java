package com.example.ecolecdansopra24.services;

import com.example.ecolecdansopra24.dtos.InMatiereDto;
import com.example.ecolecdansopra24.dtos.OutMatiereDto;
import com.example.ecolecdansopra24.dtos.OutNbMatiereDto;
import com.example.ecolecdansopra24.entities.MatiereEntity;
import com.example.ecolecdansopra24.repositories.MatiereRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereService implements IMatiereService{

    @Autowired
    private MatiereRpository matiereRpository;

    @Override
    public Boolean exist(int id) {
        return matiereRpository.existsById(id);
    }

    public OutMatiereDto toDto(MatiereEntity entity){

        OutMatiereDto result = new OutMatiereDto();
        result.setNom(entity.getName());
        result.setType(entity.getType());
        return result;
    }


    @Override
    public OutMatiereDto toDto(int id) {
        if (!exist(id))
            return null;
        // sinon
        MatiereEntity entity = matiereRpository.findById(id).get(); // je recupere mon entite
        OutMatiereDto result = new OutMatiereDto();
        result.setNom(entity.getName());
        result.setType(entity.getType());
        return result;
    }

    @Override
    public Integer ajouter(InMatiereDto dto) {
        MatiereEntity entity = toEntty(dto);
        matiereRpository.saveAndFlush(entity);

        return entity.getID();
    }

    @Override
    public MatiereEntity toEntty(InMatiereDto dto) {
        MatiereEntity entity = new MatiereEntity();
        entity.setName(dto.getName());
        entity.setType(dto.getType());

        return entity;
    }

    @Override
    public List<OutMatiereDto> getAll() {
        return matiereRpository.findAll().stream().map(this::toDto).toList();
}

    @Override
    public List<OutNbMatiereDto> getByLibelle() {
        return matiereRpository.stats();
    }
}
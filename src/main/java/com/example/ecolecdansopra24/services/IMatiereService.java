package com.example.ecolecdansopra24.services;

import com.example.ecolecdansopra24.dtos.InMatiereDto;
import com.example.ecolecdansopra24.dtos.OutMatiereDto;
import com.example.ecolecdansopra24.dtos.OutNbMatiereDto;
import com.example.ecolecdansopra24.entities.MatiereEntity;

import java.util.List;

public interface IMatiereService {

    Boolean exist(int id);

    OutMatiereDto toDto(int id);

    Integer ajouter (InMatiereDto dto);

    MatiereEntity toEntty(InMatiereDto dto);

    List<OutMatiereDto> getAll();

    List<OutNbMatiereDto> getByLibelle();

    Boolean delete (Integer id);


}

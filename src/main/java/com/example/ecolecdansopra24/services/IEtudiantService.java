package com.example.ecolecdansopra24.services;

import com.example.ecolecdansopra24.dtos.InEtudiantDto;
import com.example.ecolecdansopra24.entities.EtudiantEntity;

public interface IEtudiantService {

    /**
     * Verifie si l'etudiant existe
     * @param ID ID en base de données
     * @return boolean
     */
    Boolean exist(int ID);

    /**
     * Convertie mon entite en DTO
     * @param entity
     * @return InEtudiantDto
     */
    InEtudiantDto toDto(EtudiantEntity entity);

    /**
     * Recupere une entité par l'ID
     * @param Id
     * @return
     */
    EtudiantEntity get(int Id);
}

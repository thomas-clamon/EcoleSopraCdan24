package com.example.ecolecdansopra24.repositories;

import com.example.ecolecdansopra24.dtos.OutNbMatiereDto;
import com.example.ecolecdansopra24.entities.MatiereEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatiereRpository extends JpaRepository<MatiereEntity, Integer> {

    @Query(value = "select count(*) as 'nb', type_matiere as 'libelle'\n" +
            "from Matieres\n" +
            "group by type_matiere", nativeQuery = true)
    List<OutNbMatiereDto> stats();

}

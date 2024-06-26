package com.example.ecolecdansopra24.repositories;

import com.example.ecolecdansopra24.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Integer> {

    @Query(value = "Select AVG(valeur) as 'moy' From Notes\n" +
            "Group by id_etudiant\n" +
            "Having id_etudiant = ?1", nativeQuery = true)
    Integer getAVG(Integer etudiant_id);
}

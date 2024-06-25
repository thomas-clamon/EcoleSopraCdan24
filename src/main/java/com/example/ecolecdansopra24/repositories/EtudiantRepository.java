package com.example.ecolecdansopra24.repositories;

import com.example.ecolecdansopra24.entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<EtudiantEntity, Integer> {
}

package com.example.ecolecdansopra24.repositories;

import com.example.ecolecdansopra24.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Integer> {
}

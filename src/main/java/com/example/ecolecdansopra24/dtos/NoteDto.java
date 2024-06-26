package com.example.ecolecdansopra24.dtos;

import java.time.LocalDate;

public class NoteDto {

    private Integer etudiant;
    private Integer matiere;

    private LocalDate date;

    private Integer notes;

    public Integer getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Integer etudiant) {
        this.etudiant = etudiant;
    }

    public Integer getMatiere() {
        return matiere;
    }

    public void setMatiere(Integer matiere) {
        this.matiere = matiere;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getNotes() {
        return notes;
    }

    public void setNotes(Integer notes) {
        this.notes = notes;
    }

}

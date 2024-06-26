package com.example.ecolecdansopra24.entities;

import com.example.ecolecdansopra24.entities.EtudiantEntity;
import com.example.ecolecdansopra24.entities.MatiereEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Notes")
public class NoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "valeur")
    private Integer valeur;

    @Column(name = "date_eval")
    private LocalDate date;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_etudiant" )
    private EtudiantEntity etudiantEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_matiere")
    private MatiereEntity matiereEntity;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public EtudiantEntity getEtudiantEntity() {
        return etudiantEntity;
    }

    public void setEtudiantEntity(EtudiantEntity etudiantEntity) {
        this.etudiantEntity = etudiantEntity;
    }

    public MatiereEntity getMatiereEntity() {
        return matiereEntity;
    }

    public void setMatiereEntity(MatiereEntity matiereEntity) {
        this.matiereEntity = matiereEntity;
    }
}

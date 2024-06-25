package com.example.ecolecdansopra24.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Etudiants")
public class EtudiantEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "nom")
    private String name;

    @Column(name= "prenom")
    private String firstname;

    @Column(name = "date_naissance")
    private LocalDate birth;

    @Column(name = "type_etudiant")
    private String type;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



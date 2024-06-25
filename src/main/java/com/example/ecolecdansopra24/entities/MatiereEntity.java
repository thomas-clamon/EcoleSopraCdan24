package com.example.ecolecdansopra24.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Matieres")
public class MatiereEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(name = "nom")
    private String name;


    @Column(name = "type_matiere")
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

package com.example.ecolecdansopra24.dtos;

public class OutEtudiantDto {

    private String display_name;

    private Integer age;

    private String type;

    private Integer moyenne;

    public Integer getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Integer moyenne) {
        this.moyenne = moyenne;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

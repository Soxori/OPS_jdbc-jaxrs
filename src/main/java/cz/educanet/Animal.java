package cz.educanet;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class Animal implements Serializable {
    private String id;
    private String name;
    private String species;
    private String weight;
    private String dateOfBirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getSpecies() {
        return species;
    }
    public void setSpecies(String type) {
        this.species = type;
    }


    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

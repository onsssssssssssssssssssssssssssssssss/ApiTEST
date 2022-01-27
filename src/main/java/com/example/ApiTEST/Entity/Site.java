package com.example.ApiTEST.Entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    @Column(name="namesite")
    private String namesite ;
    @Column(name="quantities")
    private int quantite;
    public Site() {
    }
    public Site(int id, String namesite ,int quantite) {
        this.id = id;
        this.namesite =namesite;
        this.quantite =quantite;
    }
    public int getIdsite() {
        return id;
    }

    public String getNamesite() {
        return namesite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setIdsite(int id) {
        this.id = id;
    }

    public void setNamesite(String namesite) {
        this.namesite = namesite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}

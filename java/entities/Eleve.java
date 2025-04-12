/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
/**
 *
 * @author HP
 */
@Entity
public class Eleve extends User {
    private String nom;
    private String prenom;
    private String classe;

    @OneToMany(mappedBy = "eleve", fetch = FetchType.EAGER)
    private List<Bulletin> bulletins;


    public Eleve() {
    }
 public Eleve(String nom, String prenom, String classe, String login, String password) {
        super(login, password);
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;

    }
 public Eleve(String nom, String prenom, String classe) {
    this.nom = nom;
    this.prenom = prenom;
    this.classe = classe;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public List<Bulletin> getBulletins() {
        return bulletins;
    }

    public void setBulletins(List<Bulletin> bulletins) {
        this.bulletins = bulletins;
    }

} 


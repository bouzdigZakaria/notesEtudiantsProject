
package entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bulletins")
public class Bulletin {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String trimestre;
    private int annee;     
    private float moyenne;  
    @ManyToOne
    @JoinColumn(name = "eleve_id")
    private Eleve eleve;

    public Bulletin() {
    }

    public Bulletin(String trimestre, int annee, float moyenne, Eleve eleve) {
        this.trimestre = trimestre;
        this.annee = annee;
        this.moyenne = moyenne;
        this.eleve = eleve;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

}

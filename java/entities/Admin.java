/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import javax.persistence.Entity;

/**
 *
 * @author HP
 */
@Entity
public class Admin extends User{
    
    private String matricule;

    public Admin() {
    }

  public Admin(String matricule, String login, String password) {
        super(login, password);
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
  
    
    
    }
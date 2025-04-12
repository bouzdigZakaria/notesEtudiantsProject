/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import dao.BulletinDao;
import dao.EleveDao;
import entities.Bulletin;
import entities.Eleve;
import java.util.Date;
import org.hibernate.Hibernate;
import util.HibernateUtil;
import dao.BulletinDao;
import dao.NoteMatiereDao;
import entities.Bulletin;
import entities.NoteMatiere;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
     
       BulletinDao bd = new BulletinDao();
      // bd.create(new Bulletin("Trimestre 1", 2018, 14));
        //bd.delete(bd.findById(1));
    // for (Bulletin f: bd.findAll()) {
     //       System.out.println(f.getTrimestre());
     //       }
        // EleveDao ed = new EleveDao();
      //  for (int i = 0; i < 2; i++) {
     // ed.create(new Eleve("Hadari", "Amin", "PSI"));
    //  }


 //   }
//Bulletin bulletin = bd.findById(2); // Remplace 1 par l’ID du bulletin que tu veux

//if (bulletin != null && bulletin.getEleve() != null) {
//    System.out.println("Nom de l'élève : " + bulletin.getEleve().getNom());
//} else {
//    System.out.println("Aucun bulletin ou élève trouvé.");
//}
        NoteMatiereDao nd = new NoteMatiereDao();

        // 💡 Remplacer 1 par l'ID réel d'un bulletin existant dans ta base
        Bulletin bulletin = bd.findById(1);

        if (bulletin != null) {
            // ✅ Créer des notes et les lier au bulletin
            NoteMatiere note1 = new NoteMatiere("Math", 14.5f, bulletin);
            NoteMatiere note2 = new NoteMatiere("Physique", 16.0f, bulletin);

            // 💾 Sauvegarder dans la BDD
            nd.create(note1);
            nd.create(note2);

            System.out.println("Notes ajoutées avec succès !");
        } else {
            System.out.println("Bulletin introuvable !");
        }
    }
}    
       


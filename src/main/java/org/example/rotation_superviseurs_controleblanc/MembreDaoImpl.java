package org.example.rotation_superviseurs_controleblanc;

import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MembreDaoImpl implements MembreDao {

    private Set<Membre> membres = new HashSet<>();
    private Set<Incident> incidents = new HashSet<>();

    @Override
    public void inserer(Membre m) {
        if (membres.add(m)) {
            System.out.println("Membre ajouté avec succès !");
        } else {
            System.out.println("Le membre existe déjà !");
        }
    }

    @Override
    public Set<Incident> chargerListIncidents() {
        return incidents;
    }



    public Set<Membre> chargerListeMembre(String nomFichier) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] data = ligne.split(",");
                if (data.length == 4) {
                    String nom = data[0].trim();
                    String prenom = data[1].trim();
                    String email = data[2].trim();
                    String phone = data[3].trim();
                    String identifiant = "ID-" + (membres.size() + 1);

                    Membre membre = new Membre(identifiant, nom, prenom, email, phone);
                    membres.add(membre);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture du fichier CSV : " + e.getMessage());
        }
        return membres;
    }




    public void afficherMembres() {
        if (membres.isEmpty()) {
            System.out.println("Aucun membre chargé !");
        } else {
            System.out.println("Liste des membres :");
            for (Membre membre : membres) {
                System.out.println(membre);
            }

        }
    }
}

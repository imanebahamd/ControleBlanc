package org.example.rotation_superviseurs_controleblanc;


public class Membre {

    private String identifiant;
    private String nom;
    private String prenom;
    private String email;
    private String phone;

    public Membre(String identifiant, String nom, String prenom, String email, String phone) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    public String getIdentifiant() {return identifiant;}
    public String getNom() {return nom; }
    public String getPrenom(){return prenom;}
    public String getEmail(){return email;}
    public String getPhone(){return phone;}

    public void setIdentifiant(String identifiant) {this.identifiant = identifiant;}
    public void setNom(String nom) {this.nom = nom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public void setEmailt(String email) {this.identifiant = identifiant;}
    public void setPhone(String phone) {this.phone = phone;}

    @Override
    public String toString() {
        return "Membre{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Membre membre = (Membre) obj;
        return identifiant.equals(membre.identifiant);
    }

    @Override
    public int hashCode() {
        return identifiant.hashCode();
    }



}
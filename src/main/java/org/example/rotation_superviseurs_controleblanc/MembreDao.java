package org.example.rotation_superviseurs_controleblanc;


import java.util.Set;

public interface MembreDao {
    void inserer(Membre m);
    Set<Incident> chargerListIncidents();
}



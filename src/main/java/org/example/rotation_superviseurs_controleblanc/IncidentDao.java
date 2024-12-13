package org.example.rotation_superviseurs_controleblanc;

import java.util.Set;



public interface IncidentDao {
    void inserer(Incident i);
    void inserer(Set<Incident> is);
}

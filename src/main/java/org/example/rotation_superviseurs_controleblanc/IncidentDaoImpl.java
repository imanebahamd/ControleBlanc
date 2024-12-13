package org.example.rotation_superviseurs_controleblanc;

import java.util.HashSet;
import java.util.Set;

public class IncidentDaoImpl implements IncidentDao {
    private Set<Incident> incidents = new HashSet<>();

    @Override
    public void inserer(Incident i) {
        incidents.add(i);
    }

    @Override
    public void inserer(Set<Incident> is) {
        incidents.addAll(is);
    }
}


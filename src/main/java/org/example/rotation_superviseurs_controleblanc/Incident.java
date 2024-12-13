package org.example.rotation_superviseurs_controleblanc;


public class Incident {

    private String reference;
    private String time;
    private String status;

    public Incident(String reference, String time, String status) {
        this.reference = reference;
        this.time = time;
        this.status = status;
    }

    public String getReference() {return reference;}
    public String getTime(){return time;}
    public String getStatus(){return status;}

    public void setReference(String reference) {this.reference = reference;}
    public void setTime(String time) {this.time = time;}
    public void setStatus(String status) {this.status = status;}
}
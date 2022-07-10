package com.bharath.spring.springcore.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {

    private int id;
    String patientName;
    List<String> mediciens;

    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMediciens() {
        return mediciens;
    }

    public void setMediciens(List<String> mediciens) {
        this.mediciens = mediciens;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", mediciens=" + mediciens +
                '}';
    }
}

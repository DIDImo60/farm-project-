package models;

import java.time.LocalDate;

public class VetVisit {
    private int visitId;
    private int animalId;
    private LocalDate date;
    private String diagnosis;
    private String treatment;

    public VetVisit(int visitId, int animalId, String diagnosis, String treatment) {
        this.visitId = visitId;
        this.animalId = animalId;
        this.date = LocalDate.now();
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public int getVisitId() { return visitId; }
    public int getAnimalId() { return animalId; }
    public LocalDate getDate() { return date; }
    public String getDiagnosis() { return diagnosis; }
    public String getTreatment() { return treatment; }

    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public void setTreatment(String treatment) { this.treatment = treatment; }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Visit ID    : " + visitId);
        System.out.println("Animal ID   : " + animalId);
        System.out.println("Date        : " + date);
        System.out.println("Diagnosis   : " + diagnosis);
        System.out.println("Treatment   : " + treatment);
        System.out.println("---------------------------");
    }
}

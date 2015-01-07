package promed;

import java.util.ArrayList;
import java.util.List;

public class Vm extends Personne {
    private String departement;
    private String status;
    private List<Medicament> medicaments = new ArrayList<Medicament>();

    public Vm(String departement, String status) {
        this.departement = departement;
        this.status = status;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public List<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public void addMedicament(Medicament medicament) {
        this.medicaments.add(medicament);
    }
}

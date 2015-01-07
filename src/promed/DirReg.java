package promed;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Antoine CHAUVIN INFOB1
 */
public class DirReg extends Personne {
    private String region;
    private List<Vm> dirige = new ArrayList<Vm>();

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Vm> getDirige() {
        return dirige;
    }

    public void setDirige(List<Vm> dirige) {
        this.dirige = dirige;
    }

    public void dirige(Vm vm) {
        this.dirige.add(vm);
    }

    @Override
    public List<Medicament> getMedicaments() {
        List<Medicament> medicaments = new ArrayList<Medicament>();
        for (Vm vm : dirige) {
            medicaments.addAll(vm.getMedicaments());
        }
        return medicaments;
    }
}

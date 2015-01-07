package promed;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String region;
    private List<DirReg> directeurs = new ArrayList<DirReg>();
    private List<Vm> visiteurs = new ArrayList<Vm>();

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<DirReg> getDirecteurs() {
        return directeurs;
    }

    public void setDirecteurs(List<DirReg> directeurs) {
        this.directeurs = directeurs;
    }

    public void addDirecteur(DirReg dir) {
        this.directeurs.add(dir);
    }

    public List<Vm> getVisiteurs() {
        return visiteurs;
    }

    public void setVisiteurs(List<Vm> visiteurs) {
        this.visiteurs = visiteurs;
    }

    public void addVisiteur(Vm vm) {
        this.visiteurs.add(vm);
    }
}

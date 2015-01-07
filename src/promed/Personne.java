package promed;

import java.util.List;

public abstract class Personne {
    private double smic;
    private double primeMultiplier;

    public abstract List<Medicament> getMedicaments();

    public double getSmic() {
        return smic;
    }

    public void setSmic(double smic) {
        this.smic = smic;
    }

    public double getPrimeMultiplier() {
        return primeMultiplier;
    }

    public void setPrimeMultiplier(double primeMultiplier) {
        this.primeMultiplier = primeMultiplier;
    }
}

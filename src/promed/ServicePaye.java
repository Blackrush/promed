package promed;

public class ServicePaye {

    private double primeParMedoc;

    public double getPrimeParMedoc() {
        return primeParMedoc;
    }

    public void setPrimeParMedoc(double primeParMedoc) {
        this.primeParMedoc = primeParMedoc;
    }

    public double calcPaye(Personne p) {
        double salaire = p.getSmic();
        for (Medicament medicament : p.getMedicaments()) {
            salaire += primeParMedoc * p.getPrimeMultiplier();
        }
        return salaire;
    }
}

package promed;

public class Medicament {
    private String nom;
    private double prixVente;
    private double prixRevient;
    private String description;
    private String modalite;

    public Medicament(String nom, double prixVente, double prixRevient, String description, String modalite) {
        this.nom = nom;
        this.prixVente = prixVente;
        this.prixRevient = prixRevient;
        this.description = description;
        this.modalite = modalite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public double getPrixRevient() {
        return prixRevient;
    }

    public void setPrixRevient(double prixRevient) {
        this.prixRevient = prixRevient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModalite() {
        return modalite;
    }

    public void setModalite(String modalite) {
        this.modalite = modalite;
    }
}

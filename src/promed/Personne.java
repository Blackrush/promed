package promed;

/**
 * @author Antoine CHAUVIN INFOB1
 */
public abstract class Personne {
    private String nom;

    public Personne(String nom) {
        if (nom == null) {
            throw new NullPointerException("nom");
        }
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom == null) {
            throw new NullPointerException();
        }
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Personne)) return false;

        Personne personne = (Personne) o;
        return nom.equals(personne.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}

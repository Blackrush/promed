package promed;

/**
 * @author Antoine CHAUVIN INFOB1
 */
public class DirReg extends Personne {

    private Equipe equipe;

    public DirReg(String nom, Equipe equipe) {
        super(nom);
        if (equipe == null) {
            throw new NullPointerException("equipe");
        }
        this.equipe = equipe;
    }

    public DirReg(Equipe equipe) {
        this("", equipe);
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "DirReg{" +
                "nom=" + getNom() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DirReg dirReg = (DirReg) o;
        return equipe.equals(dirReg.equipe);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + equipe.hashCode();
        return result;
    }
}

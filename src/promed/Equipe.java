package promed;

/**
 * @author Antoine CHAUVIN INFOB1
 */
public class Equipe {
    private String region;

    public Equipe() {
        this.region = "";
    }

    public Equipe(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        if (region == null) {
            throw new NullPointerException();
        }
        this.region = region;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "region='" + region + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipe equipe = (Equipe) o;
        return region.equals(equipe.region);
    }

    @Override
    public int hashCode() {
        return region.hashCode();
    }
}

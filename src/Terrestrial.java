public class Terrestrial extends Animal {
    protected int nbrLegs;

    public Terrestrial() {}

    public Terrestrial(String name, int nbrLegs) {
        super(name);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }
}

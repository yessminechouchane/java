public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() {}

    public Aquatic(String name, String habitat) {
        super(name);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
}

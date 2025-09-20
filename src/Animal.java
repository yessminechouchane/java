public class Animal {
    String family, name;
    int age;
    boolean isMammal;
    @Override
    public String toString() {
        return "Nom : " + name + ", Famille : " + family +
                ", Âge : " + age + ", Mammifère : " + isMammal;
    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}
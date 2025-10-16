public class ZooTest {
    public static void main(String[] args) {
        // Instanciation avec constructeurs par défaut
        Aquatic a1 = new Aquatic();
        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();

        System.out.println("== Constructeurs par défaut ==");
        System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        // Instanciation avec constructeurs paramétrés
        Aquatic a2 = new Aquatic("Fish", "Ocean");
        Terrestrial t2 = new Terrestrial("Lion", 4);
        Dolphin d2 = new Dolphin("Flipper", "Sea", 35.5f);
        Penguin p2 = new Penguin("Pingu", "Antarctica", 50.0f);

        System.out.println("\n== Constructeurs paramétrés ==");
        System.out.println(a2);
        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);

        // Test des méthodes swim()
        System.out.println("\n== Méthodes swim() ==");
        a2.swim();
        d2.swim();
        p2.swim();  // hérite de la version d’Aquatic
    }
}

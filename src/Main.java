import java.util.Scanner;

public class ZooManagement {
    private int nbrCages;
    private String zooName;

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        Scanner sc = new Scanner(System.in);

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Entrez le nom du zoo : ");
            zm.zooName = sc.nextLine().trim();
            if (!zm.zooName.isEmpty()) {
                validInput = true;
            } else {
                System.out.println("Le nom du zoo ne peut pas être vide. Veuillez réessayer.");
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.println("Entrez le nombre de cages : ");
            if (sc.hasNextInt()) {
                zm.nbrCages = sc.nextInt();
                if (zm.nbrCages > 0) {
                    validInput = true;
                } else {
                    System.out.println("Le nombre de cages doit être un entier positif. Veuillez réessayer.");
                }
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un entier positif.");
                sc.next();
            }
        }

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");
    }
}
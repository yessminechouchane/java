public class Main {
    public static void main(String[] args) {
        /*if (Zoo.Animal >25){
            ("erreur");
        }*/
        Zoo myZoo = new Zoo("myZoo", "Tunis", 25);
        myZoo.displayZoo();
        System.out.println(myZoo.toString());
        Animal lion = new Animal("carnivore", "Lion", 5, true);
        System.out.println(lion);

    }
}
package factory;

import toys.Toy;

import java.util.ArrayList;
import java.util.Random;

public class ToysFactory {

    /**
     * Create toys
     */
    public static ArrayList<Toy> createToys(int toyCount) {
        Random random = new Random();
        ArrayList<Toy> createToys = new ArrayList<>();

        for (int i = 0; i < toyCount; i++) {

            int rand1 = random.nextInt(1, 100);  // имя
            String name = "Игрушка " + rand1;
            int rand2 = random.nextInt(1, 50);   // кол-во
            int rand3 = random.nextInt(1, 99);   // вес
            Toy toy = new Toy(name, rand2, rand3);

            createToys.add(toy);
        }
        return createToys;
    }

}

package toys;

import java.util.ArrayList;
import java.util.Random;

public class ToysToArray<Toy> {
    private final ArrayList<Toy> toysArray;


    public ToysToArray(ArrayList<Toy> toysArray) {
        this.toysArray = toysArray;
    }


    public void addToy(Toy toy) {
        toysArray.add(toy);
    }


    public Toy getRandomToy() {
        if (this.toysArray.isEmpty()) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(toysArray.size());
            return toysArray.get(i);
        }
    }

    public ArrayList<Toy> getArray() {
        return toysArray;
    }

    @Override
    public String toString() {
        return "Toys:\n" + toysArray;
    }

}

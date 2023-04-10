package toys;

import java.util.concurrent.atomic.AtomicInteger;

public class Toy {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String name;
    private int item;
    private int weight;

    public Toy(String name, int item, int weight) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.item = item;
        this.weight = weight;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "id: " + id + "  name: " + name + "  item: " + item + "  weight: " + weight;
    }

}

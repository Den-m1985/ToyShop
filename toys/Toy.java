package toys;

public class Toy {

    protected int id;
    protected String name;
    protected int item;
    protected int weight;

    public Toy(String name, int item, int weight) {
        this.name = name;
        this.item = item;
        this.weight = weight;

    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "\nid: " + id + "  name: " + name + "  item: " + item + "  weight: " + weight;
    }
}

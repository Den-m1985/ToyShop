import factory.ToysFactory;
import toys.Toy;
import toys.ToysToArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toy> toysFactory = ToysFactory.createToys(5);  //создали рандомных 5 типов игрушек
        ToysToArray<Toy> toysToArray = new ToysToArray<>(toysFactory);
        Toy Winnie_the_Pooh = new Toy("Вини Пух",50, 50);
        toysToArray.addToy(Winnie_the_Pooh);
        System.out.println(toysToArray);

        System.out.println();
        System.out.println("рандомная игрушка");
        System.out.println(toysToArray.getRandomToy());
    }
}

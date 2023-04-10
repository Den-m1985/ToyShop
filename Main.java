import factory.ToysFactory;
import toys.Toy;
import toys.ToysToArray;
import writeFile.TextFileWriter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toy> toysFactory = ToysFactory.createToys(5);  //создали рандомных 5 типов игрушек
        ToysToArray<Toy> toysToArray = new ToysToArray<>(toysFactory);  //все игрушки в магазине
        ArrayList<Toy> toyArray = toysToArray.getArray();

        Toy Winnie_the_Pooh = new Toy("Вини Пух", 50, 50);  // добавили игрушку вручную
        Winnie_the_Pooh.setWeight(20);  // метод изменения веса
        toyArray.add(Winnie_the_Pooh);// добаляем в массив
        for (Toy toy : toyArray) {
            System.out.println(toy);
        }

        ArrayList<Toy> toysQueue = new ArrayList<>();// создали очередь на выдачу игрушек
        toysQueue.add(toysToArray.getRandomToy()); // добавляем рандомную игрушку в очередь
        toysQueue.add(toysToArray.getRandomToy());
        System.out.println("Очередь на выдачу: ");
        for (Toy x : toysQueue) {
            System.out.println(x);
        }

        TextFileWriter textFileWriter = new TextFileWriter("Issued_Toys.txt");
        // выдача игрушки
        if (toysQueue.size() != 0) {
            Toy IssuedToys = toysQueue.get(0); // возвращаем игрушку
            int item = IssuedToys.getItem(); // возвращаем кол-во
            IssuedToys.setItem(item - 1); // уменьшаем кол-во
            textFileWriter.writeToFile(IssuedToys.toString());   // записываем в файл
            toysQueue.remove(0);  // удаляем игрушку из очереди
        } else System.out.println("Нет очереди");

        System.out.println("Очередь после выдачи:");
        for (Toy queue : toysQueue) {
            System.out.println(queue);
        }

    }
}

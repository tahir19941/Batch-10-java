package arrayPractice;

import java.util.ArrayList;

public class ArraylistPractice3 {

ArrayList <String> car = new ArrayList<>();

ArrayList <Integer> model = new ArrayList<>();



public void carList() {
    car.add("Toyota");
    car.add("Honda");
    car.add("Nissan");
    car.add("Rickshaw");
    car.add("Leguna");

    System.out.println(car.get(3));

    int carSize = car.size();

    System.out.println(carSize);

    boolean empty = car.isEmpty();
    System.out.println(empty);

    car.add("public bus");

    car.remove(4); // remove item by the index number which count starts from 0.

    //System.out.println(car);

    for (int i = 0; i <= car.size() - 1; i++) {

        System.out.println(car.get(i));
    }
}

    public static void main(String[] args) {

        ArraylistPractice3 obj= new ArraylistPractice3();
        obj.carList();
}




}

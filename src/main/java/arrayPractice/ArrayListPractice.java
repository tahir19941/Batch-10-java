package arrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice  {


List <String> name = new ArrayList<>();    //we have to call List class and then we need to crate and object to call it also wee need to mention the data type while creating the object.

ArrayList <Integer> age= new ArrayList<>();

ArrayList <Float> hight = new ArrayList<>();



public void ArraylistDemo(){

    name.add("Ornob");

    name.add ("Fahid");

    name.add("Sabban");

    name.add("Rifat");

    System.out.println(name);

    boolean sabbanIsThere = name.contains("Sabban");

    System.out.println(sabbanIsThere);


    //for getting spesific name

    //System.out.println(name.get(2));


    //  (put diffent data on spesific index)

   // name.add(2,"Jubayer");

    //System.out.println(name);


   //name.remove(2);
    //or
   // name.remove("Sabban");

   // System.out.println(name);

    Collections.sort(name);  // it sorts data type by order alphabeticallhy or numerically.

    System.out.println(name);

    Collections.shuffle(name);   //it shaffles the data type.

    System.out.println(name);
}


    public static void main(String[] args) {
        ArrayListPractice obj = new ArrayListPractice();

        obj.ArraylistDemo();
    }

}

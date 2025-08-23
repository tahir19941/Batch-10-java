package arrayPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice2 {

ArrayList<Integer>age = new ArrayList<>();

ArrayList<Float> height = new ArrayList<>();





public void ageDemo(){

    age.add(20);
    age.add(25);
    age.add(45);

    System.out.println(age.set(1,30)); // modified item we can use set() methode and raffers to index number
    System.out.println(age);    // now it will show list in the console with modified elements.

    age.remove(1);


    System.out.println(age);

}



public void heightDemo (){


    height.add(5.5f);

    height.add(5.4f);

    height.add(5.11f);

    height.add(3.75f);

    height.add(4.75f);

    //for (int i =0; i<= height.size(); i++);


   // System.out.println(height.get(2));

    System.out.println(height.size());  // to find out how many elements in arraylist we need to use variable name.Size()
}

    public static void main(String[] args) {
        ArrayListPractice2 obj = new ArrayListPractice2();

        obj.heightDemo();

        //obj.ageDemo();




}





}

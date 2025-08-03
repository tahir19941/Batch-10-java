package arrayPractice;

public class ArrayDemo {


String [] name = {"Fahid","Arnob", "Samin","Bashir"};



public  void accessToArrey(){

    //System.out.println(name [0]);

   // System.out.println(name [1]);

    // System.out.println(name [2]);

   // System.out.println(name [3]);
    //or

    // System.out.println(name [name.length-1]);

    int lengthOfName = name.length;

   // System.out.println(lengthOfName);

   //(another way

    // System.out.println(name.length);


    for(int x = 0; x <= lengthOfName - 1; x++){

        System.out.println(name[x]);
    }







}


    public static void main(String[] args) {

        ArrayDemo obj = new ArrayDemo();


        obj.accessToArrey();
    }








}

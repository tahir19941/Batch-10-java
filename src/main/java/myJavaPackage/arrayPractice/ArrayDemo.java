package myJavaPackage.arrayPractice;

public class ArrayDemo {


String [] name = {"Fahid","Arnob", "Samin","Bashir"};





public  void accessToArrey(){

    //System.out.println(name [0]);

   // System.out.println(name [1]);

    // System.out.println(name [2]);

   // System.out.println(name [3]);
    //or

    // System.out.println(name [name.length-1]);

    int lengthOfName = name.length;   // when we need to see how many elements in the array we need to use variable name.length.

   // System.out.println(lengthOfName);

   //(another way

    // System.out.println(name.length);

//int a =0;
//while(a<=3){
    //System.out.println(name[a]);
    //a++;
//}



    for(int x = 0; x <= name.length - 1; x++){

        System.out.println(name[x]);
    }


}

public void evenOdd(){

    Integer [] number = {2,4,5,7,8,11,13};
    //System.out.println(number.length);
   // System.out.println(number[0]);
    int a = 0;

while(a<=6){

    System.out.println(number[a]);
    a++;
}


    }


    public static void main(String[] args) {

        ArrayDemo obj = new ArrayDemo();


        obj.accessToArrey();
       // obj.evenOdd();
    }








}

package homeWork;

public class OddEven {



/*

Write a Java program that checks whether a given number is even or odd using if-else.

Instructions:

Take a number as a variable as an integer.

Use the modulus operator % to determine if the number is even.

Print "Even" if the number is divisible by 2, otherwise print "Odd".

Sample Output:

Enter a number: 7
7 is an Odd number.


*/


public void myNumber(){


    int number = 30;

    if (number % 2 ==0){

        System.out.println("even");

    }

    else{

        System.out.println("odd");

    }





}
// or paramiter way



    public void myNumber2(int num) {


        if (num % 2 == 0) {


            System.out.println("even");

        }

        else{

            System.out.println("odd");

        }


    }
    public static void main(String[] args) {


        OddEven obj = new OddEven();

        obj.myNumber();       // veriable calling obj

        //obj.myNumber2(45);   //paramiter calling obj



}






}

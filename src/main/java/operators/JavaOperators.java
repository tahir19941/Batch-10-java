package operators;

import java.util.Scanner;

public class JavaOperators {

/*

java has few operators

Arethmatic operators = +, -, /, *

comparison / relational operators = >, <, >=, <=, ==, !=

Logical operators = and (&&), or (||)

Assignment operator = (=)




*/

    /**
     * this method is created by Fahid

     * purpouse of this method is practicing arithmatic operator

     */

public void arithmaticOperator(){

    int a = 20;

    int b =5;

    int result = a-b;

    if(result>0){  //conditional statement

        System.out.println((a > b) +" " +  result );
    }

else{

        System.out.println("invalid result" + result);


    }






}

// or (scanner way)

   public void arithmaticOperator2(){

       Scanner scan = new Scanner(System.in);

       int a =scan.nextInt();

       int b = scan.nextInt();


       int result= a-b;  // result is 10

       if (result>0){

           System.out.println(a>b);

       }

       else{

           System.out.println("invalid action" + result);

       }





   }



 public void comparisonOperator(){     //It returns only true and false


int age =25;



if (age >=18){

    System.out.println("you can vote");

}


else {

    System.out.println("you can not vote");
}




}


public void comparisonOperator2(){

    int a =25;
    int b =17;

    boolean result = a >= b;

    System.out.println(result);

}



public void logicalOperator(){

    // &&, ||

    int a = 20;

    int b = 9;

    int c = 30;

    boolean result =(a>b) && (b<c);






}




    public static void main(String[] args) {


        JavaOperators obj = new JavaOperators();

        obj.arithmaticOperator();

        //obj.arithmaticOperator2();

       // obj.comparisonOperator();

     // obj.comparisonOperator2();








}






}

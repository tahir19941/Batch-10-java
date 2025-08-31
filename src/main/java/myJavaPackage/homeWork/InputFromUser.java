package myJavaPackage.homeWork;

import java.util.Scanner;

public class InputFromUser {


public void grading(){

    Scanner scan = new Scanner(System.in);

    int score = scan.nextInt();



    if (score >= 90 && score <=100){

        System.out.println("Grade A");

    }



   else if (score >= 80 && score <=89){

        System.out.println("Grade B");

    }


   else if (score >= 70 && score <=79){

        System.out.println("Grade C");

    }

    else if (score >= 60 && score <=69){

        System.out.println("Grade D");

    }

else {

        System.out.println("Grade F");
}



}


    public static void main(String[] args) {

    InputFromUser obj = new InputFromUser();

    obj.grading();




    }













}

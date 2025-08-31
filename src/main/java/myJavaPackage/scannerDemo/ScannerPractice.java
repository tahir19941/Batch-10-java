package myJavaPackage.scannerDemo;

import java.util.Scanner;

public class ScannerPractice {


public void information(){


    Scanner scan = new Scanner ( System.in);





String name = scan.nextLine();


    System.out.println("my name is " +name);

    int  age = scan.nextInt();

    System.out.println("my age is " + age);

    boolean isStudent =scan.nextBoolean();

System.out.println("am i a student or not " + isStudent);


float myhight = scan.nextFloat();


    System.out.println("my hight is " + myhight);

}



    public static void main(String[] args) {



        ScannerPractice obj = new ScannerPractice();
        obj.information();



}









}

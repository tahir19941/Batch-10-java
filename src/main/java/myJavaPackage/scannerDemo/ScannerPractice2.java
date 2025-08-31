package myJavaPackage.scannerDemo;

import java.util.Scanner;

public class ScannerPractice2 {

    // public void information(String name, String profession) {

        //System.out.println("my name is " + name +"my profession is " + profession);



    public void information2(){


       // String name= "Fahid";

       // String profession= "IT student";

        Scanner obj = new Scanner(System.in);

      String name = obj.nextLine();

      String profession = obj.nextLine();

      int age = obj.nextInt();

      boolean isStudent= obj.nextBoolean();

      float hight = obj.nextFloat();

        System.out.print("my name is " + name + " and profession is " + profession);


        System.out.println(" I am " + age + "years old");


        System.out.println(" i am a full time student " + isStudent);

        System.out.println(" my hight is " + hight);


    }




    public static void main(String[] args) {

        ScannerPractice2 obj = new ScannerPractice2();

        obj.information2();



    }








}

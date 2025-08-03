package javaVeriablesDemo;

import org.w3c.dom.ls.LSOutput;

public class VeriablesDemo {

/* there are few types of variables

1. global variables (veriables inside the class called global veriables.

2. local variables ( class inside of methods called local variable)

3. static variables


note:

we cannot print out in the class only we can do inside the methods.

custom method can hold command but cannot run it.

only main method can hold and also run command.
 */


String model ="I phone 15";      //global variable (this variable stay in class)



public void stock(){

     short stockQuantity = 20000;        // custom method (local variable)

    System.out.println(stockQuantity);



   }



    public static void main(String[] args) {
        byte ramSize = 100;                       //main method (local variable)

        System.out.println(ramSize);









}
















}

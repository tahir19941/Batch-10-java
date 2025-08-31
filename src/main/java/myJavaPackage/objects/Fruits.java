package myJavaPackage.objects;

public class Fruits {



    String name;

    String taste;

    String colour;

    int price;



public void myFavorite(){


    System.out.println("i love this fruit so much");


}



public static void main(String[] args) {

 Fruits fevFruits = new Fruits();



 fevFruits.myFavorite();


 fevFruits.name = "Strawberry";

 fevFruits.colour = "red";

fevFruits.taste = "sweet";

fevFruits.price = 2;


    System.out.println("my favorite fruit is " + fevFruits.name + ".");

    System.out.println("the colour is my favorite fruit is " + fevFruits.colour +", " +  "\n it is my favorite colour also" + ".");

    System.out.println("my favorite fruit tastes " + fevFruits.taste);

    System.out.println("my favorite fruit costs " + fevFruits.price + " dollas per pound." );








}
















}

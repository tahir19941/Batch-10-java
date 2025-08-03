package objects;

public class Cats {

String name;

String colour;

byte legs;

int eyes;

boolean Is_goodCat;

boolean badCat;


public void catBehaviour(){

    System.out.println("cat always like to stay quite");



}



public void eatingHabit(){

    System.out.println("cat always like to eat mouse");



}


    public static void main(String[] args) {



Cats milo = new Cats();

Cats mimi = new Cats();



        milo.catBehaviour();

        milo.eatingHabit();

        mimi.catBehaviour();

        mimi.eatingHabit();




milo.name = "Milo";

milo.colour = "white";

milo.legs = 4;

milo.eyes = 2;

milo.Is_goodCat  = true;





        mimi.name = "Mimi";

        mimi.colour = "black";

        mimi.legs = 4;

        mimi.eyes = 2;

        mimi.badCat = false;


        System.out.println("my cats name is " + milo. name);

        System.out.println("my cat is " + milo.colour + " colour cat");

        System.out.println("he has " + milo.legs + " legs");

        System.out.println("he has " + milo.eyes + " eyes");

        System.out.println("my cat is a very good cat " + milo.Is_goodCat);


        System.out.println("......................................");


        System.out.println("my cats name is " + mimi. name);

        System.out.println("my cat is " + mimi.colour + " colour cat");

        System.out.println("she has " + mimi.legs + " legs");

        System.out.println("she has " + mimi.eyes + " eyes");

        System.out.println("my cat is a very good cat " + mimi.badCat);








    }




}

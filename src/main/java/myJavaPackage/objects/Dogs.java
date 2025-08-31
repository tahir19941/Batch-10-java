package myJavaPackage.objects;

public class Dogs {


String name;

String colour;

byte legs;

int eyes;

boolean isGood ;

boolean isBad ;



public void dog_Behaviour() {

    System.out.println("dog always bark and bite");


}

 public void safety(){


    System.out.println("dog is safe to have it protects your house");




}


    public static void main(String[] args) {


        Dogs pablo = new Dogs();

        Dogs tommy =new Dogs();


        pablo.dog_Behaviour();

        pablo.safety();

        System.out.println(".................................");

        tommy.dog_Behaviour();

        tommy.safety();


        pablo.name = "Pablo";

        pablo.colour = "White";

        pablo.legs = 4;

        pablo.eyes = 2;

        pablo.isGood = true;



        tommy.name ="Tommy";

        tommy.colour = "black";

        tommy.legs = 4;

        tommy.eyes = 2;

        tommy.isBad = false;


        System.out.println("my dog name is " + pablo.name );

        System.out.println("my dog is a " + pablo.colour +" colour dog" );

        System.out.println("my dog has " + pablo.eyes  +" eyes");

        System.out.println("my dog has " + pablo.legs +" legs");

        System.out.println("my dog is a good dog " + pablo.isGood);

        System.out.println("my dog is a bad dog " + pablo.isBad);



        System.out.println("..................................");



        System.out.println("my dog name is " + tommy.name );

        System.out.println("my dog is a " + tommy.colour +" colour dog" );

        System.out.println("my dog has " + tommy.eyes  +" eyes");

        System.out.println("my dog has " + tommy.legs +" legs");

        System.out.println("my dog is a good dog " + tommy.isGood);

        System.out.println("my dog is a bad dog " + tommy.isBad);











    }















}

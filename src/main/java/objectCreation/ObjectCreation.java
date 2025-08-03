package objectCreation;

public class ObjectCreation {


    String name;
    int id;
    String location;
    boolean isStudent;



public void study(){

    System.out.println("students study at home");


}

public void homework(){

    System.out.println("students bring homework in the class");


}


    public static void main(String[] args) {

    ObjectCreation object1 = new ObjectCreation();


        ObjectCreation john = new ObjectCreation();


        ObjectCreation rita = new ObjectCreation();

        john.study();

        john.homework();

        rita.homework();

        rita.study();


john.name ="John carlos";

john.id = 102;

john.location ="Boston";

john.isStudent = true;



rita.name = "RIta rahman";

rita.id = 104;

rita.location = "New York";

rita.isStudent = false;



        System.out.println("john full name is " + john.name);

        System.out.println("john id is " + john.id);

        System.out.println("john location is " + john.location);

        System.out.println("john is student or not " + john.isStudent);



        System.out.println(".....................................");


        System.out.println("Rita full name is " + rita.name);


        System.out.println("Rita's id is " + rita.id);


        System.out.println("Rita's location is " + rita. location);

        System.out.println("rita is a student " + rita. isStudent);









    }










}

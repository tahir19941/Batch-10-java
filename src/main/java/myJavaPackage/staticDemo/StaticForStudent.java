package myJavaPackage.staticDemo;

public class StaticForStudent {


    String name;
    int id;
    String location;
    static boolean isStudent = true;



    public void study(){

        System.out.println("students study at home");


    }

    public void homework(){

        System.out.println("students bring homework in the class");


    }


    public static void main(String[] args) {

        StaticForStudent layla = new StaticForStudent();


        StaticForStudent john = new StaticForStudent();


        StaticForStudent rita = new StaticForStudent();

        john.study();

        john.homework();

        rita.homework();

        rita.study();


        john.name ="John carlos";

        john.id = 102;

        john.location ="Boston";





        rita.name = "RIta rahman";

        rita.id = 104;

        rita.location = "New York";





        layla.name = "Layla hossain";

        layla.id = 103;

        layla.location = "dhaka";









        System.out.println("john full name is " + john.name);

        System.out.println("john id is " + john.id);

        System.out.println("john location is " + john.location);

        System.out.println("john is student or not " + john.isStudent);



        System.out.println(".....................................");


        System.out.println("rita's full name is " + rita.name);


        System.out.println("rita's id is " + rita.id);


        System.out.println("rita's location is " + rita. location);

        System.out.println("rita is a student " + rita. isStudent);




        System.out.println("............................................");




        System.out.println("Layla full name is " + layla.name);


        System.out.println("Layla's id is " + layla.id);


        System.out.println("Layla's location is " + layla . location);

        System.out.println("Layla is a student " + layla. isStudent);













    }










}






































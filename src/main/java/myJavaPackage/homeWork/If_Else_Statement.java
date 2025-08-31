package myJavaPackage.homeWork;

public class If_Else_Statement {

/*

Write a Java program to determine the grade based on a student's score using if-else.

Instructions:

Take an integer input from the user for the marks (0–100).

Use if-else to print the grade:

90–100 → A

80–89 → B

70–79 → C

60–69 → D

Below 60 → F ... Output;:::  if your score is 95, grade is A


*/



//public static void grading(int score) {   //if a custom mathod created in Static then we don't need to create any object in main mathod

public void grading(int score){



    if (score >= 90 && score <= 100) {

        System.out.println("grade A");

    } else if (score >= 80 && score <= 89) {


        System.out.println("Grade B");
    }

    else if (score >= 70 && score <= 79) {

        System.out.println("Grade C");

    }


    else if (score >= 60 && score <= 69) {

        System.out.println("Grade D");

    }


else {

        System.out.println("F");
    }


}

    public static void main(String[] args) {

        If_Else_Statement obj = new If_Else_Statement();


       obj.grading(96);
    }





}

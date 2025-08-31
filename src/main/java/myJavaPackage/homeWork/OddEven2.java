package myJavaPackage.homeWork;

public class OddEven2 {


public static void assignment(int a){

    if (a > 0){

        System.out.println(a +" is a positive number");



    }

else if (a < 0){

        System.out.println(a + " is a negative  number");

    }

else if (a==0){

        System.out.println(a + " is zero");

}




}


public static void leapYear(int year){

if (year % 4 ==0){

    System.out.println(" it is leap year");
}

else {

    System.out.println("it is not a leap-year");

}

}






public static void main(String[] args) {

    //assignment(0);

    leapYear(2026);


}














}

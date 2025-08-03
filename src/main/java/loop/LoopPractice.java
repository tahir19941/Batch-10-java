package loop;

public class LoopPractice {


public static void loopIntro(){


    int a= 1;

    while(a <= 10){

        System.out.println(a);

        a++;


    }




}

    public static void loopIntro2(){

    int a =50;

    while (a <= 70){

        System.out.println(" hello");

        a++;


    }


    }

public static void loopIntro3(){

    int a = 100;

    while(a >= 1){

        System.out.println("the value of a is "+ a );

        a--;


    }




}

public static void evenOdd() {

    // between 1-100  please determine which value is even and odd

    int a = 1;

    while (a <= 100) {


        if (a % 2 == 0) {

            System.out.println(a + " is an even number");

        } else {
            System.out.println(a + " is an odd number");
        }

        a++;

    }

}
    public static void main (String[]args){
         loopIntro();

        //loopIntro2();

        // loopIntro3();

        evenOdd();


    }

}


package loop;

public class LoopPractice3 {


public void print1_100(){

   int a = 1;
   while(a <=10){;
       //System.out.println(a);
      // System.out.println("Hello everyone");
       //System.out.println(a+ " hello everyone");

 //  a++;
   }

    if (a % 2 == 0) {

        System.out.println(a + " is an even number");
    }
    else {
        System.out.println(a + " is an odd number");
        a++;

    }

}


    public static void main(String[] args) {

        LoopPractice3 obj = new LoopPractice3();

        obj.print1_100();

}





}

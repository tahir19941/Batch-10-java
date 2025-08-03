package paramitersDemo;

public class ParamitersDemo1 {


public void addition(int a, int b, int d){


int c = a + b;
int e = b-d;

    System.out.println(c);

    System.out.println(e);






}



public void addition_2(int a, int b, int c){




    System.out.println(a+b-c);

}

    public static void main(String[] args) {


    ParamitersDemo1 obj = new ParamitersDemo1();


    obj.addition_2(10, 20,40);


    obj.addition(2, 4, 6);
//obj.addition(70,30, 50);



}













}

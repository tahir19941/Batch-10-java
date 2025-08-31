package myJavaPackage.paramitersDemo;

public class ParamitersDemo3 {



    public void add(int a, int b) {


        int c = a + b;

        System.out.println(c);

    }


        public void substraction(int d, int b){


            int e = d - b;


            System.out.println(e);



    }


    public static void main(String[] args) {



        ParamitersDemo3 obj= new ParamitersDemo3();

   obj.substraction(20, 30);

   obj.add(10, 30);
    }

















}

package myJavaPackage.finalKeywords;
/*
Final keyword can be used before class methods
and variables

1. if it is in before class so
we cannot extend that class.
(so cannot create any child class)

2. if it is before a method that means the method
cannot be override.

3. if it is under variable so
 we cannot change the value.
 */

public  class Final_1 {

    String schoolName="upright teach solution";

    public void add(int a, int b){
        System.out.println("i am learning addition in java");
    }

    public static void main(String[] args) {
        Final_1 obj =new Final_1();
        obj.schoolName="upright teach";
        System.out.println(obj.schoolName);

    }

}

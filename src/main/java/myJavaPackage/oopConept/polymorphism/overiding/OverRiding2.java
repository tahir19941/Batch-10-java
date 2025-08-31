package myJavaPackage.oopConept.polymorphism.overiding;

public class OverRiding2 extends Animal {
    /**
     * created by Fahid on 08/17/2025
     * // "always we need to mention when is the code
     * created and who creates it".

     * @param sound
     */

    @Override     // whenever we change someone's created code we need to use override.
    public void animalSound(String sound){

        String dog ="tommy";

        System.out.println("tommy's sound is " + sound);


        System.out.println(sound);
    }

    public static void main(String[] args) {
        OverRiding2 obj = new OverRiding2();
        obj.animalSound("Berk");
    }



}

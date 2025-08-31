package myJavaPackage.oopConept.polymorphism.overiding;

public class Animal {

    /**
     * purpose
     * created by Fahid
     */

public void animalSound(String sound){

    System.out.println(sound);
}

    public static void main(String[] args) {
        Animal obj =new Animal();

        obj.animalSound("meaw");
    }
}

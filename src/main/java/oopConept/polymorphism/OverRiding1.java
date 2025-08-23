package oopConept.polymorphism;

public class OverRiding1 {

public void animal(String sound){

    System.out.println(sound);
}

    public static void main(String[] args) {
        OverRiding1 obj =new OverRiding1();

        obj.animal("meaw");
    }
}

package myJavaPackage.oopConept.polymorphism.overloading;

public class MethodOverloading2 {

public void login(String username, String password){
    System.out.println("Amazon Login");

}

public void login(String userName, int pin){
    System.out.println("Macy's login");

}
public void login(String userName, int pin, String password){
    System.out.println("Walmart login");

}
    public static void main(String[] args) {

    }
}

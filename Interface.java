//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not the method body. It is used to achieve abstraction and multiple inheritances in Java using Interface.

// final key word uses
// in variables to create constant variables
// in methods to prevent method overridding
// in classes to prevent class inheritance

public interface Interface {

    // declare constant fields
    // declare methods that abstract 
    
    public final static String a = "Hello";
    public void PrintHello(String a);   

    public static void main(String[] args) {
        Do d = new Do();
        d.PrintHello(Interface.a);
    }

}

class Do implements Interface{

    public void PrintHello(String x){
        System.out.println(x + " World!");
    }    
}

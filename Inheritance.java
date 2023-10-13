class A {
    void display1() {
        System.out.println("A");
    }
}

class B extends A {
    void display2() {
        System.out.println("B");
    }
}

class C extends B {
    void display3() {
        System.out.println("C");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.display1();
        objB.display2();
        objC.display3();

        objB.display1();
        objC.display1();

    }

}

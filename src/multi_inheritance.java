package src;
class A {
    public void method() {
        System.out.println("Class A");
    }
}


class B {
    public void main() {
        System.out.println("Class B");
    }
}

public class multi_inheritance extends A {
    public static void main(String[] args) {
        System.out.println("Hello world");
        A a = new A();
        a.method();
    }
}
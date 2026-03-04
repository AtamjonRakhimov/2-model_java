package pdpuz;

public class Parent {
    Parent() {
        print();
    }

    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    private int x = 10;

    Child() {
        x = 20;
    }

    @Override
    void print() {
        System.out.println(x);
    }
}

public class Test{
    public static void main(String[] args) {
        new Child();
    }
}

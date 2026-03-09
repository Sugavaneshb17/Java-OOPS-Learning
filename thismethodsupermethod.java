class A {
    public A() {
        // super();
        System.out.println("A constructor without Parameter");
    }

    public A(int n) {
        // super();
        System.out.println("A constructor with Parameter");
    }
}

class B extends A {
    
    public B() {
        // super(5);
        System.out.println("B constructor without Parameter");
    }
    public B(int n) {
        super();
        // this();
        System.out.println("B constructor with Parameter");
    }
}

public class thismethodsupermethod extends B { // CONSTRUCTOR CHAINING
    public static void main(String[] args) {
        B obj = new B(5);
        System.out.println();
        //B obj1 = new B(5);
        System.out.println();


        //B obj2 = new B(5);
        

    }
}

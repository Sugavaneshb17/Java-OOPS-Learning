class Parent {
    public void show1() {
        System.out.println("In parent class ");
    }
}

class Child1 extends Parent {
    public void show2() {
        System.out.println("In child1 class ");
    }
}


public class upcastingdowncasting {
    public static void main(String[] args) {
        Parent obj = new Child1(); // Upcasting same as dynamic method dispatch
        obj.show1();
        
        Child1 obj1 = (Child1) new Child1(); // downcasting
        obj1.show2();
    }
}

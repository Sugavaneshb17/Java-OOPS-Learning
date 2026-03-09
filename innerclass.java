class Cse {
    public void display() {
        System.out.println("Welcome to CSE Department");
    }

    class CsIt { // inner class can be static -> static CsIt {}
        public void display1() {
            System.out.println("Welcome to IT section in CSE Department");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        Cse obj = new Cse();
        obj.display();
        Cse.CsIt obj1 = obj.new CsIt();
        // if inner class is static
        // Cse.CsIt obj1 = new Cse.CsIt();

        obj1.display1();
    }
}

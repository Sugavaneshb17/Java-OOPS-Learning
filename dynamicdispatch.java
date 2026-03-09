class Ant {
    public void show() {
        System.out.println("A Show");
    }
}

class Bat extends Ant {
    public void show() {
        System.out.println("B Show");
    }
}

class Cat extends Bat {
    public void show() {
        System.out.println("C Show");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        Ant obj = new Ant();
        obj.show();

        obj = new Cat();
        obj.show();


    }
}

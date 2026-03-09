class Bike {

    int bikenum = 17;

    public void horn() {
        System.out.println("Sound");
    }

    public void speed() {
        System.out.println("Speed");
    }
}

class Superbike extends Bike { // multilevel inheritance
    public void horn() {
        System.out.println("More Sound" + bikenum);
        speed();
    }
}

public class inheritance extends Superbike { // multilevel inheritance
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        Superbike obj1 = new Superbike();
        obj.horn(); // Method overriding is done so more sound is output
        obj1.speed();
    }
}

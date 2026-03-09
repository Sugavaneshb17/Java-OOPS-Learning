abstract class Cars {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

abstract class Thar extends Cars {
    public void drive() {
        System.out.println("Driving  Mahindra Thar");
    }
}

class FlyingThar extends Thar {
    public void fly() {
        System.out.println("Thar can fly");
    }
}

public class abstractkkeyword {
    public static void main(String[] args) {
        Cars obj = new FlyingThar();

        obj.drive();
        obj.fly();
        obj.playMusic();
    }
}

interface Cardesign {
    void fuelcharge();

    void solarcharge();
}

class Engineer implements Cardesign {
    public void fuelcharge() {
        System.out.println("Petrol or Electric fuel");
    }

    public void solarcharge() {
        System.out.println("Solar panels attached for charging the car");
    }
}

class Designer implements Cardesign {
    public void fuelcharge() {
        System.out.println("Efficient Petrol Tank ");
    }

    public void solarcharge() {
        System.out.println("Solar panels Design");
    }
}

public class Interfaceprogram {
    public static void main(String[] args) {
        Cardesign obj;
        obj = new Engineer();
        obj.fuelcharge();
        obj.solarcharge();

        Cardesign obj1 = new Designer();
        obj1.fuelcharge();
        obj1.solarcharge();
    }
}

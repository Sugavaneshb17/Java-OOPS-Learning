enum Level {
    Low,
    High;
}

public class Enumprog1 {
    public static void main(String[] args) {
        Level l = Level.High;
        System.out.println(l);
        System.out.println(l.ordinal());
        Level[] ll = Level.values();

        for (Level i : ll) {
            System.out.println(i + ":" + i.ordinal());
        }

        switch (l) {
            case Low:
                System.out.println("OFF");
                break;
            case High:
                System.out.println("ON");
                break;
        }
    }
}

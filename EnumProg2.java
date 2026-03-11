enum Grade {
    S, A(95), B(90), C(80), D(70);

    private int mark;

    private Grade(int mark) {
        this.mark = mark;
        System.out.println("GOOD");
    }

    private Grade() {
        this.mark = 100;
        System.out.println("EXCELLENT");
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}

public class EnumProg2 {
    public static void main(String[] args) {
        Grade[] gg = Grade.values();

        for (Grade g : gg) {
            System.out.println(g + " " + g.getMark());
        }

        Grade x = Grade.S;
        System.out.println(x);
    }
}

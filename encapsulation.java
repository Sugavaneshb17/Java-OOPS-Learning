class human {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}


public class encapsulation {
    public static void main(String a[]) {
        human obj = new human();

        obj.setAge(20);
        obj.setName("Suga");

        System.out.println("AGE: " + obj.getAge());
        System.out.println("NAME: " + obj.getName());

    }
}

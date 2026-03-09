class Computer {
    static int num = 17;
    int brandnum;

    public void show() {
        
        System.out.println("Non static method");
        System.out.println("");
    }
    public static void show1(Computer obj) {
        
        System.out.println(" static method");
        System.out.println(obj.brandnum); // non static variable can be called by passing the object reference
        System.out.println(num);  
        
    }
}


public class staticmethodvariable {
    public static void main(String a[])
    {
        Computer obj1 = new Computer();
        Computer obj2 = new Computer();

        obj1.show();
        obj2.show();
        obj1.brandnum = 11;
        
        Computer.show1(obj1);
        String str = "suga";
        
    }
}

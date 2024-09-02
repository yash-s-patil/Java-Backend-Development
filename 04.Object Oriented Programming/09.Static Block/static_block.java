class Mobile {
    String brand;
    int price;
    // common variable which will be used for all the objects, if changed for one object other object variable "name" will also be affected because they are pointing to one static variable only
    static String name;

    // static variable should be initialized only once using static block, when the class loads.
    static {
        name = "Phone";
        System.out.println("Static block called");
    }


    // constructor - initialize the variable when object is created, we can assign default value here which will initialize when object is created
    // constructor is called every time when object is created
    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("Constructor block called");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

class Static_Variable {
    public static void main(String[] args) throws ClassNotFoundException {

        // load class even when the object is not created, when the class loads static block is called. By default class loads when the object is created but only once, and then the constructor is called
        Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        // obj1.price = 1500;
        // static variable are called using class name
        // Mobile.name = "SmartPhone";

        obj1.show();
        Mobile obj2 = new Mobile();
        obj2.show();
    }
}
class Mobile {
    String brand;
    int price;
    // common variable which will be used for all the objects, if changed for one object other object variable "name" will also be affected because they are pointing to one static variable only
    static String name = "SmartPhone";

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
    // directly static method cannot access instance variable, but indirectly if we pass object then we can access instance variable of that object.
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

class static_method {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // static variable are called using class name
        // Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        // we can call static method using class name
        Mobile.show1(obj1);
    }
}
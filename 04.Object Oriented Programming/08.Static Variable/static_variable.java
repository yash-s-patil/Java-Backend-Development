class Mobile {
    String brand;
    int price;
    // common variable which will be used for all the objects, if changed for one object other object variable "name" will also be affected because they are pointing to one static variable only
    static String name = "SmartPhone";

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

class Static_Variable {
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
    }
}
class Laptop {
    String model;
    int price;

    // whenever we print an obj it calls toString method, if we do not specify here, it wil call from parent class - Object class
    // we can use generate tab to generate toString Method
    public String toString() {
        return model + " : " + price;
    }

    // we can use generate tab to generate hashcode and equals method
    public boolean equals(Laptop that) {
        if(this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }


}

class ObjectClass {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        System.out.println(obj);

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;
        System.out.println(obj2);

        boolean result = obj.equals(obj2);
        System.out.println(result);
    }
}
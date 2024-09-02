class A {
    public A() {
        System.out.println("Object Created");
    }
    public void show() {
        System.out.println("in A show");
    }
}

class Anonymous_Object {
    public static void main(String[] args) {
        new A().show(); // anonymous object
    }
}
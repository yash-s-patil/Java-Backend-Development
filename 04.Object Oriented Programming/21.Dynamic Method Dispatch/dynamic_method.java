class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        // Dynamic method dispatch - Which method it will call we are not sure at compile time, it will be decided at runtime. So this is runtime polymorphism.
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
}
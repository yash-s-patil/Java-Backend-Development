class A {
    public A() {
        super();
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B() {
        // every constructor in java has a super method even if we dont mention. It means call the constructor of super class.
        super();
        System.out.println("In B");
    }
    public B(int n) {
        // if we dont mention the parameter and only use super() then it will call the default constructor of the super class.
        super(n);
        // if we want to execute the constructor of same class we use this keyword. this will call default constructor of same class.
        // this();
        System.out.println("In B int");
    }
}

class this_and_super {
    public static void main(String[] args) {
        // obj will call constructor of both base class and super class.
        B obj = new B(5);
    }
}
// final keyword can be used with variables, method, class

// once we make our class final, no other class can inherit from final class, We are stopping inheritance
final class Calc {
    // when we make the method final, no one can override it.
    public final void show() {
        System.out.println("in Calc show");
    }
    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Final_Keyword {
    public static void main(String[] args) {
        // to make variable constant we use final keyword
        final int num = 5;
        // num = 6; // error - cannot reassign value to final variable.
        Calc obj = new Calc();
        obj.show();
        obj.add(3, 4);
    }
}
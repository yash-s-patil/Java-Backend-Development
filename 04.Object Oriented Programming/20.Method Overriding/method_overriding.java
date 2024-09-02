class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    // method overiding - This method overrides the add method in the parent class.
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

class Method_Overriding {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(3, 5);
        System.out.println(r1);
    }
}
class Calculator {
    int a;
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

class methodOverloading {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 9;
        int num3 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2, num3);
        System.out.println(result);
    }
}
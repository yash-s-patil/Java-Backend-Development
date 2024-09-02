class literals {
    public static void main(String[] args) {
        // int literal
        int num1 = 9;
        num1 = 585176;

        num1 = 0b101; // binary format
        System.out.println(num1); // 5

        num1 = 0x7E; // hexadecimal format
        System.out.println(num1); // 126

        num1 = 10_00_00_000;
        System.out.println(num1); // 100000000

        //double literal
        double num2 = 56;
        System.out.println(num2); // 56.0

        num2 = 12e10;
        System.out.println(num2); // 1.2E11

        // char literals
        char c = 'a';
        c++;
        System.out.println(c); //b
    }
}
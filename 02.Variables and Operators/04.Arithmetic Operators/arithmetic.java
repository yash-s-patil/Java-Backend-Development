class arithmeticOperators {
    public static void main(String a[]) {
        int num1 = 7;
        int num2 = 5;
        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;

        num1 += 2;
        num1 -= 2;
        num1 *= 8;

        num1++; // post-increment
        num1--; // post-decrement
        ++num1; // pre-increment
        --num1; // pre-decrement

        int number = 20;
        // run any one condition
        int res2 = number++; // first fetch value of number then increment
        System.out.println(res2); // 20
        System.out.println(number); //21

        int res1 = ++number; // first increment then fetch the value
        System.out.println(res1); // 21

        System.out.println(number); // 21
    }
}
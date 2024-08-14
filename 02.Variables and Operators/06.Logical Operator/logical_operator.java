class logicalOperator {
    public static void main (String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // && - And operator - true only if both conditions are true
        boolean result = x > y && a < b;
        System.out.println(result);

        // || - Or operator - true if any one condition is true
        boolean result2 = x > y || a > b;
        System.out.println(result2);

        // Not operator - !true is false and !false is true
        boolean result3 = a > b;
        System.out.println(!result3);
    }
}
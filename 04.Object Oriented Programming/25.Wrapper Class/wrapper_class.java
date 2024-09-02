class Wrapper_Class {
    public static void main(String[] args) {
        int num = 7;
        // assign primitive value to object. - autoboxing
        // internally -> Integer num1 = new Integer(num);
        Integer num1 = num;
        System.out.println(num1);

        // Assign object value to primitive value again - auto unboxing
        // internally -> int num2 = num1.intValue(num1);
        int num2 = num1;
        System.out.println(num2);

        // Convert string value to integer
        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3 * 2);
    }
}
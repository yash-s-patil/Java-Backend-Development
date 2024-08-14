class typeConversionandCasting {
    public static void main (String a[]) {
        byte b = 127;
        System.out.println(b);

        // assign byte value to integer - possible
        int c = b;
        System.out.println(c);

        // assign integer to byte - possible but only through type casting
        int d = 121;
        byte e = (byte) d;
        System.out.println(e);

        // assign integer to byte (greater than 127) - possible but only through type casting - performs modulus - if the modulus answer is not in range (-128 to 127 ) then add or subtract 256 to bring it in range
        int f = 312; // 312 % 256 - remainder 56
        int g = (byte) f;
        System.out.println(g); // 56

        // assign float to integer - possible through type casting
        float h = 5.23f;
        int i = (int) h;
        System.out.println(i);

        // type promotion
        byte j = 10;
        byte k = 30;
        int result = j * k;
        System.out.println(result);
    }
}
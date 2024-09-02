class inheritance {
    public static void main(String args[]) {
        Calc obj = new Calc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);

        AdvCalc obj1 = new AdvCalc();
        int r3 = obj1.add(2, 3);
        int r4 = obj1.multiply(4, 7);
        int r5 = obj1.division(4, 1);
        System.out.println(r1 + " : " + r2);
        System.out.println(r3 + " : " + r4 + " : " + r5);

        Scientific obj2 = new Scientific();
        int r6 = obj2.add(2, 3);
        int r7 = obj2.multiply(4, 7);
        double r8 = obj2.power(3, 3);
        System.out.println(r6 + " : " + r7 + " : " + r8);
    }
}
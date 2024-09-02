// multilevel inheritance - Scientific class extends AdvCalc and AdvCalc extends Calc. So Scientific class will have access to both AdvCalc and Calc methods.

class Scientific extends AdvCalc{
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}
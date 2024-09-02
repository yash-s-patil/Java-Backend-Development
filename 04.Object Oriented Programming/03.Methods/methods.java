class Computer {
    public void playMusic() {
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost) {
        if (cost >= 10 )
            return "Pen";
        return "No Pen";
    }
}

class methods {
    public static void main(String args[]) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(40);
        System.out.println(str);
    }
}
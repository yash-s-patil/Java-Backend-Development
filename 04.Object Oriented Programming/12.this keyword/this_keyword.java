// this keyword represent the current object
class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

}

class this_keyword {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(24);
        obj.setName("Ravi");


        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}

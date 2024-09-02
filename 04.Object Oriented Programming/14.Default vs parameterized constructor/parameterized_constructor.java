// this keyword represent the current object
class Human {

    private int age;
    private String name;

    // default constructor
    public Human() {
        age = 12;
        name = "Kevin";
    }

    // parameterized constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

class parameterized_constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj2 = new Human(18, "Navin");
        System.out.println(obj.getAge() + " : " + obj.getName());
        System.out.println(obj2.getAge() + " : " + obj2.getName());
    }
}

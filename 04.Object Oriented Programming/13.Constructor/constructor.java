// this keyword represent the current object
class Human {

    private int age;
    private String name;

    // constructor - constructor is called when an object is created, using constructor we can assign default value to the variables in a object.
    public Human() {
        age = 12;
        name = "Kevin";
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

class constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}

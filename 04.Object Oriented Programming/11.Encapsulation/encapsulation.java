class Human {
    // whenever me make variable private, only the method from the same class can access the variable directly. From outside you cannot directly access the variable, you have to access it using method.
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setName(String n) {
        name = n;
    }

}

class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        // assign the value using method
        obj.setAge(24);
        obj.setName("Ravi");

        // getting value using method
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}

// Encapsulation - Binding the data and method together, so that no one from outside world can directly access the data, they can access it only through method
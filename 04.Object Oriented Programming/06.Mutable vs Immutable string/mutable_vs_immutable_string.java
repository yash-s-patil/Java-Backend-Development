// By default String are immutable - cannot be changed.
class immutableString {
    public static void main (String[] args) {
        String name = "Yash"; // in string constant pool an object is created and name gets a particular address
        name = name + " Patil"; // different object is created with data Yash Patil and its address is updated for name varible. name is not directly changed, a new object is created, because strings are immutable
        System.out.println("Hello " + name);

        String s1 = "Java"; // in string constant pool in heap an object is created with "Java" and its address is assigned to s1 variable in stack memory
        String s2 = "Java"; // as "Java" is already present in string constant pool no new object is created and its address is also assigned to s2 variable in stack memory,
        // so s1 and s2 both are pointing to the same memory address in heap memory
        System.out.println(s1 == s2);// true - because both are pointing to the same memory address in heap memory
    }
}
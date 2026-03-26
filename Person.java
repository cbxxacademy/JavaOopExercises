// Example of a Person class.
// Demonstrates encapsulation: data is private, accessed through public methods
class Person {
    
    // Private fields (instance variables) can only be accessed within this class
    private String name;
    private int age;
    
    // Constructor - initializes a new Person object
    public Person(String name, int age) {   // Constructor Parameters
        this.name = name;  // 'this.name' refers to the instance variable
        this.age = age;    // 'age' (without 'this') refers to the parameter
    }

    // Getter - returns the person's name
    public String getName() {
        return name;
    }
    
    // Getter - returns the person's age
    public int getAge() {
        return age;
    }

    // Note: Getters provide safe access to private fields from outside the class
}
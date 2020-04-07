package Lesson18StreamApi;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public CharSequence getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

package model;

public class Student {
    //-------------------ATTRIBUTES--------------------------
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    //----------------GETTERS/SETTERS-----------------------
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //--------------CUSTOM METHODS-----------------------------
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

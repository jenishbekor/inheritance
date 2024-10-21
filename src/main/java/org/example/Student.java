package org.example;

public final class Student extends Person{
    private int studentID;
    private String group;

    public Student() {
    }

    public Student(String name, String surname, String email, int age, int studentID, String group) {
        super(name, surname, email, age);
        super.setAge(age);
        this.studentID = studentID;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
/*
    @Override
    public static void introduce() {
        System.out.println("Hi, I am a student, my name is "+ this.name);
    }

 */
}

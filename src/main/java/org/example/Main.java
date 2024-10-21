package kg.alatoo;

import org.example.Person;
import org.example.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("CCC","DDD","email",23);
        person.introduce();

        Student st= new Student("AAA", "BBB", "email", 20, 12324, "COM");
        System.out.println(st);
        st.introduce();




    }

}
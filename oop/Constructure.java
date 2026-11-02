package oop;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Constructure {
    public static void main(String[] args) {
        Student stu=new Student("Sourav");
        System.out.println(stu.name);
    }
}

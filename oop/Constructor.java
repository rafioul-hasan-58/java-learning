package oop;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student stu=new Student("Sourav");
        System.out.println(stu.name);
    }
}

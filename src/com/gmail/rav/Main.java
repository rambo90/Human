package com.gmail.rav;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John", "Dilhan", "male", 25, 85, 185, "БМ", "Автомеханический", 2);
        Group group = new Group(student.getGroup());

        group.addStudent(student);
        group.addStudent(new Student("Bob", "Smith", "male", 24, 80, 180, "БМ", "Автомеханический", 2));
        group.addStudent(new Student("Pole", "Neo", "male", 25, 76, 183, "БМ", "Автомеханический", 2));
        group.addStudent(new Student("Kate", "Box", "female", 26, 100, 195, "БМ", "Автомеханический", 2));
        group.addStudent(new Student("Eric", "Stallone", "male", 27, 85, 175, "БМ", "Автомеханический", 2));
        group.addStudent(new Student("Cole", "Norris", "male", 24, 70, 165, "БМ", "Автомеханический", 2));
        group.addStudent(new Student("Kenny", "Morpheus", "male", 25, 95, 190, "БМ", "Автомеханический", 2));
        group.addStudent(new Student("Kile", "Brown", "male", 28, 90, 185, "БМ", "Автомеханический", 2));
//            group.addStudent(new Student("Kile", "Brown", "male", 28, 90, 185, "БМ", "Автомеханический", 2));

        System.out.println(group);
        group.select("Norris");
        group.sort();
        System.out.println(group);

    }

}
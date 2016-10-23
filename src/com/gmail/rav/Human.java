package com.gmail.rav;

public class Human {
    private String name;
    private String surname;
    private String sex;
    private int age;
    private int weight;
    private int height;

    public Human(String name, String surname, String sex, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  name + " " + surname + " " + age;
    }
}
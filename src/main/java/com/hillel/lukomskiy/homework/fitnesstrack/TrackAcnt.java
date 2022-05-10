package com.hillel.lukomskiy.homework.fitnesstrack;

public class TrackAcnt {


    private String name;
    private int day;
    private int month;
    private int year;
    private String email;
    private String phone;


    private String surname;
    private int weight;
    private int press;
    private int steps;
    int age;

    int yeartoday = 2022;

    TrackAcnt(String name, int day, int month,
              int year, String email, String phone,
              String surname, int weight, int press, int steps) {

        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phone = phone;

        this.surname = surname;
        this.weight = weight;
        this.press = press;
        this.steps = steps;
        this.age = yeartoday - year;

    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPress() {
        return press;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPress(int press) {
        this.press = press;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }


    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return ("InformationAcnt - "
                + this.name + " "
                + this.day + "."
                + this.month + "."
                + this.year + " "
                + "email " + this.email + " "
                + "phone " + this.phone + " "
                + this.surname + " "
                + "weight " + this.weight + " "
                + "press " + this.press + " "
                + "stepsByDay " + this.steps + " "
                + "age " + this.age);
    }
}

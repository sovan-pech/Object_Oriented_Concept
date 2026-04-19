package Gym.Base;

import Gym.Enum.Gender;

public abstract class Person {
    protected String name;
    protected Gender gender;
    protected int age;
    protected String phoneNumber;
    public Person(String name, Gender gender, int age, String phoneNumber){
        this.name=name;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    protected abstract void viewInfo();

}

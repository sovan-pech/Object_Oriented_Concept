package Gym.Base;

import Gym.Enum.Gender;

public abstract class Person {
    protected String name;
    protected Gender gender;
    protected int age;
    protected String phoneNumber;

    //constructor
    public Person(String name, Gender gender, int age, String phoneNumber){
        this.name=name;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    //getter
    public String getName()       { return name; }
    public int getAge()           { return age; }
    public Gender getGender()     { return gender; }
    public String getPhoneNumber(){ return phoneNumber; }

    @Override
    public String toString() {
        return String.format(
                """
                Name            :%s
                Age             :%d
                Gender          :%s
                Phone Number    :%s
                Role            :%s
                Salary          :%.2f
                """,
                getName(), getAge(), getGender(), getPhoneNumber()
        );
    }
}

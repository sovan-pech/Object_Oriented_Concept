package Gym.Base;

import Gym.Enum.Gender;

public abstract class Person {
    protected String name;
    protected Gender gender;
    protected int age;
    protected String phoneNumber;
    private int count=1;
    private  String ID;

    //constructor
    public Person(String name, int age, Gender gender, String phoneNumber){
        this.ID = "P-"+count++;
        this.setName(name);
        this.setGender(gender);
    //getter
        this.phoneNumber=phoneNumber;
        this.setAge(age);
    }
    //setter

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
                """,
                getName(), getAge(), getGender(), getPhoneNumber()
        );
    }
}

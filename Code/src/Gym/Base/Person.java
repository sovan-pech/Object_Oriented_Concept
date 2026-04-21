package Gym.Base;

import Gym.Enum.Gender;
import Gym.User.Staff;

public abstract class Person {
    protected String name;
    protected Gender gender;
    protected int age;
    protected String phoneNumber;
    private int count=1;
    static int ID=1;

    //constructor
    public Person(String name, Gender gender, int age, String phoneNumber){
        this.ID = count++;
        this.setName(name);
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    //setter
    private void setName(String name){
        if(name!=null && !name.isBlank()){
            this.name=name;
        }
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
                """,
                getName(), getAge(), getGender(), getPhoneNumber()
        );
    }
}

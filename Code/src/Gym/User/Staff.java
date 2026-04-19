package Gym.User;

import Gym.Enum.Gender;
import Gym.Base.Person;

import java.util.UUID;

public class Staff extends Person { // be able to manage members add and delete , manage plan,
    private String  ID;
    private String role;
    private Double salary;
    public Staff(String name, int age, Gender gender, String phoneNumber, String role, Double salary){
        this.ID="ST-"+ UUID.randomUUID().toString().substring(0,3);
        super(name, gender, age, phoneNumber);
        this.role= role;
        this.salary=salary;
    }
    // accessor
    public String getName(){
        return this.name;
    }
    public String getRole(){
        return  this.role;
    }
    protected  void setRole( String role ){
        this.role=role;
    }
    // helper
    @Override
    protected void viewInfo() {

    }
}

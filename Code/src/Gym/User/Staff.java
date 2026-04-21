package Gym.User;

import Gym.Enum.Gender;
import Gym.Base.Person;

import java.util.UUID;

public class Staff extends Person { // be able to manage members add and delete , manage plan,
    private String  ID;
    private String role;
    private Double salary;
    //constructor
    public Staff(String name, int age, Gender gender, String phoneNumber, String role, Double salary){
        super(name, gender, age, phoneNumber);
        this.ID="ST-"+ UUID.randomUUID().toString().substring(0,3);
        this.role= role;
        this.salary=salary;

    }
    // accessor
    //setter
    protected void setName(String name){
        super.name=name;
    }
    protected  void setSalary( Double salary){
        if(salary > 0){
            this.salary=salary;
        }
        else{
            this.salary=0.0;
        }
    }
    protected  void setRole( String role ){
        this.role=role;
    }
    //getter
    public  String getRole() {
        return this.role;
    }
    public Double getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("""
                ----------------------------------
                        STAFF INFORMATION
                ----------------------------------
                ID              : %s
                Name            : %s
                Age             : %d
                Gender          : %s
                Phone Number    : %s
                Role            : %s
                Salary          : $%.2f
                ----------------------------------
                """,this.ID,
                super.getName(),
                super.getAge(),
                super.getGender(),
                super.getPhoneNumber(),
                this.role,
                this.salary);
    }
    public void updateMembers(){

    }




}

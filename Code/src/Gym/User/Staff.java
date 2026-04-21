package Gym.User;

import Gym.Enum.Gender;
import Gym.Base.Person;

import java.util.UUID;

public class Staff extends Person {
    private final String  ID;
    private String role;
    private Double salary;
    //constructor
    public Staff(String name, int age, Gender gender, String phoneNumber, String role, Double salary){
        super(name, gender, age, phoneNumber);
        this.ID="ST-"+ UUID.randomUUID().toString().substring(0,3);
        this.setRole(role);
        this.setSalary(salary);
    }
    // accessor
    protected void setRole(String role) {
        if (role != null && !role.isEmpty())
            this.role = role;
    }

    protected void setSalary(Double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            this.salary = 0.0;
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

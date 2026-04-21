package Gym.User;

import Gym.Enum.Gender;
import java.util.ArrayList;
import java.util.UUID;

public class Admin extends Staff {
    private ArrayList<Staff> staffList = new ArrayList<>();
    private String ID;

    // constructor
    public Admin(String name, int age, Gender gender, String phoneNumber, String role, Double salary) {
        super(name, age, gender, phoneNumber, role, salary);
        this.ID = "AD-"+ UUID.randomUUID().toString().substring(0,3);
    }
    // accessor
    private void setStaffName(String name){

        super.setName(name);
    }
    private void setStaffSalary(Double salary){
        super.setSalary(salary);
    }



    @Override
    public String toString() {
        return  String.format(
                """
                        ----------------------------------
                                Admin INFORMATION
                        ----------------------------------
                        ID              : %s
                        Name            : %s
                        Age             : %d
                        Gender          : %s
                        Phone Number    : %s
                        Role            : %s
                        Salary          : $%.2f
                        ----------------------------------
                        """,
                this.ID,
                getName(),      // Using getters is safer than super.name
                getAge(),
                getGender(),
                getPhoneNumber(),
                super.getRole(),
                super.getSalary()
        );
    }
    private void addStaff(){
        System.out.println("------------Menu-----------");
    }
    private  void updateStaff(){
    }
}


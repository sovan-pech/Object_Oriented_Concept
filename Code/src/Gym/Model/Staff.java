package Gym.Model;

import Gym.Enum.Gender;
import Gym.Base.Person;

public class Staff extends Person  {
    private static int count = 0;
    private String role;
    private Double salary;

    // constructor
    public Staff(String name, int age, Gender gender, String phoneNumber, String role, Double salary) {
        super(name, age, gender, phoneNumber);
        super.ID = "ST" + (++count);
        this.setRole(role);
        this.setSalary(salary);
    }

    // accessor
    public String getRole() {
        return this.role;
    }

    public Double getSalary() {
        return this.salary;
    }

    public String getID() {
        return ID;
    }

    protected void setRole(String role) {
        if (role == null || role.isBlank()) {
            System.out.println("Role is null! set to Cashier as default");
            this.role="Cashier";
            return;
        }
        this.role = role;
    }

    protected void setSalary(Double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            this.salary = 0.0;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setGender(Gender gender) {
        super.setGender(gender);
    }


    // display information 
    @Override
    public void displayInfo() {
        System.out.println(this.toString()); // use this output
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
                """, this.ID,
                super.getName(),
                super.getAge(),
                super.getGender(),
                super.getPhoneNumber(),
                this.role,
                this.salary);
    }
}

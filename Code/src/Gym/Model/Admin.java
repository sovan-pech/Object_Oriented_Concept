package Gym.Model;

import Gym.Enum.Gender;

public class Admin extends Staff {
    private static int count=0;
    // constructor
    public Admin(String name, int age, Gender gender, String phoneNumber, String role, Double salary) {
        super(name, age, gender, phoneNumber, role, salary);
        super.ID = "AD-"+(++count);
    }
    // accessor
    public String getID(){ return ID;}
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
                getName(),
                getAge(),
                getGender(),
                getPhoneNumber(),
                super.getRole(),
                super.getSalary()
        );
    }
}


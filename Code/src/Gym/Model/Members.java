package Gym.Model;

import Gym.Entities.MembershipPlan;
import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Base.Person;
import java.util.Scanner;

public class Members extends Person {

    private static int count = 0;
    private String ID;
    // constructor
    public Members(String name, Gender gender, int age, String phoneNumber) {
        super(name, age, gender, phoneNumber);
        super.ID = "Mem" + (++count);
    }
    // setter
    public void setName(String name) {
        super.setName(name);
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    public void setGender(Gender gender) {
        super.setGender(gender);
    }

    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    // getter
    public String getID() {
        return this.ID;
    }

    @Override
    public String toString() {

        return String.format("""
                ----------------------------------
                        Member INFORMATION
                ----------------------------------
                ID              : %s
                Name            : %s
                Age             : %d
                Gender          : %s
                Phone Number    : %s
                Membership Plan : %s
                Status          : %s
                %n""",
                ID,
                super.getName(),
                super.getAge(),
                super.getGender(),
                super.getPhoneNumber());
    }
}
package Gym.Model;

import Gym.Entities.MembershipPlan;
import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Base.Person;
import java.util.Scanner;

public class Members extends Person {
    private MembershipPlan plan;
    private  static  int count=0;
    private    String ID;
    private MemberStatus status;

    // constructor
    public Members(String name, Gender gender, int age, String phoneNumber,
            MemberStatus status, MembershipPlan plan) {
        super(name, age, gender, phoneNumber);
        super.ID="Mem"+(++count);
        this.plan = plan;
        this.status = status;
    }

    // setter
    public void setPlan(int n, MembershipPlan[] plans) {
        if (n >= 0 && n < plans.length) {
            this.plan = plans[n];
        } else {
            this.plan = plans[0];
        }
    }

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

    public void setStatus(MemberStatus status) {
        this.status = status;
    }

    // getter
    public String getID() {
        return this.ID;
    }

    public MembershipPlan getPlan() {
        return plan;
    }

    public MemberStatus getStatus() {
        return status;
    }

        String planName = (plan == null) ? "None" : plan.getName();
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
                super.getPhoneNumber(),
                planName,
                status);
    }
}
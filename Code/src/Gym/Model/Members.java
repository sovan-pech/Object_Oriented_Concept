package Gym.Model;

import Gym.Entities.MembershipPlan;
import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Base.Person;
import java.util.Scanner;
import java.util.UUID;

public class Members extends Person {
    private MembershipPlan plan;
    private String ID;
    private MemberStatus status;

    // constructor
    public Members(String name, Gender gender, int age, String phoneNumber,
            MemberStatus status, MembershipPlan plan) {
        super(name, age, gender, phoneNumber);
        this.ID = "MM-" + UUID.randomUUID().toString().substring(0, 8);
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

    // helper input method
    public void inputData(Scanner input, MembershipPlan[] plans) {
        int iPlan = -1;

        System.out.print("Enter Name                : ");
        super.name = input.nextLine();

        System.out.print("Enter Age                 : ");
        super.age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Gender (MALE/FEMALE): ");
        super.gender = Gender.valueOf(input.nextLine().toUpperCase());

        System.out.print("Enter Phone Number        : ");
        super.phoneNumber = input.nextLine();

        System.out.print("Enter Status (ACTIVE/INACTIVE): ");
        this.status = MemberStatus.valueOf(input.nextLine().toUpperCase());

        System.out.println("\nAvailable plans:");
        for (int i = 0; i < plans.length; i++) {
            System.out.printf("%d. %s\n", i + 1, plans[i].getName());
        }

        System.out.println("Pick your preferred plan (1 to " + plans.length + "):");

        while ((iPlan = input.nextInt()) < 1 || iPlan > plans.length) {
            System.out.println("Invalid input. Try again:");
        }

        input.nextLine();
        this.plan = plans[iPlan - 1];
    }

    @Override
    public String toString() {
        String planName = (plan == null) ? "None" : plan.getName();

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
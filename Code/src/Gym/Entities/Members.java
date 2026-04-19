package Gym.Entities;

import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Base.Person;

import java.util.Scanner;
import java.util.UUID;

public class Members extends Person {
    private MembershipPlan plan;
    private String ID;
    private MemberStatus status;

    public Members(String name, int age, Gender gender, String phoneNumber, MemberStatus status,
                   MembershipPlan plan ){
        super(name,gender,age,phoneNumber); //assign value to super class ( person )
        this.ID="MM-"+UUID.randomUUID().toString().substring(0,3);
        this.plan=plan;
        this.status=status;
    }
    @Override
    protected void viewInfo() {
        System.out.printf
                ("""
                        ID              :%s
                        Name            :%s
                        Age             :%s
                        Gender          :%s
                        Phone Number    :%s
                        Membership Plan :%s
                        Status          :%s
                        %n""", ID,super.name,super.age,super.gender,super.phoneNumber,plan.getName(),status);

    }

    void inputData(Scanner input, MembershipPlan []plans) {
        int iPlan=-1;
        System.out.print("Enter Name                :"); super.name=input.nextLine();
        System.out.print("Enter Age                 :"); super.age=input.nextInt();
        input.nextLine();
        System.out.print("Enter Phone Number        :"); super.phoneNumber=input.nextLine();
        System.out.println("Available plan.");
        for(int i = 0 ; i < plans.length; i++){
            System.out.printf("%d. %s\n",i+1,plans[i].getName());
        }
        System.out.println("Pick your prefer Plan. From 0 to "+plans.length);
        while((iPlan=input.nextInt()) <1 || iPlan>plans.length ){
            System.out.println("Invalid input");
        }
        input.nextLine();
        plan=plans[iPlan-1];
    }
    //accessor
    //setter
    protected void setName(String name){
        super.name= name;
    }
    protected void  setGender(Gender gender){
        super.gender=gender;
    }
    protected void setAge(int age){
        super.age=age;
    }
    protected void setPlan( MembershipPlan plan){
        this.plan=plan;
    }
    protected void setStatus(MemberStatus status){
        this.status=status;
    }
    //getter

    protected String getName(){
        return super.name;
    }
    protected MembershipPlan getPlan(){
        return plan;
    }
    protected MemberStatus getStatus(){
        return status;
    }
}

package Gym.User;

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

    //constructor
    public Members(String name, int age, Gender gender, String phoneNumber, MemberStatus status,
                   MembershipPlan plan ){
        super(n,gender,age,phoneNumber);
        this.ID="MM-"+UUID.randomUUID().toString().substring(0,3);
        this.plan=plan;
        this.status=status;
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
        if (age>0)
            super.age=age;
        else
            super.age=18;
    }
    public void setPlan(int n, MembershipPlan[] plan){
        if(n<plan.length && n>=0 ){
            this.plan=plan[n];
        }
        else{
            this.plan=plan[0];
        }
    }
    public void setStatus(MemberStatus status){
        this.status=status;
    }
    //getter
    public String getID(){
        return this.ID;
    }
    public MembershipPlan getPlan(){
        return plan;
    }
    public MemberStatus getStatus(){
        return status;
    }






    //helper
    public void inputData(Scanner input, MembershipPlan []plans) {
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

    @Override
    public String toString() {
        return String.format(
                       """
                        ----------------------------------
                                Member INFORMATION
                        ----------------------------------
                        ID              :%s
                        Name            :%s
                        Age             :%s
                        Gender          :%s
                        Phone Number    :%s
                        Membership Plan :%s
                        Status          :%s
                        %n""", ID,super.getName(),super.getAge(),super.getGender(),super.getPhoneNumber(),
                        plan.getName(),this.getStatus()

        );
    }
}



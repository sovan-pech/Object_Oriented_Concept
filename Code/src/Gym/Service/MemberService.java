package Gym.Service;

import Gym.Entities.MembershipPlan;
import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Model.Members;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
    ArrayList<Members> membersList = new ArrayList<>();
    private MembershipPlan[] plans = {
            new MembershipPlan("Basic", 19.99, 1),
            new MembershipPlan("Premium", 39.99, 3),
            new MembershipPlan("Annual", 59.99, 12)
    };

    public Members createMemer(Scanner input){
        System.out.print("Enter Name                : ");
        String name = input.nextLine().trim();     //
        System.out.print("Enter Age                 : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Gender   (MALE/FEMALE):"); String gender=input.nextLine().toUpperCase();
        Gender genderType;
        try{
            genderType=Gender.valueOf(gender);
        }
        catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid input");
        }
        System.out.print("Enter Phone Number        : ");
        String phoneNumber = input.nextLine().trim();

        System.out.print("Enter Status (ACTIVE/INACTIVE): ");String status=input.nextLine().toUpperCase();
        MemberStatus memStatus;
        try{
            memStatus=MemberStatus.valueOf(status);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid input.");
        };
        int iPlan=-1;
        System.out.println("\nAvailable plans:");
        for (int i = 0; i < plans.length; i++) {
            System.out.printf("%d. %s\n", i + 1, plans[i].getName());
        }

        System.out.println("Pick your preferred plan (1 to " + plans.length + "):");

        while ((iPlan = input.nextInt()) < 1 || iPlan > plans.length) {
            System.out.println("Invalid input. Try again:");
        }
        input.nextLine();
        MembershipPlan selectedPlan=plans[iPlan-1];

        return new Members(name,genderType,age,phoneNumber);
    }
    //add member func
    public void addMember(Members member){
        membersList.add(member);
        System.out.println("Member added successful! ");
    }
    //
    public Members findByID(String id){
            for(Members m : membersList){
                if(m.getID().equals(id)){
                    return m;
                }
            }
            return null;
    }
    //list all member
    public void listAll() {
        if (membersList.isEmpty()) {
            System.out.println("No members found.");
            return;
        }
        System.out.println("====== ALL MEMBERS ======");
        for (Members m : membersList)
            System.out.println(m);
    }
}

package Gym.Service;

import Gym.Enum.Gender;
import Gym.Model.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffService {
    private ArrayList<Staff> staffList = new ArrayList<>();
    public static Staff  createStaff(Scanner input){
        System.out.println("==============Create Staff=============");
        System.out.print("Enter Name                  :"); String name= input.nextLine();
        System.out.print("Enter Age                   :"); int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Gender   (MALE/FEMALE):"); String gender=input.nextLine().toUpperCase();
        Gender genderType;
        try{
            genderType=Gender.valueOf(gender);
        }
        catch (IllegalArgumentException e){
           throw new IllegalArgumentException("Invalid input.");
        }
        System.out.print("\n");
        System.out.print("Enter Phone Number          :"); String phoneNum= input.nextLine();
        System.out.print("Enter Role                  :"); String role = input.nextLine();
        System.out.print("Enter Salary                :"); double salary= input.nextFloat();
        input.nextLine();
        return new Staff(name,age,genderType,phoneNum,role,salary);
    }
    public void addStaff(Staff newStaff){
        staffList.add(newStaff);
        System.out.println("Staff added successful");
    }


}

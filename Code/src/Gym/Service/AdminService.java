package Gym.Service;

import Gym.Enum.Gender;
import Gym.Model.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminService {
    ArrayList<Admin> admins = new ArrayList<>();
    public static  Admin createAdmin(Scanner input){
        System.out.println("==============Create Admin=============");
        System.out.print("Enter Name                  :"); String name= input.nextLine();
        System.out.print("Enter Age                   :"); int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter Gender   (MALE/FEMALE):"); String gender=input.nextLine().toUpperCase();
        Gender genderType;
        try{
            genderType=Gender.valueOf(gender);
        }
        catch (IllegalArgumentException e){
            System.out.println(("Invalid input. Default gender set to MALE"));
            genderType = Gender.MALE;
        }
        System.out.println("");
        System.out.print("Enter Phone Number          :"); String phoneNum= input.nextLine();
        System.out.print("Enter Role                  :"); String role = input.nextLine();
        System.out.print("Enter Salary                :"); double salary= input.nextFloat();
        input.nextLine();
        return new Admin(name,age,genderType,phoneNum,role,salary);
    }

    public void addAdmin(Admin admin){
        admins.add(admin);
        System.out.println("Admin added Successfully!");
    }
}

package Gym.User;

import Gym.Enum.Gender;

import java.util.ArrayList;

public class Admin extends Staff {
    private ArrayList<Staff> staffList = new ArrayList<>();
    public Admin(String name, int age, Gender gender, String phoneNumber, String role, Double salary) {
        super(name, age, gender, phoneNumber, role, salary);

    }
    private void addStaff(){

    }
    private  void updateStaff(){

    }
}

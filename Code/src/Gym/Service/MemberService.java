package Gym.Service;

import Gym.Model.Members;

import java.util.ArrayList;

public class MemberService {
    ArrayList<Members> membersList = new ArrayList<>();
    public void addMember(Members member){
        membersList.add(member);
        System.out.println("Member added successful! ");
    }
}

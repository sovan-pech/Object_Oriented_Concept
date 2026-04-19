package Gym.Entities;

import java.util.UUID;

public class MembershipPlan {
    private  String planName;
    private  String plan_ID;
    private double planPrice;
    private int duration;
// constructor
    public MembershipPlan(String planName , double planPrice , int duration  ){
        this.plan_ID ="PL-"+UUID.randomUUID().toString().substring(0,3);
        this.planName=planName;
        this.planPrice =planPrice;
        this.duration = duration;
    }
    public String getDetail(){
        return "%.20s %.20s %.20s".formatted(plan_ID,planName, planPrice);
    }
    public  String getName(){
        return planName;
    }
    public String getPlan_ID(){
        return plan_ID;
    }
    public double getPlanPrice(){
        return planPrice;
    }
    public int getDuration(){ return  duration;}
}

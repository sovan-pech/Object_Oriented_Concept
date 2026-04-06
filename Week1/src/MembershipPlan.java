import java.util.Date;

public class MembershipPlan {
    private  String name; // constructor, helper , accessor
    private  String plan_ID;
    private double planPrice;
// constructor
    public MembershipPlan(String name , double monthyFee , String plan_ID){
        this.plan_ID = plan_ID;
        this.name=name;
        this.planPrice =monthyFee;
    }
    public String getDetail(){
        return "%.20s %.20s %.20s".formatted(plan_ID,name, planPrice);
    }
    public  String getName(){
        return name;
    }
    public String getPlan_ID(){
        return plan_ID;
    }
    public double getPlanPrice(){
        return planPrice;
    }
}

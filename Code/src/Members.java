import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Members extends Person {
    private MembershipPlan plan;
    private String ID;
    private MemberStatus status;
    public Members(String name,int age, Gender gender, String phoneNumber, MemberStatus status,
                   MembershipPlan plan ){
        super(name,gender,age,phoneNumber); //assign value to super class ( person )
        this.ID="MM-"+UUID.randomUUID().toString().substring(0,3);
        this.plan=plan;
        this.status=status;
    }
    @Override
    void viewInfo() {
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

    @Override
    void inputData() {

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

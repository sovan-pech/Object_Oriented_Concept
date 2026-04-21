package Gym.Entities;

import Gym.Enum.PaymentMethod;
import Gym.User.Members;

import java.util.UUID;

public class Payment {
    private double payAmount; // base amount
    private String paymentID; //
    private float discount; // if there's a discount
    private Members members; // who paid ?
    private MembershipPlan plan; // what plan do they purchase
    private PaymentMethod method; // in what method ? KHQR ? credit card?
    private double finalAmount;

    public Payment( Members members, float discount , PaymentMethod method){
        this.paymentID="PM-"+ UUID.randomUUID().toString().substring(0,3);
        this.plan=members.getPlan();
        this.members = members;
        this.payAmount=members.getPlan().getPlanPrice();
        this.finalAmount=calFinalAmount();

        this.discount=discount;
        this.method=method;
    }
    // accessor
    public void setDiscount(float discount){
        if(discount>0)
            this.discount=discount;
        else{
            this.discount=0;
        }
    }
    public float getDiscount(){
        return discount;
    }

    public String getPaymentID()    { return paymentID; }
    public Members getMembers()     { return members; }
    public PaymentMethod getMethod(){ return method; }
    public double getPayAmount()    { return payAmount; }





    public double calFinalAmount() {
        return switch (method) {
            case KHQR -> payAmount * (1 - discount);
            case ByCash -> payAmount * (1 - discount);
            case CreditCard -> payAmount * (1 - discount) * 1.05;
        };
    }


}

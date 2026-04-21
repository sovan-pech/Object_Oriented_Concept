package Gym.Entities;

import Gym.Enum.PaymentMethod;
import Gym.User.Members;

public class Payment {
    private double payAmount; // base amount
    private String paymentID; //
    private float discount; // if there's a discount
    private Members members; // who paid ?
    private MembershipPlan plan; // what plan do they purchase
    private PaymentMethod method; // in what method ? KHQR ? credit card?

    public Payment(double payAmount, Members members, float discount , PaymentMethod method){
        this.members = members;
        this.payAmount=payAmount;
        this.discount=discount;
        this.method=method;
    }
    // accessor
    public void setDiscount(float discount){
        if(discount>0)
            this.discount=discount;
        else{
            System.err.println("INVALID INPUT");
        }
    }
    public float getDiscount(){
        return discount;
    }
    public void setPayAmount(double payAmount){
        if(payAmount>0){
            this.payAmount=payAmount;
        }
        else{
            System.err.println("INVALID INPUT");
        }
    }
    public String getPaymentID()    { return paymentID; }
    public Members getMembers()     { return members; }
    public PaymentMethod getMethod(){ return method; }
    public double getPayAmount()    { return payAmount; }





    public double  calFinalAmounth(double payAmount, PaymentMethod method){
        switch (method){
            case PaymentMethod.KHQR -> {
                return payAmount;
            }
            case PaymentMethod.ByCash -> {
                return payAmount;
            }
            case PaymentMethod.CreditCard ->
            {
                return payAmount+payAmount*0.05;
            }
        }
        return payAmount;
    }


}

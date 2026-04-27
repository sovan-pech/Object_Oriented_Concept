package Gym.Entities;

import Gym.Enum.PaymentMethod;
import Gym.Model.Members;

public class Payment {
    private  static int count=0;
    private double payAmount; // base amount
    private String paymentID; //
    private float discount; // if there's a discount
    private Members members; // who paid ?

    private PaymentMethod method; // in what method ? KHQR ? credit card?
    private double finalAmount;

    public Payment( Members members, float discount , PaymentMethod method){
        this.paymentID="PM-"+(++count);
        this.members = members;
        this.payAmount=members.getPlan().getPlanPrice();
        this.discount=discount;
        this.method=method;
        this.finalAmount=calFinalAmount();
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
            case BYCASH -> payAmount * (1 - discount);
            case CREDITCARD -> payAmount * (1 - discount) * 1.05;
        };
    }
    @Override
    public String toString() {
        return """
                Payment ID       :%s
                Member Name      :%s
                Discount         :%s
                Membership Plan  :%s
                Payment Method   :%s
                Payment          :%s
                """.formatted(this.paymentID,members.getID(),this.discount,members.getPlan().getName()
                                ,method.name(),this.finalAmount);
    }
}

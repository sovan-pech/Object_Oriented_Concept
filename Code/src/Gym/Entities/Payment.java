package Gym.Entities;

import java.time.LocalDate;

import Gym.Enum.PaymentMethod;
import Gym.Model.Members;

public class Payment {
    private  static int count=0;
    private double payAmount; // base amount
    private String paymentID; //
    private float discount; // if there's a discount
    private String subID;
    private LocalDate paymentDate;
    private PaymentMethod method; // in what method ? KHQR ? credit card?
    private double finalAmount;

    public Payment( Membership memShip, float discount , PaymentMethod method){
        this.paymentID="PM-"+(++count);
        this.subID= memShip.getSubID();
        this.discount=discount;
        this.method=method;
        this.paymentDate=LocalDate.now();
        this.payAmount=memShip.getPlan().getPlanPrice();
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

    public LocalDate getPaymentDate(){
        return this.paymentDate;
    }
    public String getPaymentID()    { return paymentID; }
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
            Payment ID      : %s
            Subscription ID : %s
            Discount        : %.0f%%
            Method          : %s
            Final Amount    : $%.2f
            """.formatted(paymentID, subID, discount * 100, method.name(), finalAmount);
}
}

package Gym.Service;

import Gym.Entities.MembershipPlan;
import Gym.Entities.Payment;
import Gym.Enum.PaymentMethod;
import Gym.Model.Members;

import java.util.ArrayList;

public class PaymentService {
    private ArrayList<Payment> paymentList = new ArrayList<>();
    public Payment processPayment(Members member, float discount, PaymentMethod paymentMethod ){
        Payment payment = new Payment(member,discount,paymentMethod);
        paymentList.add(payment);
        System.out.println("Payment processed: "+payment.getPaymentID());
        paymentList.add(payment);
        return payment;
    }
}

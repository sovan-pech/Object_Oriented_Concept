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
        System.out.println("Payment processed: "+payment.getPaymentID());
        paymentList.add(payment);
        return payment;
    }
    public void listAll() {
        if (paymentList.isEmpty()) {
            System.out.println("No payments found.");
            return;
        }
        System.out.println("====== ALL PAYMENTS ======");
        for (Payment p : paymentList)
            System.out.println(p);
    }

}

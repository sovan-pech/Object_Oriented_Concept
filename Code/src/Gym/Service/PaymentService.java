package Gym.Service;

import Gym.Entities.Membership;
// import Gym.Entities.MembershipPlan;
import Gym.Entities.Payment;
import Gym.Enum.PaymentMethod;
// import Gym.Model.Members;

import java.util.ArrayList;

public class PaymentService {
    private ArrayList<Payment> paymentList = new ArrayList<>();
    public Payment processPayment(Membership membership, float discount, PaymentMethod paymentMethod ){
        Payment payment = new Payment(membership,discount,paymentMethod);
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

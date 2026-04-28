package Gym.Entities;

import java.time.LocalDate;

import Gym.Enum.PaymentMethod;
import Gym.Model.Members;

public class PaymentRec {
    private static int count = 0;
    private String recordID; // unique record ID
    private LocalDate paymentDate; // when was it recorded
    private Payment payment; // links to the whole Payment object

    public PaymentRec(Payment payment) {
        this.recordID = "REC-" + (++count);
        this.payment = payment;
        this.paymentDate = LocalDate.now();
    }

    // getter
    public String getrecordId() {
        return this.recordID;
    }

    public LocalDate getpaymentDate() {
        return this.paymentDate;
    }
}

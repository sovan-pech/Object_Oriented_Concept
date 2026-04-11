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
    // discount
    public void setDiscount(float discount){
        this.discount=discount;
    }
    public float getDiscount(){
        return discount;
    }
    // Pay amount
    public void setPayAmount(double payAmount){
        this.payAmount= payAmount;
    }

    public double  calFinalAmounth(double payAmount, PaymentMethod method){
        switch (method){
            case KHQR -> {
                return payAmount;
            }
            case ByCash -> {
                return payAmount;
            }
        }
        return payAmount;
    }


}

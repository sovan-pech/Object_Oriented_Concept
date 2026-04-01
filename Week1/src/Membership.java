public class Membership {
    private  String name;
    private  String plan_ID;
    private double Fee;
    public  Membership(String name , double monthyFee , String plan_ID){
        this.plan_ID = plan_ID;
        this.name=name;
        this.Fee=monthyFee;
    }
    public String getDetail(){
        return """
                %s
                %s
                Monthy Fee : $%.2f 
                """.formatted(name,plan_ID,Fee);
    }
    public  String getName(){
        return name;
    }
    public String getPlan_ID(){
        return plan_ID;
    }

}

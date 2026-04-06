//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    MembershipPlan gold = new MembershipPlan("gold" , 250.0f, "A1");
    MembershipPlan silver = new MembershipPlan("silver" , 150.0f, "B2");
    MembershipPlan basic = new MembershipPlan("basic", 60.0f, "C1");
    MembershipPlan[] plan = {gold, silver , basic};
    Members[] customer = new Members[2];
    Scanner input = new Scanner(System.in);
    for( int i = 0 ; i<2; i++){
        customer[i] = new Members( "Yuth", basic);
        System.out.printf("===========================Customer %d ==========================\n",i);
        customer[i].inputData(input, plan);
        System.out.println("========================== END =================================");
    }
    Members.header();
    for( var i : customer){
        System.out.println(i.showAccess());
    }
    System.out.println();
    input.close();
}
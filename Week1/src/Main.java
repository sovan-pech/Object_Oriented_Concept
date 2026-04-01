import static java.lang.foreign.MemorySegment.NULL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Membership gold = new Membership("gold" , 250.0f, "A1");
    Membership silver = new Membership("silver" , 150.0f, "B2");
    Membership basic = new Membership("basic", 60.0f, "C1");
    Membership[] plan = {gold, silver , basic};
    Members[] customer = new Members[2];
    Scanner input = new Scanner(System.in);
    for( int i = 0 ; i<2; i++){
        customer[i] = new Members( "NUll", basic);
        System.out.printf("===========================Customer %d ==========================\n",i);
        customer[i].inputData(input, plan);
        System.out.println("========================== END =================================");
    }
    for( var i : customer){
        System.out.println(i.showAccess());
    }
    input.close();
}
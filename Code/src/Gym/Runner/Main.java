import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Entities.Members;
import Gym.Entities.MembershipPlan;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Gender male = Gender.Male;
    Gender female= Gender.Female;
    MemberStatus active= MemberStatus.ACTIVE;
    MemberStatus suspend = MemberStatus.SUSPEND;
    MembershipPlan basic = new MembershipPlan("Basic",30.0f, 3);
    MembershipPlan silver = new MembershipPlan("Silver",30.0f, 3);
    MembershipPlan gold = new MembershipPlan("Gold",30.0f, 3);
    MembershipPlan []plans= {basic,silver,gold};
    Scanner input = new Scanner(System.in);
    Members[] members=new Members[2];
    for( int i=0 ; i<2;i++){
        members[i]= new Members("Yuth",19,male,"098765432",active,basic);
        members[i].inputData(input,plans);
    }
    for( var mem:members){
        System.out.printf("============================================\n");
        mem.viewInfo();
        System.out.printf("=============================================\n");
    }
    input.close();
}
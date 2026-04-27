import Gym.Base.Person;
import Gym.Enum.Gender;
import Gym.Enum.MemberStatus;
import Gym.Enum.PaymentMethod;
import Gym.Runner.GymManagement;
import Gym.Service.AdminService;
import Gym.Service.PaymentService;
import Gym.Service.StaffService;
import Gym.Model.Admin;
import Gym.Model.Members;
import Gym.Entities.MembershipPlan;
import Gym.Model.Staff;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Gender male = Gender.MALE;
    Gender female= Gender.FEMALE;
    Gender[] type = {male,female};
    Scanner input = new Scanner(System.in);
//    Members yuth = new Members("Yuth", Gender.MALE,19,"098765432", active , silver );
//    MemberStatus active= MemberStatus.ACTIVE;
//    MemberStatus suspend = MemberStatus.SUSPEND;
//    MembershipPlan basic = new MembershipPlan("Basic",30.0f, 3);
//    MembershipPlan silver = new MembershipPlan("Silver",60.0f, 3);
//    MembershipPlan gold = new MembershipPlan("Gold",90.0f, 3);
//    MembershipPlan []plans= {basic,silver,gold};

//    Members[] members=new Members[2];
//    for( int i=0 ; i<2;i++){
//        members[i]= new Members("Yuth",19,male,"098765432",active,basic);
//        members[i].inputData(input,plans);
//    }
//    for( var mem:members){
//        System.out.printf("============================================\n");
//        mem.viewInfo();
//        System.out.printf("=============================================\n");
//    }
//    Payment payment=new Payment(60.0, yuth, 0.0f, PaymentMethod.KHQR);
//    System.out.println(payment.getMembers());
//    Admin admin2= new Admin("y8",18,Gender.MALE,"098765432","Busines",1999.1);
//    Admin admin3= new Admin("y0",18,Gender.MALE,"098765432","Busines",1999.1);
//    Admin[] admins= {admin2,admin3};
//    Admin ow = new Admin("okay", 14,Gender.MALE,"9876543","HR",19206.1);
//    System.out.println(admin.getID());
//    System.out.println(admin.getID());
//    AdminService adminService= new AdminService();
//    Admin admin = AdminService.createAdmin(input);
//    System.out.println(admin.toString());
//    System.out.println(GymManagement.gymName);
//    Person currentUser = new Admin("John doe ", 56, Gender.MALE,"0987654321","Admin",1000.0);
//    if(currentUser instanceof  Admin){
//        System.out.println("Create staff using admin");
//         Staff newStaff = StaffService.createStaff(input);
//    }
//    StaffService staffServi=new StaffService();
//
//    Staff kiko= StaffService.createStaff(input);
//    System.out.println(kiko);
//    staffService.createStaff();
//    yuth.setName("yuth");
//    for (var adminss : admins){
//        System.out.println(adminss);
//    }
//
//    Admin admin= new Admin("y",18,Gender.MALE,"098765432","Busines",1999.1);
//    AdminService adminService=new AdminService();
//    adminService.addAdmin(admin);
//    PaymentService paymentService = new PaymentService();
//    System.out.println(paymentService.processPayment(yuth,0, PaymentMethod.KHQR));
//
    MembershipPlan basic = new MembershipPlan("Basic", 29.99, 1);
    MembershipPlan premium = new MembershipPlan("Premium", 59.99, 3);
    ArrayList<MembershipPlan> plans = new ArrayList<>();
    plans.add(basic);
    plans.add(premium);
    for(MembershipPlan m : plans){
        System.out.println(m);
    }
    System.out.println("Our gym name");
    System.out.println(GymManagement.gymName);
    new GymManagement().run(); // run menu to create and viewall


    input.close();

}
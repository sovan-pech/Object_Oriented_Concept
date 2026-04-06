import java.util.Date;
import java.util.Scanner;

public class Members {
    private String name;
    private MembershipPlan myplan;
    private String ID;
    private int age;
    private String gender;
    private Date dob; // date of birth
    public Members(String name , MembershipPlan plan){
        this.name = name;
        this.myplan = plan;
    }
    public static void header(){
        System.out.printf("%.20s %.20s %.20s %.20s %.20s %.20s %.20s\n","ID","Customer Name","Customer Age","Customer Gender","Plan ID", "Plan Name","Plan Price");
    }
    /*
    @return a formatted well organized out data
     */
    public String showAccess(){
        return "C%.20s %.20s %.20s %.20s %.20s".formatted(ID,name,age,gender,myplan.getDetail());
    }
    /*
     *@param Membership[] available plan is to get the array of plan and easier to input value than using String
    *@example instead of user input "gold" "Gold"... we would use number instead 0:plan A, 1:plan B, 2:plan c
    */
    public  void inputData(Scanner input, MembershipPlan[] availablePlan ){
        System.out.print("Enter member name : ");
        name = input.nextLine();
        System.out.print("Enter your Age    :"); age=input.nextInt();
        input.nextLine();
        System.out.print("Enter your Gender :");gender=input.nextLine();

        System.out.println("Choose plan.");
        System.out.println("Here is the available plan : ");
        for( int i = 0 ; i < availablePlan.length; i++){
            System.out.printf("%d : %s\n",i,availablePlan[i].getName());
        }
        System.out.println("Choose plan from 0 to "+(availablePlan.length-1)+".");
        int choice = input.nextInt();
        while(choice <0 || choice>=availablePlan.length){
            System.out.println("INVALID INPUT! Try again");
            choice=input.nextInt();
        }
        input.nextLine();
        myplan=availablePlan[choice];
    }
}

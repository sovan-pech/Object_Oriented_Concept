import java.util.Scanner;

public class Members {
    private String name;
    private Membership myplan;
    public Members(String name , Membership plan){
        this.name = name;
        this.myplan = plan;
    }
    /*
    @return a formatted well organized out data
     */
    public String showAccess(){
        return """
                Name : %s
                My Current Plan : %s 
                """.formatted(name, myplan.getDetail());
    }
    /*
     *@param Membership[] available plan is to get the array of plan and easier to input value than using String
    *@example insteand of user input "gold" "Gold"... we would use number instead 0:plan A, 1:plan B, 2:plan c
    */
    public  void inputData(Scanner input, Membership[] availablePlan ){

        System.out.print("Enter member name : ");
        name = input.nextLine();
        System.out.println("Choose plan.");
        System.out.println("Here is the available plan : ");
        for( int i = 0 ; i < availablePlan.length; i++){
            System.out.printf("%d : %s\n",i,availablePlan[i].getName());
        }
        System.out.println("Choose plan from 0 to "+(availablePlan.length-1)+".");
        int choice = input.nextInt();
        input.nextLine();
        if(choice >=0 && choice<availablePlan.length){
            myplan = availablePlan[choice];
        }
    }
}

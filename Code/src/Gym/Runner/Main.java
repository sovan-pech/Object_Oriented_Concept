
package Gym.Runner;
// import Gym.Entities.Membership;
// import Gym.Entities.MembershipPlan;
// import Gym.Entities.Payment;
// import Gym.Enum.Gender;
// import Gym.Enum.PaymentMethod;
// import Gym.Model.Member;

// import Gym.Service.PaymentService;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutte
public class Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                new GymManagement().run();;
                
                input.close();
        }

}
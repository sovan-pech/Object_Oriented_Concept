
package Gym.Runner;
// import Gym.Entities.Membership;
// import Gym.Entities.MembershipPlan;
// import Gym.Entities.Payment;
// import Gym.Enum.Gender;
// import Gym.Enum.PaymentMethod;
// import Gym.Model.Member;

// import Gym.Service.PaymentService;

import java.util.Scanner;
import Gym.Model.Member;
import Gym.Enum.Gender;
import Gym.Interface.Displayable;
import Gym.Model.Staff;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutte
public class Main {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                // Member yuth = new Gym.Model.Member(null, null, 0, null);
                // yuth.displayable();
                // Staff vanda = new Staff(null, 0, null, null, null, 0.0);
                // vanda.displayable();

                new GymManagement().run();
                


                
                input.close();
        }

}
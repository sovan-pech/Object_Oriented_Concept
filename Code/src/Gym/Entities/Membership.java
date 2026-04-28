package Gym.Entities;
import java.time.LocalDate;

import Gym.Enum.MemberStatus;
import Gym.Model.Members;


public class Membership {
  private static int count=0;
  private String membershipId;
  private String memID;
  private LocalDate startDate;
  private LocalDate endDate;
  private MemberStatus status;
  private MembershipPlan plan;
  // constructor
  public Membership(Members member, MembershipPlan plan) {
    this.membershipId ="SUB-"+(++count);
    // this.member = member;
    this.memID = member.getID();
    this.plan=plan;
    this.startDate = LocalDate.now();
    this.endDate = LocalDate.now().plusMonths(plan.getDuration());
    this.status = MemberStatus.ACTIVE;
  }

  // Getters and Setters

 
  public String getSubID(){ return this.membershipId;}
  public LocalDate getStartDate() {
    return startDate;
  }
  public MembershipPlan getPlan(){
    return plan;
  }
  public MemberStatus getStatus() {
    return status;
  }
  public LocalDate getEnDate(){
    return endDate;
  }
 @Override
public String toString() {
    return String.format("""
            ----------------------------------
                    MEMBERSHIP INFO
            ----------------------------------
            Membership ID   : %s
            Member ID       : %s
            Plan ID         : %s
            Start Date      : %s
            End Date        : %s
            Status          : %s
            ----------------------------------
            """, membershipId, memID, plan.getPlan_ID(),startDate, endDate, status);
}

}

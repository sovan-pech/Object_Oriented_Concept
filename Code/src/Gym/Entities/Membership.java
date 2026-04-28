package Gym.Entities;

import java.lang.reflect.Member;

import Gym.Enum.MemberStatus;

public class Membership {

  private String membershipId;
  private Member member;
  private MembershipPlan plan;
  private String startDate;
  private String endDate;
  private MemberStatus status;

  // constructor
  public Membership(Member member, MembershipPlan plan, String startDate, String endDate, MemberStatus status) {
    this.membershipId = membershipId;
    this.member = member;
    this.plan = plan;
    this.startDate = startDate;
    this.endDate = endDate;
    this.status = status;
  }

  // Getters and Setters

  public Member getMemberName() {
    return MemberName;
  }

  public MembershipPlan getPlan() {
    return plan;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public MemberStatus getStatus() {
    return status;
  }

  public void setStatus(MemberStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return String.format(
        """
            ----------------------------------
                    Admin INFORMATION
            ----------------------------------
            ID              : %s
            Name            : %s
            Age             : %d
            Gender          : %s
            Phone Number    : %s
            Role            : %s
            Salary          : $%.2f
            ----------------------------------
            """,
        this.ID,
        getName(),
        getAge(),
        getGender(),
        getPhoneNumber(),
        super.getRole(),
        super.getSalary());
  }

}

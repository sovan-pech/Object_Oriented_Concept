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

  public void setMembershipId(String membershipId) {
    this.membershipId = membershipId;
  }

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public MembershipPlan getPlan() {
    return plan;
  }

  public void setPlan(MembershipPlan plan) {
    this.plan = plan;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
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

  // Display method
  public void displayMembershipInfo() {
    System.out.println("Membership ID: " + membershipId);
    System.out.println("Member: " + member);
    System.out.println("Plan: " + plan);
    System.out.println("Start Date: " + startDate);
    System.out.println("End Date: " + endDate);
    System.out.println("Status: " + status);
  }

}

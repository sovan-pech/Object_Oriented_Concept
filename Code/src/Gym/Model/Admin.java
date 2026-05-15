package Gym.Model;

import Gym.Enum.Gender;
import Gym.Base.Person;

public class Admin extends Person {

  private static int count = 0;
  private String username;

  public Admin(String name, int age, Gender gender, String phoneNumber, String username) {
    super(name, age, gender, phoneNumber);
    super.ID = "ADM-" + (++count);
    this.username = username;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setName(String name) {
    super.setName(name);
  }

  public void setAge(int age) {
    super.setAge(age);
  }

  public void setGender(Gender gender) {
    super.setGender(gender);
  }

  public void setPhoneNumber(String phoneNumber) {
    super.setPhoneNumber(phoneNumber);
  }

  @Override
  public void displayInfo() {
    System.out.println(this.toString());
  }

  @Override
  public String toString() {
    return String.format("""
        ----------------------------------
                ADMIN INFORMATION
        ----------------------------------
        ID              : %s
        Name            : %s
        Age             : %d
        Gender          : %s
        Phone Number    : %s
        Username        : %s
        ----------------------------------
        %n""",
        super.getID(),
        super.getName(),
        super.getAge(),
        super.getGender(),
        super.getPhoneNumber(),
        this.username);
  }
}
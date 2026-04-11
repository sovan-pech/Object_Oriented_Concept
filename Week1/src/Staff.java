import java.util.UUID;

public class Staff extends Person { // be able to manage members add and delete , manage plan,
    private String  ID;
    private String role;
    private Double salary;

    public Staff(String name, int age, Gender gender,String phoneNumber,String role,Double salary){
        this.ID="ST-"+ UUID.randomUUID().toString().substring(0,3);
        super(name, gender, age, phoneNumber);
        this.role= role;
        this.salary=salary;
    }

    // accessor
    public String getName(){
        return this.name;
    }
    public String getRole(){
        return  this.role;
    }
    private  void setRole( String role ){
        this.role=role;
    }

    @Override
    void viewInfo() {

    }
}

public class Trainer {
    private String trainerID;
    private String name;
    private int age;
    private Gender gender;
    private String phoneNumber; // doesnt erase 0 at the front and can handle +885
    private String email;
    private String specialization;
    private float experience;
    private float rating;
    public Trainer( String trainerID, String name, int age, Gender gender, String phoneNumber
                    ,String email,String specialization, float experience,float rating){
        this.name=name;
        this.trainerID=trainerID;
        this.age=age;
        this.email=email;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
        this.experience=experience;

    }
}

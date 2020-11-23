import java.util.Date;

public class Patient extends Person {
    String id;
    FullName name;
    Gender gender;
    Date birthDate;
    Integer age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
}


import java.util.List;

public class Department {
    String name;
    private List<Staff> staff;

    Department (String name, List<Staff> staff){
        this.name = name;
        this.staff = staff;
    }
}

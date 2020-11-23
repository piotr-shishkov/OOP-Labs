public class Hospital  {
    String name;
    Address address;
    Phone phone;

    private List<Department> departments;

    Hospital (String name, Address address,Phone phone , List<Department> departments){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = departments;

    }
}



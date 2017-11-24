package structural.composite;

public class Manager implements Employee {
    private String name;
    private String empId;
    private String position;


    public Manager(String name, String empId, String position){
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployDetails() {
        System.out.println("Name :"+ this.name + " Emp Id :"+ this.empId + " Position :"+this.position);
    }
}

package structural.composite;

public class Developer implements Employee {
    private String name;
    private String empId;
    private String position;


    public Developer(String name, String empId, String position){
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployDetails() {
        System.out.println("Name :"+ this.name + " Emp Id :"+ this.empId + " Position :"+this.position);
    }
}

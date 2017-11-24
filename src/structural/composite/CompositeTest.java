package structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Employee employee = new Developer("Chida","123", "Lead Engineer");
        Employee employee1 = new Manager("Varada", "345", "Technical Manager");

        Composite composite = new Composite();
        composite.addEmployee(employee);
        composite.addEmployee(employee1);
        composite.showEmployDetails();
    }
}

package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee {
    private List<Employee>  employees = new ArrayList<>();


    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmplyee(Employee employee){
        this.employees.remove(employee);
    }

    @Override
    public void showEmployDetails() {
        for(Employee employee : employees){
            employee.showEmployDetails();
        }
    }
}

class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name = '" + name + "', id = " + id + "}";
    }
}


// Code that violates SRP Principle, EmployeeManager has two responsibilities: saving employee data and generating reports.

// class EmployeeManager {
// public void saveEmployee(Employee employee) {
//     System.out.println("Saving employee: " + employee);
// }

// public void generateReport(Employee employee) {
//     System.out.println("Generating report for: " + employee);
// }
// }
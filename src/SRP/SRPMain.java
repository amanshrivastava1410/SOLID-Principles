public class SRPMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Luffy", 1);
        EmpRepo repository = new EmpRepo();
        EmpReport report = new EmpReport();

        repository.saveEmployee(employee);
        report.generateReport(employee);
    }
}
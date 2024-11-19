package DRY;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Lionel", "abc123@gmail.com");
        EmployeeService empService = new EmployeeService();
        empService.validateEmployee(emp);
    }
}
package DRY;

class EmployeeService {
    private Validator validator = new Validator();

    public void validateEmployee(Employee employee) {
        validator.isNotEmpty(employee.getName(), "Name");
        validator.isNotEmpty(employee.getEmail(), "Email");
    }
}




// Code before using DRY --------------->

// class EmployeeService {
//     public void validateEmployee(Employee employee) {
//         if (employee.getName() == null || employee.getName().isEmpty()) {
//             System.out.println("Name is required.");
//         }
//         if (employee.getEmail() == null || employee.getEmail().isEmpty()) {
//             System.out.println("Email is required.");
//         }
//     }
// }
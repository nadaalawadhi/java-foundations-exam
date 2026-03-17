/**
 * Main — demonstrate your Employee Management System.
 *
 * YOUR TASKS:
 *   Part C — Create Manager and Intern objects, demonstrate polymorphism
 *   Part D — Add try/catch blocks for exception handling
 *
 * This file should compile and run, printing output that proves
 * all your code works correctly.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== PART A: Salary Utilities ===");
        // TODO: Test all 4 SalaryUtils methods and print results
        System.out.println("Annual salary: " + SalaryUtils.calculateAnnualSalary(20));
        //System.out.println("Annual salary: " + SalaryUtils.calculateAnnualSalary(-20));

        System.out.println("Tax on 25000: " + SalaryUtils.calculateTax(25000));
        System.out.println("Tax on 50000: " + SalaryUtils.calculateTax(50000));
        System.out.println("Tax on 8000: " + SalaryUtils.calculateTax(8000));
        //System.out.println("Tax on -25000: " + SalaryUtils.calculateTax(-25000));

        System.out.println("Net salary: " + SalaryUtils.calculateNetSalary(50000));
        //System.out.println("Net salary: " + SalaryUtils.calculateNetSalary(-1000));

        System.out.println("After 20% raise: " + SalaryUtils.applyRaise(400, 20));
        //System.out.println("After 110% raise: " + SalaryUtils.applyRaise(400, 110));
        //System.out.println("After -20% raise: " + SalaryUtils.applyRaise(400, -20));
        //System.out.println("After 20% raise: " + SalaryUtils.applyRaise(-400, 20));


        System.out.println("\n=== PART B: Employee Manager ===");
        // TODO: Create an EmployeeManager
        EmployeeManager employeeManager = new EmployeeManager();
        // TODO: Create and add at least 3 employees to it
        employeeManager.addEmployee(new Employee(1, "Ahmed", "Engineering", 3500));
        employeeManager.addEmployee(new Employee(2, "Nasser", "Engineering", 3000));
        employeeManager.addEmployee(new Employee(3, "Hala", "HR", 4500));
        employeeManager.addEmployee(new Employee(4, "Nada", "IT", 4000));
        employeeManager.addEmployee(new Employee(5, "Amna", "IT", 2500));
        // TODO: Demonstrate findById (found + not found)
        System.out.println(employeeManager.findById(3));
        System.out.println(employeeManager.findById(9));
        // TODO: Demonstrate getEmployeesByDepartment
        System.out.println(employeeManager.getEmployeesByDepartment("it"));


        System.out.println("\n=== PART C: Inheritance & Polymorphism ===");
        // TODO: Create at least 1 Manager and 1 Intern
        Employee emp1 =  new Employee(6, "Ahmed", "Engineering", 3500);
        Manager mng1 =  new Manager(7, "Amna", "IT", 4000, 8);
        Intern intern1 =  new Intern(8, "Maryam", "HR", 500, "UBO");

        // TODO: Add all employees (Employee, Manager, Intern) to the manager
        employeeManager.addEmployee(emp1);
        employeeManager.addEmployee(mng1);
        employeeManager.addEmployee(intern1);
        // TODO: Loop through getAllEmployees() and call getBonus() on each
        //       Print: "<name> bonus: <amount>" for each one
        //       This demonstrates polymorphism — same method call, different behavior
        for (Employee e : employeeManager.getAllEmployees()) {
            System.out.println(e.getName() + " bonus: " + e.getBonus());
        }


        System.out.println("\n=== PART D: Exception Handling ===");
        // TODO: Use try/catch to demonstrate:
        //   1. Trying to remove an employee that doesn't exist
        //   2. Trying to promote an employee that's already a Manager
        //   3. Trying to create an Employee with invalid data (negative salary)
        // Each try/catch should print the error message gracefully

    }
}

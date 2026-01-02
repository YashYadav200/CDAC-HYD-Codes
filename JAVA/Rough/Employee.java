public class Employee extends Person {
    int empId;

    // Derived class constructor calling base class constructor
    public Employee(String name, int empId) {
        super(name);   // Call Person constructor
        this.empId = empId;
        System.out.println("Employee constructor called");
    }
}

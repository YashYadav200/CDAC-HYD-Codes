public class Employee extends Person {
    protected double salary;

    public void setData(String name, int age, double salary) {
        super.setData(name, age); // call parent method
        this.salary = salary;
    }

    @Override
    public void getData() {
        super.getData(); // call parent method
        System.out.println("Salary: " + salary);
    }
}

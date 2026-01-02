public class Manager extends Employee {
    private String department;

    public void setData(String name, int age, double salary, String department) {
        super.setData(name, age, salary); // call Employee's setData
        this.department = department;
    }

    @Override
    public void getData() {
        super.getData(); // call Employee’s getData
        System.out.println("Department: " + department);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Creating object of Person
        System.out.println("Creating Person object:");
        Person p = new Person("John");

        System.out.println();

        // Creating object of Employee
        System.out.println("Creating Employee object:");
        Employee e = new Employee("Alice", 101);
    }
}
/*Demonstrate
how to use com Write a Java class representing a Student. Encapsulate the student's name,
age, and grade point average (GPA) with private access modifiers. Provide getter and setter
methods to access and modify these attributes position to model the relationship between a
person and their address*/
public class StudentGPA {
    private String name;
    private int age;
    private double gpa;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }
}

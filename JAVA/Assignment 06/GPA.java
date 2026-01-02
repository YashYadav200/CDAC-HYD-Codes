public class GPA{
	public static void main(String[] args) {
		StudentGPA g = new StudentGPA();
        g.setName("Yash");
        g.setAge(21);
        g.setGpa(8.9);

        System.out.println("Name: " + g.getName());
        System.out.println("Age: " + g.getAge());
        System.out.println("GPA: " + g.getGpa());

	}
}
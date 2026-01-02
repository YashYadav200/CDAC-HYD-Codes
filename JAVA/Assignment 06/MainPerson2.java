public class MainPerson2{
	public static void main(String[] args) {
		Person2 p = new Person2("Yash",21,"India");
		Person2 p2 = new Person2();
		p.view();
		System.out.println("sum is "+p.Sum(5,6));
	}
}
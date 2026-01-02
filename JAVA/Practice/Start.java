public class Start{
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setEmp("Demon",777,100000,"ArcVillage");
		e1.calSalary();
		e1.disEmp(); 
		System.out.println("***************************");
		TecEmp t1 = new TecEmp();
		t1. setEmp("Muzan",111,600000,"InfinityCastle");
		t1.disEmp();
		System.out.println(t1.getBonuce());
	}
}
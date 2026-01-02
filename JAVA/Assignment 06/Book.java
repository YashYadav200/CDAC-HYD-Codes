public class Book{
	private String bname;
	private double price;
	Author  author;

	public void setdata(String bname, double price, Author author){
		this.bname = bname;
		this.price = price;
		this.author = author;
	}

	public void getdata(){
		System.out.println("Book : "+bname+" Price : "+price);
		author.getdata();
	}

}
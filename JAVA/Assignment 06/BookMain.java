// BookMain.java
public class BookMain {
    public static void main(String[] args) {
        Library l = new Library();

        Author a1 = new Author();
        a1.setdata("J.K. Rowling", "British");

        Book b1 = new Book();
        b1.setdata("Baki", 600, a1);

        Author a2 = new Author();
        a2.setdata("Dan Brown", "American");

        Book b2 = new Book();
        b2.setdata("Demon Slayer", 950, a2);

 
    }
}

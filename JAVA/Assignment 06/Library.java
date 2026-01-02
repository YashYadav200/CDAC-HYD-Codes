// Library.java
public class Library {
    Book[] books = new Book[5];
    int count = 0;

    public void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void getdata() {
        for (int i = 0; i < count; i++) {
            books[i].getdata();
            System.out.println("------------------");
        }
    }
}

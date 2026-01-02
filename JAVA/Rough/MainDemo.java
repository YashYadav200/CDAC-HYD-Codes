public class MainDemo {
    public static void main(String[] args) {
        
        Parent p = new Parent();
        p.displayParent();
      
        Child c = new Child();
        c.displayChild();
        
        c.displayParent();
    }
}

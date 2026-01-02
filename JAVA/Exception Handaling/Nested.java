public class Nested { 
    public static void main(String[] args) {
        try {
            System.out.println("Entered outer try");
            int x = (int)(Math.random() * 5.0);
            int res = 21 / x;
            System.out.println(x);

            try {
                System.out.println("Entered 1st nested try");
                String s = null;
                System.out.println(((String)s).length());
            } catch (NullPointerException var5) {
                System.err.println(var5);
            }

            try {
                System.out.println("Entered 2nd nested try");
                int[] arr = new int[5];
                arr[5] = 199139;
            } catch (ArrayIndexOutOfBoundsException var4) {
                System.err.println(var4);
            }
        } catch (Exception var6) {
            System.err.println(var6);
        }
        System.out.println("Rest of the code follows.....");
    }
}

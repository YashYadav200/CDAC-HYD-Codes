import java.util.Scanner;
class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for GCD:");
        int x = sc.nextInt(), y = sc.nextInt();
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD: " + x);
    }
}

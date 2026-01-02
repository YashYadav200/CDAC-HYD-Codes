import java.util.Scanner;
class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Fibonacci terms:");
        int terms = sc.nextInt();
        int a = 0, b = 1;
        for(int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

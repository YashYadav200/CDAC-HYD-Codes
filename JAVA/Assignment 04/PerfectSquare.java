import java.util.Scanner;
class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int sqrt = (int)Math.sqrt(n);
        System.out.println(sqrt*sqrt == n ? "Perfect Square" : "Not Perfect Square");
    }
}

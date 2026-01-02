import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong:");
        int n = sc.nextInt(), sum = 0, original = n;
        int digits = String.valueOf(n).length();
        while(n != 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        System.out.println(sum == original ? "Armstrong" : "Not Armstrong");
    }
}

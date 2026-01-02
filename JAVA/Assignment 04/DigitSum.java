import java.util.Scanner;
class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to sum digits:");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

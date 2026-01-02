import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check palindrome:");
        int num = sc.nextInt();
        int rev = 0, original = num;
        while(num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev == original ? "Palindrome" : "Not Palindrome");
    }
}

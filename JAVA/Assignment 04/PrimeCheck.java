import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime:");
        int num = sc.nextInt();
        boolean prime = num > 1;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}

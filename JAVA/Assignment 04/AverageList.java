import java.util.Scanner;
class AverageList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers:");
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += sc.nextDouble();
        }
        System.out.println("Average: " + (sum/n));
    }
}

import java.util.Scanner;

class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light (R/Y/G): ");
        char ch = sc.next().charAt(0);  

        switch (ch) {
            case 'R':
            case 'r':
                System.out.println("Stop");
                break;

            case 'Y':
            case 'y':
                System.out.println("Wait");
                break;

            case 'G':
            case 'g':
                System.out.println("Go");
                break;

            default:
                System.out.println("Please enter From R, Y, or G.");
        }

        sc.close();
    }
}

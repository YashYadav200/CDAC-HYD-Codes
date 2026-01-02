import java.util.*;

class Facto{

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number to find factorial: ");
        int factNum = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= factNum; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + factNum + " is " + fact + "\n");

 }

}


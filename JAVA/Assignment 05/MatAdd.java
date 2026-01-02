import java.util.*;

class MatAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter rows & cols: ");
        r = sc.nextInt();
        c = sc.nextInt();
        
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int s[][] = new int[r][c];
        
        System.out.println("Enter 1st matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        
        System.out.println("Enter 2nd matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();
        
        System.out.println("Sum:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                s[i][j] = a[i][j] + b[i][j];
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}

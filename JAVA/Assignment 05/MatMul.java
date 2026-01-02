import java.util.*;

class MatMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.print("Enter rows & cols of 1st: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.print("Enter rows & cols of 2nd: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        
        if (c1 != r2) {
            System.out.println("Not possible!");
            return;
        }
        
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int m[][] = new int[r1][c2];
        
        System.out.println("Enter 1st matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();
        
        System.out.println("Enter 2nd matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();
        
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                m[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    m[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

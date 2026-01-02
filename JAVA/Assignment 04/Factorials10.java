class Factorials10 {
    public static void main(String[] args) {
        for(int n = 1; n <= 10; n++) {
            int fact = 1;
            for(int i = 1; i <= n; i++) fact *= i;
            System.out.println("Factorial of " + n + " = " + fact);
        }
    }
}

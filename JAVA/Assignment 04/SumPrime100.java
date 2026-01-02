class SumPrime100 {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++) if(n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 100; i++) if(isPrime(i)) sum += i;
        System.out.println("Sum of primes 1-100: " + sum);
    }
}

class SumOdd50 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 50; i += 2) sum += i;
        System.out.println("Sum of odd numbers 1-50: " + sum);
    }
}

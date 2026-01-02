import java.util.Scanner;
class StringPalindromeLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        int i = 0, j = str.length() - 1;
        boolean pal = true;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                pal = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(pal ? "Palindrome" : "Not Palindrome");
    }
}

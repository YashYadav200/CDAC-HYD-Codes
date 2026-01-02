import java.util.Scanner;
class StrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome:");
        String str = sc.next(), rev = "";
        for(int i = str.length()-1; i >= 0; i--) rev += str.charAt(i);
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}

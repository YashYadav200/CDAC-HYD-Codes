import java.util.Scanner;
class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine().toLowerCase();
        boolean[] seen = new boolean[26];
        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') seen[c - 'a'] = true;
        }
        boolean pangram = true;
        for(boolean b : seen) if(!b) { pangram = false; break; }
        System.out.println(pangram ? "Pangram" : "Not Pangram");
    }
}

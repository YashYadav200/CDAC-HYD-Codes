import java.util.*;
class Vowels{
	public static void main(String[] args) {
		System.out.println("Enter the Character To check whether it vowel or consonant.: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
		{
			System.out.println("The Given Character " +ch+ " is a Vowel");
		}
		else{
			System.out.println("The Given Character "+ch+" is  Consonant");
		}

	}
}
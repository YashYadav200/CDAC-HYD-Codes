import java.util.*;
class Grading{
	public static void main(String[] args) {

		int n = 0;

		System.out.println("Student Grading Criteria ");
		System.out.println("Student grade 'A' -> 100% - 90%");
        System.out.println("Student grade 'B' -> 89% - 79%");
        System.out.println("Student grade 'C' -> 69% - 50%");
        System.out.println("Student grade 'D' -> 49% - 41%");

		System.out.println("Enter Student Marks");

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Maths Marks:");
		int math = sc.nextInt();
		System.out.println("Enter English Marks:");
		int eng  = sc.nextInt();
		System.out.println("Enter Science Marks:");
		int scie = sc.nextInt();
		System.out.println("Enter Social Science Marks:");
		int sst = sc.nextInt();
		System.out.println("Enter Language Marks:");
		int hin = sc.nextInt();
             if (math>100||eng>100||scie>100||sst>100||hin>100) 
            {
        	System.out.println("Invalid");
        	return;
            }
             else if (math<40||eng<40||scie<40||sst<40||hin<40)
        	{
        		System.out.println("Fail");
        		System.out.println("Better Luck Next time");
        		return;
         	}
        System.out.println("Student grade 'A' - 100% - 90%");
        System.out.println("Student grade 'B' - 89% - 79%");
        System.out.println("Student grade 'C' - 69% - 50%");
        System.out.println("Student grade 'D' - 49% - 41%");

		int  sum = (math + eng + scie + sst + hin);

		System.out.println("Total Marks = "+sum);

		Double per = (sum/500.0)*100;

		System.out.println("Overall Percentage ="+ per);
		int Flag = 0;
		 n = sum/50;	 
		switch (n) {
			case 1:
			case 2:
			case 3:System.out.println("Fail");break;
			case 4:System.out.println("Student grade is D"); break;
			case 5:System.out.println("Student grade is C"); break;
			case 6:
			case 7:System.out.println("Student grade is B");break;

			case 8:break;
			case 9:System.out.println("Student grade is A");break;
			case 10:System.out.println("Student grade is A++");break;
		}
		System.out.println("Congragulation");
	}
	
	}
	
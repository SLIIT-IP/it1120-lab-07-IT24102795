import java.util.Scanner;
public class IT24102795Lab7Q1B   {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        double avg;
        String grade;
	int marks;
      
	for(int studentCount =1; studentCount <= 3; studentCount++) {
		System.out.println("Student " + studentCount);
		System.out.print("Enter Marks : ");
		

		int sum = 0;
		int count = 1;

		for(count = 1; count <=4; count++) {
			
			marks = input.nextInt();
			sum = sum + marks;
		   }

		avg = sum / (count - 1);

		if (avg >= 75 && avg <= 100) {
			grade = "Distinction";
		  }
		 else if (avg >= 50 && avg <= 74) {
			grade = "Credit";
		   }

		else {
			grade = "Fail";
		  }

			System.out.println("Average is : " + avg);
			System.out.print("Overall Grade is : " + grade);

		System.out.println("\n");

	}

    }
}
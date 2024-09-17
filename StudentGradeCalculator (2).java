import java.util.Scanner;
public class StudentGradeCalculator
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Student Grade Calculator");
	    System.out.print("Enter No Of Subjects:");
	    int no_of_subjects = scan.nextInt();
	    int total = 0;
	    for(int i=0;i<no_of_subjects;i++)
	    {
	        System.out.print("Enter Marks Obtained in "+(i+1)+": ");
	        int marks = scan.nextInt();
	        total+=marks;
	    }
	    double avg_percentage = (double)total/no_of_subjects;
	char Grade;
	if(avg_percentage>=90)
	{
	    Grade = 'O';
	}
	else if(avg_percentage>=80)
	{
	    Grade = 'S';
	}
	else if(avg_percentage>=70)
	{
	    Grade = 'A';
	}
	else if(avg_percentage>=60)
	{
	    Grade = 'B';
	}
	else if(avg_percentage>=50)
	{
	    Grade = 'C';
	}
	else if(avg_percentage>=40)
	{
	    Grade = 'D';
	}
	else
	{
	    Grade = 'F';
	}
	System.out.println("Total Marks Scored Is "+ total);
	System.out.println("Average Percentage Gained is "+avg_percentage+"%");
	System.out.println("Grade :"+Grade);
	}
}
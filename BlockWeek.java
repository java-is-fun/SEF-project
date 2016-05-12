import java.util.Scanner;

public class BlockedWeek {

	//instance variable
	int week;
	
	
	//creating an instance from constructor
	public static void main(String args[])
	{
		BlockedWeek week = new BlockedWeek(); 
		week.type = "blocked";
		week.setBlock();
		
		Scanner scanner = new Scanner(System.in);
	}
	
	//Setters
	
	
	//Getters
	
	
	
	//method 
	public void setBlock() 
	{
		System.out.print("Enter blockweek");
		int input = sc.nextLine(); 
		int weekNumber = input;
		
		switch (weekNumber) {
			case 1 : System.out.println("Week 1 Blocked")
				break;
			case 1.5: System.out.println("Week 1 Partially Blocked")
				break;
			case 2 : System.out.println("Week 2 Blocked")
				break;
			case 2.5  : System.out.println("Week 2 partially Blocked")
				break;
			case 3 : System.out.println("Week 3 Blocked")
				break;
			case 3.5  : System.out.println("Week 3 partially Blocked")
				break;
			case 4  : System.out.println("Week 4 Blocked")
				break;
			case 4.5 : System.out.println("Week 4 partially Blocked")
				break;
			case 5  : System.out.println("Week 5 Blocked")
				break;
			case 5.5  : System.out.println("Week 5 partially Blocked")
				break;
			case 6  : System.out.println("Week 6 Blocked")
				break;
			case 6.5  : System.out.println("Week 6 partially Blocked")
				break;
			case 7 : System.out.println("Week 7 Blocked")
				break;
			case 7.5  : System.out.println("Week 7 partially Blocked")
				break;
			case 8  : System.out.println("Week 8 Blocked")
				break;
			case 8.5  : System.out.println("Week 8 partially Blocked")
				break;
			case 9  : System.out.println("Week 9 Blocked")
				break;
			case 9.5  : System.out.println("Week 9 partially Blocked")
				break;
			case 10  : System.out.println("Week 10 Blocked")
				break;
			case 10.5  : System.out.println("Week 10 partially Blocked")
				break;
			
			default : System.out.println("Choose Another Week!")
				break;
		}	

	}
}

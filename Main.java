import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);

	// Array list of projects here?

	public static void main(String[] args) {
		String input;

		char option = '\0';
		// while exit program has not been selected
		do {
			// display menu options
			System.out.println("Project management system");
			System.out.println("");
			System.out.println("A. Add project");
			System.out.println("B. Add activities");
			System.out.println("C. View all projects");
			System.out.println("D. Autofill projects");
			System.out.println("X. Exit Program");
			System.out.println();
			
	        /*
		    System.out.println("A - Add skills"); 
		    System.out.println("B - Add blocked weeks");
		    System.out.println("X. Exit Program");
		    
		    System.out.println("A - Set rates");
		    System.out.println("X. Exit Program");
	        */
			
			System.out.print("Enter an option: ");
			input = sc.nextLine();
			
			System.out.println();
			
			// 1 length input
			if (input.length() != 1) {
				System.out.println("Too long");
			
			} else {
				option = Character.toUpperCase(input.charAt(0));			
				// process choices
				switch (option) {
				// option a - add project
				case 'A':
					addProject();
					break;
					
				// option b - add activity
				case 'B':
					addActivity();
					break;
					
				// option c - view all project
				case 'C':
					viewAllProjects();
					break;				
					
				// option d - auto fill
				case 'D':
					autofillProject();
					break;
					
				// exit case
				case 'X':
					System.out.println("Exiting...");
					break;
					
				default:
					System.out.println("Error - Invalid selection. Please try again");
				}
			}
			System.out.println();

		} while (option != 'X');
	}

	public static void addProject() {
		System.out.println("Add Project selected");
	}

	public static void addActivity() {
		System.out.println("Add Activities selected");
	}
	
	public static void viewAllProjects() {
		System.out.println("View Projects selected");
	}

	public static void autofillProject() {
		System.out.println("Autofill project selected");
	}
}
Status API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Contact Help

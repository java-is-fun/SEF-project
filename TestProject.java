import java.util.ArrayList;
import java.util.Scanner;

public class TestProject {
	public static void main(String args[]) 
	{
		boolean flag = true;
		String choice;
		String projectName;
		int startDate, projectType;
		Scanner sc = new Scanner(System.in);
		Project newProject = new Project("Test1", 1, 1);  
		ArrayList<Project> projectList = new ArrayList<Project>();
		System.out.printf("********Create Project********\n");
		while(flag) {
			System.out.println("Please Enter Project Name: ");
			projectName = sc.nextLine();
			System.out.println("Please Enter Project Start Date: ");
			startDate = sc.nextInt();
			System.out.println("Please Enter Project Type: ");
			projectType = sc.nextInt();
			projectList.add(new Project(projectName, startDate, projectType));
			System.out.printf("Would you like to add another project?\n"
					+ "Y or y = Yes\n"
					+ "N or n = no");
			sc.nextLine();
			choice = sc.nextLine();
			if(choice.equals("y") || choice.equals("Y")) {
				flag = true;
			}
			else if(choice.equals("n") || choice.equals("N")){
				flag = false;							
			}
			else{ 
				System.out.println("Invalid input");
				flag = false;
			}
		}
	
	
	
	
	
	
    }
	public void printProjectDetails(){
		
	}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class testEmployee {

	public static void main(String args[]) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		HashMap<String, Integer> employeeSkills = new HashMap<String, Integer>();
		Employee mai = new Manager("Mai");
		Staff adrian = new Staff("Adrian", null);
		Staff young = new Staff("Young", null);
		Staff forest = new Staff("Forest", null);
		Employee jackson = new ContractStaff("Jackson", 100);
		employeeList.add(mai);
		employeeList.add(adrian);
		employeeList.add(young);
		employeeList.add(forest);
		employeeList.add(jackson);
		/*
		 * 
		 * hey
		 */

		String skill = "Java";
		int level = 5;
		String skill1 = "PHP";
		int level1 = 10;
		boolean flag = true;
		while (flag) {
			System.out.println("Enter employee name: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			if (name.equals("Adrian")) {
				System.out.println("Enter new skill and level");
				String newSkill = sc.nextLine();

				employeeSkills.put(skill, level);
				employeeSkills.put(newSkill, level1);
				adrian.setSkillList(employeeSkills);
				for (HashMap.Entry<String, Integer> entry : adrian.getSkillList().entrySet()) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
			} else {
				employeeSkills.put(skill, level);
				young.setSkillList(employeeSkills);
				System.out.println(young.getSkillList());
			}
		}

	}

}

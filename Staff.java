import java.util.HashMap;
import java.util.Map;

public class Staff extends Employee {
	// instance variables
	private Map<String, Integer> skillList = new HashMap<String, Integer>();
	private String blockedWeeks;

	// constructor
	public Staff(String name, HashMap<String, Integer> skillList) {
		super(name);
		this.setSkillList(skillList);
	}

	public String getBlockedWeeks() {
		return blockedWeeks;
	}

	public void setBlockedWeeks(String blockedWeeks) {
		this.blockedWeeks = blockedWeeks;
	}

	public Map<String, Integer> getSkillList() {
		return skillList;
	}

	public void setSkillList(Map<String, Integer> employeeSkills) {
		this.skillList = employeeSkills;
	}

}

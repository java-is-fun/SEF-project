import java.util.ArrayList;

public class Activity {
	private String name;
	private int duration;
	private int staffNeeded;
	private ArrayList<Integer> skillList = new ArrayList<Integer>();
	private int dependencyLevel;

	public Activity(String name, int duration, int staffNeeded, ArrayList<Integer> skillList, int dependencyLevel) {
		this.name = name;
		this.duration = duration;
		this.staffNeeded = staffNeeded;
		this.setSkillsType(skillList);
	}

	public int getDuration() {
		return duration;
	}

	public int getStaffNeeded() {
		return staffNeeded;
	}

	public int getDependencyLevel() {
		return dependencyLevel;
	}

	public void setDependencyLevel(int dependencyLevel) {
		this.dependencyLevel = dependencyLevel;
	}

	public ArrayList<Integer> getSkillsType() {
		return skillList;
	}

	public void setSkillsType(ArrayList<Integer> skillsType) {
		this.skillList = skillsType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

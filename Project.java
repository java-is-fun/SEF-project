public class Project {
	// instance variables
	private String name;
	private int startDate;
	private int projectType;

	// total of activity
	private int totalStaffNeeded;
	private int totalSkillsNeeded;
	private int totalDuration;

	Project dependencies;

	// constructor
	public Project(String name, int startDate, int projectType) {
		this.name = name;
		this.startDate = startDate;
		this.projectType = projectType;
	}

	// accessors
	public String getName() {
		return name;
	}

	public int getTotalStaffNeeded() {
		return totalStaffNeeded;
	}

	public int getTotalSkillsNeeded() {
		return totalSkillsNeeded;
	}

	public int getStartDuration() {
		return startDate;
	}

	public int getTotalDuration() {
		return totalDuration;
	}

	// mutators
	public void setName(String name) {
		this.name = name;
	}

	public void setTotalStaffNeeded(int staffNeeded) {
		this.totalStaffNeeded = staffNeeded;
	}

	public void setTotalSkillsNeeded(int totalSkillsNeeded) {
		this.totalSkillsNeeded = totalSkillsNeeded;
	}

	public void setstartDuration(int startDuration) {
		this.startDate = startDuration;
	}

	public void setTotalDuration(int totalDuration) {
		this.totalDuration = totalDuration;
	}

	// helper
	public String getProjectType() {
		String typeOfProject;

		if (this.projectType == 1) {
			typeOfProject = "Java";
		} else if (this.projectType == 2) {
			typeOfProject = "Web Programming";
		} else if (this.projectType == 3) {
			typeOfProject = "Advertisement";
		} else if (this.projectType == 4) {
			typeOfProject = "Tutorials";
		} else {
			typeOfProject = "Invalid project type";
		}
		return typeOfProject;
	}

	/*
	 * private String getSkill() { String skill = ""; if (this.skillsNeeded ==
	 * 1) { skill = "Java background expereience"; } else if (this.skillsNeeded
	 * == 2) { skill = "HTML expereience"; } else if (this.skillsNeeded == 3) {
	 * skill = "Advertisement expereience"; } else if (this.skillsNeeded == 4) {
	 * skill = "Teaching ability"; } return skill; }
	 */

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Project type: " + getProjectType());

		/*
		 * for (int i = 0; i < activityArray.length; i++) { System.out.print(
		 * "Activities: "+activityArray[i]+", "); }
		 */

		System.out.println("Starting date: " + startDate);
		// System.out.println("Total staff needed: " + totalStaffNeeded);
		// System.out.println("Total skills needed: " + getSkill());
		// System.out.println("Duration: " + duration);
		System.out.println("");
	}
}

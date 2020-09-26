
package model;
public class Skill{
	//local variable
	Long skillld;
	String skillName;
	
	//constructor of the class
	
	public Skill(Long skillld, String skillName) {
		//super();
		this.skillld = skillld;
		this.skillName = skillName;
	}
	
	//getters and setters
	public Long getSkillld() {
		return skillld;
	}
	public void setSkillld(Long skillld) {
		this.skillld = skillld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

}

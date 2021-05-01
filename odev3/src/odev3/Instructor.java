package odev3;

public class Instructor extends User {
       
     private String experience;
     private String knowledgeable;
	 public Instructor(int id, String firstName, String lastanme, String email, String password, String experience,
			String knowledgeable) {
		super(id, firstName, lastanme, email, password);
		this.experience = experience;
		this.knowledgeable = knowledgeable;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getKnowledgeable() {
		return knowledgeable;
	}
	public void setKnowledgeable(String knowledgeable) {
		this.knowledgeable = knowledgeable;
	}
	 
      
	

}

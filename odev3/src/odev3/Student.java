package odev3;

public class Student extends User {
	
	private String homeworks;
	private String courses;
	
	public Student(int id, String firstName, String lastanme, String email, String password, String homeworks,
			String courses) {
		super(id, firstName, lastanme, email, password);
		this.homeworks = homeworks;
		this.courses = courses;
	}

	public String getHomeworks() {
		return homeworks;
	}

	public void setHomeworks(String homeworks) {
		this.homeworks = homeworks;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	
	

}

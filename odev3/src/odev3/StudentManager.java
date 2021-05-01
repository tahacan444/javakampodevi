package odev3;

public class StudentManager extends UserManager {
	public void add(Student student) {
		 
		 System.out.println(student.getFirstName() + student.getLastName() + student.getId() + student.getEmail() + student.getPassword() + student.getCourses() + student.getHomeworks());
		 
		 
	 }
	
}

package odev3;

public class InstructorManager extends UserManager {
   
	public void add(Instructor instructor) {
		 
		 System.out.println(instructor.getFirstName() + instructor.getLastName() + instructor.getId() + instructor.getEmail() + instructor.getPassword() + instructor.getExperience() + instructor.getKnowledgeable());
		 
		 
	 }
	
	 
	
	
}

package odev3;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "engindemirog", "10 yıl", "Çok Bilgili");
		System.out.println("Eğitmen Bilgileri");
		
		System.out.println(instructor.getId());
		System.out.println(instructor.getFirstName());
		System.out.println(instructor.getLastName());
		System.out.println(instructor.getEmail());
		System.out.println(instructor.getPassword());
		System.out.println("Deneyim :" + instructor.getExperience());
		System.out.println("Bilgi Sahibi : " + instructor.getKnowledgeable());
	
		System.out.println("------------------");
		System.out.println("Öğrenci Bilgileri");
		Student student = new Student(2, "Taha", "Can", "tahacan@gmail.com", "tahacan", "java" , "java-react");
		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getEmail());
		System.out.println(student.getPassword());
		System.out.println("Kurs ödevi :" +student.getHomeworks());
		System.out.println("Kurs Adı :" + student.getCourses());
		
	
	
	
	}

}

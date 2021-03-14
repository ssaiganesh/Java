
public class Student {
	String name;
	double gpa;
	String major;
	
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.major = major;
	}
	
	public boolean isOnHonorRoll() {
		if(this.gpa >= 3.5) {
			
			return true;
		}
		return false;
	}
}
	
	

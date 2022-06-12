package entities;

public class Registration {

	public String nameOfStudents;
	public String emailOfStudents;
	public int roomOfStudents;

	public Registration() {
		
	}
	public Registration(String name, String email, int room) {
		nameOfStudents = name;
		emailOfStudents = email;
		roomOfStudents = room;
	}

	public String Print() {
		return  roomOfStudents + ": " + nameOfStudents +", "+ emailOfStudents;
	}
}

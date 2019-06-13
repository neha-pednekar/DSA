package udemy.doublelinkedlist;

public class Student {

	private String firstName;
	
	private String lastName;
	
	private int rollNumber;

	public Student(String firstName, String lastName, int rollNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNumber=" + rollNumber + "]";
	}
	
	
	
	
	
}

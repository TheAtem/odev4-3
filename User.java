import java.util.Date;

public class User {
	
	int nationalId;
	String firstName;
	String lastName;
	Date birthDay;
	
	public User(int nationalId, String firstName, String lastName, Date birthDay) {
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}
	public int getNationalId() {
		return nationalId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Date getBirthDay() {
		return birthDay;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


}

import java.util.Date;

public class Customer extends User{

	int id;
	
	public Customer(int nationalId, String firstName, String lastName, Date birthDay, int id) {
		super(nationalId, firstName, lastName, birthDay);
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNationalId() {
		return super.nationalId;
	}
	public String getFirstName() {
		return super.firstName;
	}
	public String getLastName() {
		return super.lastName;
	}
	public Date getBirthDay() {
		return super.birthDay;
	}

	public void setNationalId(int nationalId) {
		super.nationalId = nationalId;
	}
	public void setFirstName(String firstName) {
		super.firstName = firstName;
	}
	public void setLastName(String lastName) {
		super.lastName = lastName;
	}
	public void setBirthDay(Date birthDay) {
		super.birthDay = birthDay;
	}

}

import java.util.Date;

public class Gamer extends User{

	int id;
	int sell;

	public Gamer(int nationalId, String firstName, String lastName, Date birthDay, int id) {
		super(nationalId, firstName, lastName, birthDay);
		this.id = id;
		this.sell = 0;
	}

	
	public int getSell() {
		return sell;
	}


	public void setSell(int sell) {
		this.sell += sell;
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

import java.text.SimpleDateFormat;
import java.util.Date;

public class Campaign {

	int id;
	String campingName;
	String details;
	Date campingStart;
	Date campingEnd;
	int discount;
	SimpleDateFormat sdf;
	public Campaign(int id, String campingName, String details, Date campingStart, Date campingEnd, int discount) {
		this.id = id;
		this.campingName = campingName;
		this.details = details;
		this.campingStart = campingStart;
		this.campingEnd = campingEnd;
		this.discount = discount;
		this.sdf = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	
	
	public int getDiscount() {
		return discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}



	public int getId() {
		return id;
	}
	public String getCampingName() {
		return campingName;
	}
	public String getDetails() {
		return details;
	}
	public Date getCampingStart() {
		return campingStart;
	}
	public Date getCampingEnd() {
		return campingEnd;
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCampingName(String campingName) {
		this.campingName = campingName;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setCampingStart(Date campingStart) {
		this.campingStart = campingStart;
	}
	public void setCampingEnd(Date campingEnd) {
		this.campingEnd = campingEnd;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	
	
	
	
}

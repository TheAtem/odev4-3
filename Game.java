
public class Game {

	int id;
	String name;
	Campaign campaign;
	double price;
	public Game(int id, String name, Campaign campaign, double price) {
		super();
		this.id = id;
		this.name = name;
		this.campaign = campaign;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

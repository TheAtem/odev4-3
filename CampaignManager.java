
public class CampaignManager {

	public void register(Campaign campaign) {
		System.out.println(campaign.getCampingName() + " kay�t edildi.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampingName() + " silindi.");
	}
	
	public void upgrade(Campaign campaign) {
		System.out.println(campaign.getCampingName() + " g�ncellendi.");
	}
}

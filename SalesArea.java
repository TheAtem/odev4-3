
public class SalesArea {

	public static Gamer gamerSeller(Game game, Customer customer, Gamer gamer) {
		
		System.out.println(game.getName() + " oyunu "+ customer.getFirstName() + " isimli müþteriye " + game.getCampaign().getCampingName() + 
				" adlý kampanya ismi ile " +gamer.getFirstName() + " isimli oyuncu tarafýndan satýldý.");
		gamer.setSell(1);
		System.out.println(gamer.getFirstName() +" isimli oyunce " + gamer.getSell() + " adet oyun sattý");
		return gamer;
	} 
	
	
	
	
}

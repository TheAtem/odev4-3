
public class SalesArea {

	public static Gamer gamerSeller(Game game, Customer customer, Gamer gamer) {
		
		System.out.println(game.getName() + " oyunu "+ customer.getFirstName() + " isimli m��teriye " + game.getCampaign().getCampingName() + 
				" adl� kampanya ismi ile " +gamer.getFirstName() + " isimli oyuncu taraf�ndan sat�ld�.");
		gamer.setSell(1);
		System.out.println(gamer.getFirstName() +" isimli oyunce " + gamer.getSell() + " adet oyun satt�");
		return gamer;
	} 
	
	
	
	
}

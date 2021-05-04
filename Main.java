
import java.text.SimpleDateFormat;


public class Main {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Gamer gamer1 = new Gamer(123, "Hakan", "Yilmaz", sdf.parse("2000-01-01"),1);
		Gamer gamer2 = new Gamer(124, "Dija", "Bulut", sdf.parse("2001-01-01"),2);
		
		Customer customer1 = new Customer(125, "Gözde", "Bardak", sdf.parse("2002-01-01"),1);
		Customer customer2 = new Customer(126, "Vokan", "Tabak", sdf.parse("2003-01-01"),2);
		Customer customer3 = new Customer(127, "Mehmet", "Vadi", sdf.parse("2005-01-01"),3);
		Customer customer4 = new Customer(128, "Dilan", "Börü", sdf.parse("1998-01-01"),4);
		Customer customer5 = new Customer(129, "Kazým", "Kýlýç", sdf.parse("1996-01-01"),5);
		Customer customer6 = new Customer(130, "Ahmet", "Kýlýnç", sdf.parse("1994-01-01"),6);
		Customer customer7 = new Customer(131, "Ahmet", "Kýlýnç", sdf.parse("1994-01-01"),6);
		
		Campaign campaign1 = new Campaign(1, "19-Mayýs", "%10 indirim",  sdf.parse("2021-05-01"), sdf.parse("2021-06-01"), 10);
		Campaign campaign2 = new Campaign(1, "30-Aðustos", "%15 indirim",  sdf.parse("2021-08-01"), sdf.parse("2021-09-10"), 15);
		
		Customer[] customers = {customer1, customer2, customer3, customer4, customer5, customer6, customer7 };
		
		Game game1 = new Game(1, "Dota-2", campaign1, 100);
		Game game2 = new Game(2, "LoL", campaign2, 150);
		
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		GamerManager gamerManager = new GamerManager();
		CustomerManager customerManager = new CustomerManager();
		
		campaignManager.register(campaign1);
		campaignManager.register(campaign2);
		
		System.out.println("================================================");
		
		gamerManager.register(gamer1);
		gamerManager.register(gamer2);
		
		System.out.println("================================================");
		
		for(Customer c : customers) {
			customerManager.register(c);
			customerManager.isGamerValid(c);
		}
		System.out.println("================================================");
		
		gameManager.register(game1);
		gameManager.register(game2);
		
		System.out.println("================================================");
		
		//SalesArea salesArea = new SalesArea();
		
		gamer1 = SalesArea.gamerSeller(game1, customer1, gamer1);
		gamer1 = SalesArea.gamerSeller(game2, customer2, gamer1);
		gamer1 = SalesArea.gamerSeller(game1, customer3, gamer1);
		
		gamer2 = SalesArea.gamerSeller(game1, customer4, gamer2);
		gamer2 = SalesArea.gamerSeller(game2, customer5, gamer2);
		gamer2 = SalesArea.gamerSeller(game1, customer6, gamer2);
		
		
		
				
		
		

	}

}


public class GamerManager extends UserManager{

	/*
	 * public void register(User gamer) { System.out.println(gamer.getFirstName() +
	 * " kayýt edildi."); }
	 * 
	 * public void delete(User gamer) { System.out.println(gamer.getFirstName() +
	 * " silindi."); }
	 * 
	 * public void update(User gamer) { System.out.println(gamer.getFirstName() +
	 * " kayýt güncellendi."); }
	 */
	
	public void isGamerValid(User gamer) throws Exception {
		if(Validation.isValid(gamer)) {
			System.out.println(gamer.firstName + " isimli kayýt var.");
		}else {
			System.out.println(gamer.firstName + " isimli kayýt yok.");
		}
	}
}

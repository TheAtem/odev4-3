
public class GameManager {

	public void register(Game game) {
		System.out.println(game.getName() + " kay�t edildi.");
	}
	
	public void delete(Game game) {
		System.out.println(game.getName() + " silindi.");
	}
	
	public void upgrade(Game game) {
		System.out.println(game.getName() + " g�ncellendi.");
	}
}


public abstract class UserManager {
	
	public  void register(User user) {
		System.out.println(user.getFirstName() + " kay�t edildi.");
		
	}
	public  void delete(User user) {
		System.out.println(user.getFirstName() + " silindi.");

	}
	public  void update(User user) {
		System.out.println(user.getFirstName() + " kay�t g�ncellendi.");

	}

}

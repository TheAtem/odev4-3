
import java.text.SimpleDateFormat;

public class Validation {

	static boolean isValid(User user) throws Exception {
		
		Loading loading = new Loading();
		loading.load();
		
		return loading.isValid(user);
	}
	
	
	private static class Loading {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		User[] users;
		public void load() throws Exception {
			
			User user1 = new User(123, "Hakan", "Yilmaz", sdf.parse("2000-01-01"));
			User user2 = new User(124, "Dija", "Bulut", sdf.parse("2001-01-01"));
			User user3 = new User(125, "Gözde", "Bardak", sdf.parse("2002-01-01"));
			User user4 = new User(126, "Vokan", "Tabak", sdf.parse("2003-01-01"));
			User user5 = new User(127, "Mehmet", "Vadi", sdf.parse("2005-01-01"));
			User user6 = new User(128, "Dilan", "Börü", sdf.parse("1998-01-01"));
			User user7 = new User(129, "Kazým", "Kýlýç", sdf.parse("1996-01-01"));
			User user8 = new User(130, "Ahmet", "Kýlýnç", sdf.parse("1994-01-01"));
			
			this.users = new User[]{user1, user2, user3, user4, user5, user6, user7, user8};
			
		}
		
		public boolean isValid(User user) {
			
			for ( User u : this.users) {
				//System.out.println(u.firstName);
				if((user.firstName == u.firstName) & (user.lastName == u.lastName) & 
						(user.nationalId == u.nationalId) & (user.birthDay.equals(u.birthDay))){
					return true;					
				}
			}
			
			return false;
		}
		
	}
	
}


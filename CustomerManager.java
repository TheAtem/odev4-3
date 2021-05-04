
public class CustomerManager extends UserManager{

	/*
	 * public void register(User customer) {
	 * System.out.println(customer.getFirstName() + " kayýt edildi."); }
	 * 
	 * public void delete(User customer) {
	 * System.out.println(customer.getFirstName() + " silindi."); }
	 * 
	 * public void update(User customer) {
	 * System.out.println(customer.getFirstName() + " kayýt güncellendi."); }
	 */
	
	public void isGamerValid(User customer) throws Exception {
		if(Validation.isValid(customer)) {
			System.out.println(customer.firstName + " isimli kayýt var.");
		}else {
			System.out.println(customer.firstName + " isimli kayýt yok.");
		}
	}

}

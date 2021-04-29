package inheritance2_odev;

public class UserManager {

	public void getNames(User[] users) {
		
		for(User user:users) {
			System.out.println("Name : " + user.getName() + " " + user.getSurname());
		}
	}
}

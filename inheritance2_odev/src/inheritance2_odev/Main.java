package inheritance2_odev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setBirthDay("28/07/1998");
		student.setId(1);
		student.setName("Fahrican");
		student.setSurname("Ka�an");
		student.setNationalIdentity("123123132");
		
		
		Instructor  hoca = new Instructor(2,"Engin","Demiro�","143123","�l�ms�z","javakamp","123");
	
		User[] users= {
				student,hoca
		};
		
		
		UserManager manager = new UserManager();
		manager.getNames(users);
		
		hoca.whoAmI();
		student.whoAmI();
	}

}

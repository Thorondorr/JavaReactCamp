package nLayeredDemo_Odev_Hafta_5.business.concretes;

import java.awt.List;
import java.util.ArrayList;



import nLayeredDemo_Odev_Hafta_5.business.abstracts.AuthService;
import nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.AuthExternal;
import nLayeredDemo_Odev_Hafta_5.dataAcces.abstracts.PersonDao;
import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public class AuthManager implements AuthService {
	
	public PersonDao personDao;
	
	
	public  AuthManager(PersonDao personDao) {
		// TODO Auto-generated constructor stub
		this.personDao=personDao;
		
	}


	@Override
	public boolean auth(String email,String password) {
		// TODO Auto-generated method stub
		ArrayList<Person> data = new ArrayList<Person>();
		data=  personDao.GetAll();//data neden null geliyor ? 
		
		for(Person item :data) {		
			if(item.getEmail()==email&&item.getPassword()==password) {
				System.out.println("Baþarý ile giriþ yapýldý!!");
				return true;
				
			}
		}
		System.out.println("Giriþ iþlemi baþarýsýz");
		return false;
	}

	
}

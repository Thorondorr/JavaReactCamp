package nLayeredDemo_Odev_Hafta_5;


import nLayeredDemo_Odev_Hafta_5.business.concretes.AuthManager;
import nLayeredDemo_Odev_Hafta_5.business.concretes.PersonMenager;
import nLayeredDemo_Odev_Hafta_5.core.helpers.concretes.FEmail;
import nLayeredDemo_Odev_Hafta_5.core.helpers.concretes.Regexes;
import nLayeredDemo_Odev_Hafta_5.dataAcces.concretes.HibernatePersonDao;
import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonMenager personelManager = new PersonMenager(new HibernatePersonDao(), new Regexes()
				,new FEmail());
		AuthManager authManager = new AuthManager(new HibernatePersonDao());
		
		Person fako = new Person(1,"Fahrican","Kaçan","fahrican.kcn@gmail.com","1234567"); 
		Person deneme = new Person();
		deneme.setEmail("ahmet@hotmail.com");
		deneme.setId(2);
		deneme.setName("Ahmet");
		deneme.setSurname("Hýzlý");
		deneme.setPassword("1234566345");
		
		//personelManager.add(fako);
		personelManager.add(deneme);
		
		authManager.auth("ahmet@hotmail.com","1234566345");
		
		
		//Regexes regexes = new Regexes();
		
		//System.out.println(regexes.checkIsEmail("fahrican.kcn@hotmail.com"));
		
	
		
	}

}

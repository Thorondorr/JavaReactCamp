package nLayeredDemo_Odev_Hafta_5.core.helpers.concretes;

import nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.Email;
import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public class FEmail implements Email{

	public void send(Person person) {
		// TODO Auto-generated method stub
		
		
		System.out.println(person.getName() +" "+ person.getSurname()+ " adli kisinin" + person.getEmail() +"adresine mail gönderildi");
		
	}
	
}

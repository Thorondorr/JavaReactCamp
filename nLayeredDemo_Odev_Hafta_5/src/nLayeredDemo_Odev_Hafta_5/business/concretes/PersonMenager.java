package nLayeredDemo_Odev_Hafta_5.business.concretes;

import nLayeredDemo_Odev_Hafta_5.business.abstracts.PersonService;
import nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.Email;
import nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.Validation;
import nLayeredDemo_Odev_Hafta_5.dataAcces.abstracts.PersonDao;
import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;


public class PersonMenager implements PersonService {

	public PersonDao personDao;
	public Validation validation;
	public Email email;
	
	public PersonMenager(PersonDao personDao,Validation validation,Email email) {
		this.personDao=personDao;
		this.validation=validation;
		this.email=email;
	}
	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		
		if(checkMinPasswordLong(person.getPassword(), 6)&&checkRequired(person)
				&&isEmailUsed(person)&& checkCharacterLenght(person.getName(), 2)&&
				checkCharacterLenght(person.getSurname(), 2)) {
			this.personDao.add(person);
			this.email.send(person);
		}else {
			System.out.println(person.getName()+ " "+ person.getSurname()+ " gerekli isterler saðlanamadý.");
		}
		
		
		
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		this.personDao.delete(person);
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		this.personDao.update(person);
		
	}
	
	//take parameter for validate password charachter length
	private boolean checkMinPasswordLong(String password,int lenght) {
		
		
		if(password.length()>lenght) {
			
			return true;
		}else {
			return false;
		}
		
	}
	
	private boolean checkRequired(Person person) {
		
		if((person.getEmail()!=null && person.getSurname()!=null
				&&person.getName()!=null&&person.getPassword()!=null
				)) {
			
			return true;
		}
		
		return false;
	}
	
	private boolean isEmailUsed(Person person) {
		Person person2 =new Person(4,"Fahrican2","Kaçan","fahrican.kcn@gmail.com","1234124");
		
		List<Person> personList= new ArrayList<Person>();
		
		personList.add(person2);
		
		for(Person item:personList) {
			
			if(item.getEmail()==person.getEmail()) {
				return false;
			}
		}
		return true;
	
	}
	
	private boolean checkCharacterLenght(String str,int len) {
		
		if(!(str.length()>=len)) {
			return false;
		}
		
		return true;
	}

}

//asda@hotmail.com
//fahrican.kcn@gmail.com

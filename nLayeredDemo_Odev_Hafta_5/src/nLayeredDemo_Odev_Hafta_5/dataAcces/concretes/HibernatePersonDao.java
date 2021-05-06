package nLayeredDemo_Odev_Hafta_5.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo_Odev_Hafta_5.dataAcces.abstracts.PersonDao;
import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public class HibernatePersonDao implements PersonDao {

	ArrayList<Person> personList = new ArrayList<Person>();
	public List<Person> getPersonList() {
		return personList;
	}

	@Override
	public void add(Person person) {
		// TODO Auto-generated method stub
		System.out.println(person.getId()+":"+person.getName() + " eklendi." );
		personList.add(person);
		
	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		System.out.println(person.getId()+":"+person.getName() + " güncellendi." );
		personList.remove(person.getId());
		personList.add(person);
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		System.out.println(person.getId()+":"+person.getName() + " silindi." );
		personList.remove(person);
	}

	@Override
	public ArrayList<Person> GetAll() {
		// TODO Auto-generated method stub
		return this.personList;
	}

	@Override
	public Person GetPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

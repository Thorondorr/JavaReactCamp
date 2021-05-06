package nLayeredDemo_Odev_Hafta_5.dataAcces.abstracts;

import java.util.ArrayList;
import java.util.List;

import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public interface PersonDao {

	void add(Person person);
	void update(Person person);
	void delete(Person person);
	ArrayList<Person> GetAll();
	Person GetPersonById(int id);
}

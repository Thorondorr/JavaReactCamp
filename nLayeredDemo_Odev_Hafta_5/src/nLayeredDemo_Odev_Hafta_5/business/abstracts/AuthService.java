package nLayeredDemo_Odev_Hafta_5.business.abstracts;

import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public interface AuthService {

	boolean auth(String email,String password);
}

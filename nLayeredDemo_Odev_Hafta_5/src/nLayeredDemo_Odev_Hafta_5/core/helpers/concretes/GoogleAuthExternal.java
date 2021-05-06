package nLayeredDemo_Odev_Hafta_5.core.helpers.concretes;

import nLayeredDemo_Odev_Hafta_5.entities.concretes.Person;

public class GoogleAuthExternal implements nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.AuthExternal {

	@Override
	public void register(String email,String password,Boolean googleAuth) {
		// TODO Auto-generated method stub
		if(googleAuth==true) {
			System.out.println("Google ile oturum açýldý.");
		}else {
			System.out.println("Giriþ bilgileriniz hatalý.");
		}
		
	}

}

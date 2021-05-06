package nLayeredDemo_Odev_Hafta_5.core.helpers.concretes;

import nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.AuthExternal;

public class YandexAuthExternal implements AuthExternal{

	@Override
	public void register(String email, String password, Boolean YandexAuth) {
		// TODO Auto-generated method stub
		if(YandexAuth==true) {
			System.out.println("Yandex ile oturum açýldý.");
		}else {
			System.out.println("Yandex bilgileriniz hatalý.");
		}
	}

}

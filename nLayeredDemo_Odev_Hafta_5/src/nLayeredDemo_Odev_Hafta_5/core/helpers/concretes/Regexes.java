package nLayeredDemo_Odev_Hafta_5.core.helpers.concretes;

import nLayeredDemo_Odev_Hafta_5.core.helpers.abstracts.Validation;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regexes implements Validation {

	@Override
	public boolean checkIsEmail(String email) {
		// Email check 
		String re = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		
		Pattern pt = Pattern.compile(re);
		Matcher matcher = pt.matcher(email);
		
		boolean result = matcher.matches();
		
		return result;
	}

	
	
	

}

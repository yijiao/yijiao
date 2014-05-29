package com.util;

import java.util.Collection;

public class ValidateUtil {
	public static boolean isValid(String s) {
		if(s == null || s.trim().equals("")) {
			return false;
		}
		
		return true;
	}
	
	public static boolean isValid(Collection col) {
		if(col == null || col.isEmpty()) {
			return false;
		}
		
		return true;
	}
}

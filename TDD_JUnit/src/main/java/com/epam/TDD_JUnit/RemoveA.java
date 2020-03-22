package com.epam.TDD_JUnit;

public class RemoveA {

	public String modify(String string) {
		// TODO Auto-generated method stub
		if(!string.contains("A"))
		{
			return string;
		}
		else
		{
			if(string.charAt(0)=='A' && string.charAt(1)=='A')
				string=string.substring(2);
			else if(string.charAt(0)=='A')
				string=string.substring(1);
			else if(string.charAt(1)=='A')
				string=string.charAt(0)+string.substring(2);
			return string;
		}
	}

}

package com.login;



public class User {
	
	private String name,password,value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// Created an simple array to hold accounts and do a rough check to match.
	protected String[] accountList = new String[]{ "admin","guest"};

	public boolean validate() {
		if ((name.equals(accountList[0]) && password.equals(accountList[1]))
				|| ((name.equals(accountList[2]) && password.equals(accountList[3])))
				|| ((name.equals(accountList[4]) && password.equals(accountList[5])))) {
			return true;
		} else {
			return false;
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
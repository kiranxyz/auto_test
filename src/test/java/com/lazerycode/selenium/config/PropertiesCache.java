package com.lazerycode.selenium.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCache {
	
	private Properties configProp=new Properties();
	public PropertiesCache()  {
		InputStream in =this.getClass().getClassLoader().getResourceAsStream("testdata.properties");
	
		try {
			configProp.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private static class LazyHolder{
		
		private static final PropertiesCache INSTANCE=new PropertiesCache();
	}
	
	public static PropertiesCache getInstance(){
		return LazyHolder.INSTANCE;
		
	}
	
	public String getProperty(String key) {
		return configProp.getProperty(key);
		
	}
	
	public String getAppUrl() {
		return getProperty("app.url");
		
	}
	public String getEmailId() {
		return getProperty("emailid");
	}
	public String getPassword() {
		return getProperty("password");
	}
	
	public String getGender() {
		return getProperty("gender");
	}
	public String getUsername() {
		return getProperty("username");
	}
	
	public String getUniversity() {
		return getProperty("university");
		
	}
	public String getfieldOfStudy() {
		return getProperty("fieldOfStudy");
		
	}
	
	public String getStudyProgram() {
		return getProperty("studyProgram");
		
	}
	public String getGmailUrl() {
		return getProperty("gmail.url");
		
	}
	public String getGmailId() {
		return getProperty("gmailid");
	}
	public String getGmailPassword() {
		return getProperty("gmailpassword");
	}
	
	public String getApplicationUrl() {
		return getProperty("appurl");
		
	}

	public String getSemester() {
		// TODO Auto-generated method stub
		return getProperty("semester");
	}

	public String getVehicleClass() {
		// TODO Auto-generated method stub
		return getProperty("vehicleclass");
	}

	public String premiumModel() {
		// TODO Auto-generated method stub
		return getProperty("premiummodel");
	}

	public String filePath() {
		// TODO Auto-generated method stub
		return getProperty("filepath");
	}

	public String typePerson() {
		// TODO Auto-generated method stub
		return getProperty("typePerson");
	}

	public String salutationHerr() {
		// TODO Auto-generated method stub
		return getProperty("salutationherr");
	}

	public String salutationFrau() {
		// TODO Auto-generated method stub
		return getProperty("salutationfrau");
	}
	public String salutationDivers() {
		// TODO Auto-generated method stub
		return getProperty("salutationdivers");
	}
	public String firstName() {
		// TODO Auto-generated method stub
		return getProperty("firstname");
	}

	public String lastName() {
		// TODO Auto-generated method stub
		return getProperty("lastname");
	}
	
	public String emailAddress() {
		// TODO Auto-generated method stub
		return getProperty("emailaddress");
	}

	public String accountOwner() {
		// TODO Auto-generated method stub
		return getProperty("accountowner");
	}

	public String iban() {
		// TODO Auto-generated method stub
		return getProperty("iban");
	}
		
}

package com.lazerycode.selenium.tests;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.SignUpPage;
import com.lazerycode.selenium.util.Query;
import com.lazerycode.selenium.config.*;


import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import java.util.Date;

import org.apache.tools.ant.types.selectors.modifiedselector.PropertiesfileCache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class SignUpTestsIT extends DriverBase {
	PropertiesCache propertiesCache =new PropertiesCache();
	
	
	private ExpectedCondition<Boolean> pageTitleStartsWith(final String searchString) {
		return driver -> driver.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
	}

	@Test(description = "Test to onboard a userfor salutation Herr")
	public void signUpTestSalutationHerr() throws Exception {
		
		WebDriver driver = getDriver();
		driver.get(propertiesCache.getAppUrl());
		Reporter.log("User open landing page "+propertiesCache.getAppUrl()+"\n");
		SignUpPage signUpPage = new SignUpPage();
		     signUpPage.scroll()
		     .selectVehicleClasses(propertiesCache.getVehicleClass())
		     .selectPremiumModel(propertiesCache.premiumModel())
		     .uploadFrontVehicleRegisterationDocument(propertiesCache.filePath())
		     .uploadBackFrontVehicleRegisterationDocument(propertiesCache.filePath())
		     .selectFurther()
		     .selectSalutation(propertiesCache.salutationHerr())
		     .inputFirstname(propertiesCache.firstName())
		     .inputLastName(propertiesCache.lastName())
		     .inputEmailAddress(propertiesCache.emailAddress())
		     .inputAccountOwner(propertiesCache.accountOwner())
		     .inputIban(propertiesCache.iban())
		     .selectFurtherButton();
		     
		               
		Assert.assertEquals(signUpPage.getSalutation(), propertiesCache.salutationHerr() );
		Assert.assertEquals(signUpPage.getFirstName(), propertiesCache.firstName() );
		Assert.assertEquals(signUpPage.getLastName(), propertiesCache.lastName() );
		Assert.assertEquals(signUpPage.getEmailAddress(), propertiesCache.emailAddress() );
		Assert.assertEquals(signUpPage.getAccountOwner(), propertiesCache.accountOwner() );
		Assert.assertEquals(signUpPage.getIban(), propertiesCache.iban() );

	}
	
@Test(description = "Test to onboard a userfor salutation Frau")
public void signUpTestSalutationFrau() throws Exception {
		
		WebDriver driver = getDriver();
		driver.get(propertiesCache.getAppUrl());
		Reporter.log("User open landing page "+propertiesCache.getAppUrl()+"\n");
		SignUpPage signUpPage = new SignUpPage();
		     signUpPage.scroll()
		     .selectVehicleClasses(propertiesCache.getVehicleClass())
		     .selectPremiumModel(propertiesCache.premiumModel())
		     .uploadFrontVehicleRegisterationDocument(propertiesCache.filePath())
		     .uploadBackFrontVehicleRegisterationDocument(propertiesCache.filePath())
		     .selectFurther()
		     .selectSalutation(propertiesCache.salutationFrau())
		     .inputFirstname(propertiesCache.firstName())
		     .inputLastName(propertiesCache.lastName())
		     .inputEmailAddress(propertiesCache.emailAddress())
		     .inputAccountOwner(propertiesCache.accountOwner())
		     .inputIban(propertiesCache.iban())
		     .selectFurtherButton();
		     
		               
		Assert.assertEquals(signUpPage.getSalutation(), propertiesCache.salutationFrau() );
		Assert.assertEquals(signUpPage.getFirstName(), propertiesCache.firstName() );
		Assert.assertEquals(signUpPage.getLastName(), propertiesCache.lastName() );
		Assert.assertEquals(signUpPage.getEmailAddress(), propertiesCache.emailAddress() );
		Assert.assertEquals(signUpPage.getAccountOwner(), propertiesCache.accountOwner() );
		Assert.assertEquals(signUpPage.getIban(), propertiesCache.iban() );

	}
	
@Test(description = "Test to onboard a userfor salutation Divers")
public void signUpTestSalutationDivers() throws Exception {
	
	WebDriver driver = getDriver();
	driver.get(propertiesCache.getAppUrl());
	Reporter.log("User open landing page "+propertiesCache.getAppUrl()+"\n");
	SignUpPage signUpPage = new SignUpPage();
	     signUpPage.scroll()
	     .selectVehicleClasses(propertiesCache.getVehicleClass())
	     .selectPremiumModel(propertiesCache.premiumModel())
	     .uploadFrontVehicleRegisterationDocument(propertiesCache.filePath())
	     .uploadBackFrontVehicleRegisterationDocument(propertiesCache.filePath())
	     .selectFurther()
	     .selectSalutation(propertiesCache.salutationDivers())
	     .inputFirstname(propertiesCache.firstName())
	     .inputLastName(propertiesCache.lastName())
	     .inputEmailAddress(propertiesCache.emailAddress())
	     .inputAccountOwner(propertiesCache.accountOwner())
	     .inputIban(propertiesCache.iban())
	     .selectFurtherButton();
	     
	               
	Assert.assertEquals(signUpPage.getSalutation(), propertiesCache.salutationDivers() );
	Assert.assertEquals(signUpPage.getFirstName(), propertiesCache.firstName() );
	Assert.assertEquals(signUpPage.getLastName(), propertiesCache.lastName() );
	Assert.assertEquals(signUpPage.getEmailAddress(), propertiesCache.emailAddress() );
	Assert.assertEquals(signUpPage.getAccountOwner(), propertiesCache.accountOwner() );
	Assert.assertEquals(signUpPage.getIban(), propertiesCache.iban() );

}
}
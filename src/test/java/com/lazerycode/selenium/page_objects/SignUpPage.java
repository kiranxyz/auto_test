package com.lazerycode.selenium.page_objects;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.config.PropertiesCache;
import com.lazerycode.selenium.util.Query;
import java.awt.AWTException;	
import java.awt.Robot;	
import java.util.Random;
import java.awt.event.KeyEvent;	
import junit.framework.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class SignUpPage {
	WebDriverWait wait;
	int int_random ;
	PropertiesCache propertiesCache =new PropertiesCache(); 
    private Query spaceList = new Query().defaultLocator(By.xpath("//*[@id='__layout']/div/div[1]/main/section/div/div[2]/div/div/ul/li"));
    private Query space = new Query().defaultLocator(By.xpath("//*[@id='__layout']/div/div[1]/main/section/div/div[2]/div/div/ul"));
   
    public SignUpPage() throws Exception {
    	
        initQueryObjects(this, DriverBase.getDriver());
        wait = new WebDriverWait(DriverBase.getDriver(), 50, 200);

    }
    
    public SignUpPage scroll() throws Exception {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@id='Fahrzeugklassen']")));
    	JavascriptExecutor jse = (JavascriptExecutor)DriverBase.getDriver();
    	jse.executeScript("window.scrollBy(0,250)");
    	
        
          return this;
      }
    public SignUpPage selectVehicleClasses(String vehicleClass) throws Exception {
    	
   	 Query element = new Query().defaultLocator(By.xpath("//span[normalize-space()='"+vehicleClass+"']")).usingDriver(DriverBase.getDriver());	 
   	 element.findWebElement().click();  
     Reporter.log("User clicks "+vehicleClass+"\n");
       
       return this;
   }

    

    public String getSalutation() throws Exception {
    	
    	Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-step3/div/app-form-info/div/table/tr[1]/td[2]")).usingDriver(DriverBase.getDriver());	 
    	String text = element.findWebElement().getText();
    

        return text;
    }
      
    

    public String getFirstName() throws Exception {
    	
    	Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-step3/div/app-form-info/div/table/tr[2]/td[2]")).usingDriver(DriverBase.getDriver());	 
    	String text = element.findWebElement().getText();
    

        return text;
    }

    public String getLastName() throws Exception {
    	
    	Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-step3/div/app-form-info/div/table/tr[3]/td[2]")).usingDriver(DriverBase.getDriver());	 
    	String text = element.findWebElement().getText();
    

        return text;
    }

    public String getEmailAddress() throws Exception {
    	
    	Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-step3/div/app-form-info/div/table/tr[4]/td[2]")).usingDriver(DriverBase.getDriver());	 
    	String text = element.findWebElement().getText();
    

        return text;
    }

    public String getAccountOwner() throws Exception {
    	
    	Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-step3/div/app-form-info/div/table/tr[5]/td[2]")).usingDriver(DriverBase.getDriver());	 
    	String text = element.findWebElement().getText();
    

        return text;
    }

    public String getIban() throws Exception {
    	
    	Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/app-step3/div/app-form-info/div/table/tr[6]/td[2]")).usingDriver(DriverBase.getDriver());	 
    	String text = element.findWebElement().getText();
    

        return text;
    }

   
    
  
    public boolean verifyScreenshot() throws Exception {
      	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='__layout']/div/div[1]/main/section/div/div[1]/div/div/div[1]/div[2]")));
        
         Screenshot screenshot = new AShot().
        		        		 takeScreenshot(DriverBase.getDriver());
         BufferedImage actualImage = screenshot.getImage();
         ImageIO.write(screenshot.getImage(),"PNG",new File("//Users//anila//Downloads//test_solution//selenium//src//test//resources//ElementScreenshot.png"));
         BufferedImage expectedImage = ImageIO.read(new File("//Users//anila//Downloads//test_solution//selenium//src//test//resources//ExpectedElementScreenshot.png"));
         ImageDiffer imgDiff = new ImageDiffer();
         ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
        return diff.hasDiff();
	}

	public SignUpPage selectPremiumModel(String premiumModel) throws Exception {
		
		if(premiumModel.equalsIgnoreCase("Flex Premium")) {
		
	   	 Query element = new Query().defaultLocator(By.xpath("(//span[@class='mdc-button__label'][normalize-space()='Prämie beantragen'])[1]")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().click();  
	     Reporter.log("User clicks "+premiumModel+"\n");
		}
		
		else  {
			
			 Query element = new Query().defaultLocator(By.xpath("(//span[@class='mdc-button__label'][normalize-space()='Prämie beantragen'])[2]")).usingDriver(DriverBase.getDriver());	 
		   	 element.findWebElement().click();  
		     Reporter.log("User clicks "+premiumModel+"\n");
		     
	}
		 return this;
	}

	public SignUpPage uploadFrontVehicleRegisterationDocument(String filepath) throws Exception {
		WebElement element =DriverBase.getDriver().findElement(By.xpath("(//input[@name='file-upload'])[1]"));
	   	 element.sendKeys(filepath); 
	   	 Reporter.log("User uploads file successfully \n");
		return this;
	}
	
	public SignUpPage uploadBackFrontVehicleRegisterationDocument(String filepath) throws Exception {
		WebElement element =DriverBase.getDriver().findElement(By.xpath("(//input[@name='file-upload'])[1]"));
	   	 element.sendKeys(filepath);
	 	 Reporter.log("User uploads file successfully \n");
		      
		return this;
	}

	public SignUpPage selectFurther() throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("(//div[contains(text(),'Weiter')])[1]")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().click();  
	   	 Reporter.log("User selects further button \n");
	   	  return this;
		}
	public SignUpPage selectFurtherButton() throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/app-step2/app-stepper-buttons/div/div[2]/button[2]/span[5]")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().click();  
	   	 Reporter.log("User selects further button \n");
	   	  return this;
		}

	public SignUpPage selectType(String type) throws Exception {
		if(type.equalsIgnoreCase("Privat")) {
			
			 
		 Query element = new Query().defaultLocator(By.xpath("//label[contains(text(),"+type+")]")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().click();  
	   	 Reporter.log("User selects type"+type+" \n");
		}
		else{
			 Query element = new Query().defaultLocator(By.xpath("//label[contains(text(),"+type+")]")).usingDriver(DriverBase.getDriver());	 
		   	 element.findWebElement().click();  
		   	 Reporter.log("User selects type"+type+" \n");
		}
	   	 
		 return this;
	}

	public SignUpPage selectSalutation(String salutationHerr) throws Exception {
		
		 Query element = new Query().defaultLocator(By.xpath("//div[@id='mat-select-value-1']")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().click();  
	
		if(salutationHerr.equalsIgnoreCase("Herr")) {
			
		   element = new Query().defaultLocator(By.xpath("//span[normalize-space()='Herr']")).usingDriver(DriverBase.getDriver());	 
		   	 element.findWebElement().click();  
		     Reporter.log("User clicks "+salutationHerr+"\n");
			}
			
		else if(salutationHerr.equalsIgnoreCase("Frau")) {
				
				 element = new Query().defaultLocator(By.xpath("//span[normalize-space()='Frau']")).usingDriver(DriverBase.getDriver());	 
			   	 element.findWebElement().click();  
			     Reporter.log("User clicks "+salutationHerr+"\n");
			     
		}
		else if(salutationHerr.equalsIgnoreCase("Divers")) 
		{
			
			 element = new Query().defaultLocator(By.xpath("//span[normalize-space()='Divers']")).usingDriver(DriverBase.getDriver());	 
		   	 element.findWebElement().click();  
		     Reporter.log("User clicks "+salutationHerr+"\n");
		     
	}
		return this;
	}
	
	
	
	public SignUpPage inputFirstname(String firstname) throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("//input[@placeholder='Max']")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().sendKeys(firstname);  
	   	 Reporter.log("User enters "+firstname+" \n");
		 return this;
	}
	
	public SignUpPage inputLastName(String lastname) throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("//input[@placeholder='Mustermann']")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().sendKeys(lastname); 
	   	 Reporter.log("User enters "+lastname+" \n");
		 return this;
	}
	
	
	public SignUpPage inputEmailAddress(String emailaddress) throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("//input[@placeholder='max.mustermann@muster.de']")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().sendKeys(emailaddress); 
	   	 Reporter.log("User enters "+emailaddress+" \n");
		 return this;
	}
	
	public SignUpPage inputAccountOwner(String accountowner) throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("//input[@placeholder='Max Mustermann']")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().sendKeys(accountowner); 
	   	 Reporter.log("User enters "+accountowner+" \n");
		 return this;
	}
	public SignUpPage inputIban(String iban) throws Exception {
		 Query element = new Query().defaultLocator(By.xpath("//input[@placeholder='z.B. DE45 7890 8965 5643 3454 00']")).usingDriver(DriverBase.getDriver());	 
	   	 element.findWebElement().sendKeys(iban); 
	   	 Reporter.log("User enters "+iban+" \n");
		 return this;
	}
	}

  

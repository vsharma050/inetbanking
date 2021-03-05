package com.inetbabanking.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;   
	
	public AddCustomerPage(WebDriver rdriver){
		
		ldriver = rdriver; 
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how= How.LINK_TEXT, using = "New Customer")
    @CacheLookup
    WebElement linkAddNewCustomer ; 	  
	
	@FindBy(how = How.NAME, using="name")
	@CacheLookup
	WebElement txtcustomerName ;
	
	@FindBy(how = How.NAME, using="rad1")
	@CacheLookup
	WebElement rdgender ;  
	
	@FindBy(how = How.ID_OR_NAME, using="dob")
	@CacheLookup
	WebElement txtdOB ;
	
	@FindBy(how = How.NAME, using="addr")
	@CacheLookup
	WebElement txtaddress ;
	
	@FindBy(how = How.NAME, using="city")
	@CacheLookup
	WebElement txtcity ;
	
	@FindBy(how = How.NAME, using="state")
	@CacheLookup
	WebElement txtstate ;
	
	@FindBy(how = How.NAME, using="pinno")
	@CacheLookup
	WebElement txtpinNumber ;
	
	@FindBy(how = How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txtmobileNumber ;
	
	@FindBy(how = How.NAME, using="emailid")
	@CacheLookup
	WebElement txtemail ;
	
	@FindBy(how = How.NAME, using="password")
	@CacheLookup
	WebElement txtpasswrd ;
	
	@FindBy(how = How.XPATH, using="//td/input[@type='submit']")
	@CacheLookup
	WebElement btnsubmit ;
	
	@FindBy(how = How.XPATH, using="//td/input[@type='reset']")
	@CacheLookup
	WebElement btnreset ;
	
	
	
	public void clickAddNewCustomer(){
		
		linkAddNewCustomer.click();
		
	}
	
	public void custName(String custName){
		
		txtcustomerName.sendKeys(custName);
		
	}
	
    public void selctGender(String cgender){
		
    	rdgender.click();
		
	}
	
    public void dateOfBirth(String mm,String dd,String yy){
		
    	txtdOB.sendKeys(mm);
    	txtdOB.sendKeys(dd);
    	txtdOB.sendKeys(yy);
	}
	
    public void address(String caddress){
		
    	txtaddress.sendKeys(caddress);
		
	}
	
    public void city(String cCity){
		
    	txtcity.sendKeys(cCity);
		
	}
	
    public void state(String cState){
		
    	txtstate.sendKeys(cState);
		
	}
    
    public void pinNumber(String cPinNumber){
		
    	txtpinNumber.sendKeys(cPinNumber);
		
	}
    
    public void mobileNumber(String cMobileNumber){
		
    	txtmobileNumber.sendKeys(cMobileNumber);
		
	}
    
    public void email(String cEmail){
		
    	txtemail.sendKeys(cEmail);
		
	}
    
    public void password(String cPassword){
		
    	txtpasswrd.sendKeys(cPassword);
		
	}
     
    public void resetBtn(){
		
    	btnreset.click();
		
	}
    
    public void submitBtn(){
		
    	btnsubmit.click();
		
	}
    
    
    
}

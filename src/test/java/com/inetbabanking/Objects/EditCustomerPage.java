package com.inetbabanking.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

	WebDriver ldriver; 
	
	public EditCustomerPage(WebDriver edriver){
		
		ldriver = edriver ;
		PageFactory.initElements(edriver,this);
		
	}
	
	@FindBy(how = How.LINK_TEXT, using="Edit Customer") 
	@CacheLookup
	WebElement linkEditCustomer ;
	
	@FindBy(how = How.NAME, using="cusid") 
	@CacheLookup
	WebElement txtCutomerId ;
	
	@FindBy(how = How.NAME, using="AccSubmit") 
	@CacheLookup
	WebElement btnSubmit ;
	
	@FindBy(how = How.NAME, using="res") 
	@CacheLookup
	WebElement btnReset ;
	
	@FindBy(how = How.NAME, using="sub") 
	@CacheLookup
	WebElement btnSubEditCusPage ;
	
	@FindBy(how = How.NAME, using="state") 
	@CacheLookup
	WebElement txtStateAddEditPage ;
	
	
	public void lnkEditCustomer(){
		
		linkEditCustomer.click();
		
	}
	
	public void txtCustomerId(String custId){
		
		txtCutomerId.sendKeys(custId);
		
	}
	
    public void btnSubmit(){
		
    	btnSubmit.click();
		
	}
	
    public void btnReset(){
		
	 btnReset .click();
		
	}
	
    public void btnSubEditCusPage(){
		
    	btnSubEditCusPage.click();
		
	}
    
    public void txtStateAddEditPage(String editState){
		
    	txtStateAddEditPage.sendKeys(editState);
		
	}
	
	
	
	
}

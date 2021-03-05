package com.inetbanking.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.inetbabanking.Objects.AddCustomerPage;
import com.inetbabanking.Objects.LoginPage;

import junit.framework.Assert;

@Test
public class TC_AddCutomer_Test_003 extends BaseClass {

	
	@Test 
	public void addNewCustomer() throws InterruptedException, IOException
	{
		
		LoginPage lp= new LoginPage(driver);
		lp.setUserName(username);
		logger.info("UserName is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.btnLogin();
		logger.info("LogIn is Successed");
		Thread.sleep(3000);
        
		AddCustomerPage cust = new AddCustomerPage(driver) ;
        
		cust.clickAddNewCustomer();
		
		logger.info("providing customer details");
		
		cust.custName("Vivek Sharma");
		cust.selctGender("Male");
		cust.dateOfBirth("07","07","2017");
		Thread.sleep(3000);
		cust.address("INDIA");
		cust.city("HYD");
		cust.state("AP");
		cust.pinNumber("5000074");
		cust.mobileNumber("9459126387");
		
		
		String email = randomUserString()+"@gmail.com" ;
		cust.email(email);
		cust.password("abcdefg");
	    cust.submitBtn();
		
	    Thread.sleep(3000);
	    
	    boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!") ;
	    
	    if(result == true)
	    {
	    	
	    	Assert.assertTrue(true);
	    	logger.info("Test case is passed");
	    }
	    else{
	    	
	    	captureScreen(driver,"addNewCustomer");
	    	Assert.assertTrue(false);
	    	logger.info("Test case is failed");
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

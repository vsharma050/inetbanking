package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbabanking.Objects.EditCustomerPage;
import com.inetbabanking.Objects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass {

	
	@Test
	public void editCustomer() throws InterruptedException, IOException{
		
		
		LoginPage pl = new LoginPage(driver);
		
		pl.setUserName(username);
		logger.info("Username is provided");
		pl.setPassword(password);
		logger.info("Password is provided");
		pl.btnLogin();
		
		logger.info("User LoggedIn Successfully");
		
		EditCustomerPage ed = new EditCustomerPage(driver);
		
		ed.lnkEditCustomer();
		logger.info("Edit Customer Link");
		ed.txtCustomerId("58772");
		logger.info("User enter CustomerId");
		ed.btnSubmit();
		logger.info("User submit customerId");
		Thread.sleep(3000);
		
		String EditState = randomUserString();
		
		ed.txtStateAddEditPage(EditState);
		ed.btnSubEditCusPage();
		
		boolean result = driver.getPageSource().contains("Customer details updated Successfully!!!");
		
		
		if(result == true){
			
			Assert.assertTrue(true);
			logger.info("Test Case is Passed Succesfully");
		}
		
		else{
			
			captureScreen(driver,"editCustomer");
			Assert.assertTrue(false);
			logger.info("Test Case is failed");
		}
		
		
	}
	
	
	
	
	
}

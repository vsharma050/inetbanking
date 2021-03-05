package com.inetbanking.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbabanking.Objects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() throws IOException{
		
		driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lPage = new LoginPage(driver); 
		
		lPage.setUserName(username);
		logger.info("Entered username");
		
		lPage.setPassword(password);
		logger.info("Entered password");
		
		lPage.btnLogin();  
		logger.info("Click onSubmit button");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage12")){
			
			System.out.println(driver.getTitle());
			Assert.assertTrue(true); 
			logger.info("LognTest passed");
			
		}	
		else{
			
	       captureScreen(driver,"loginTest");
			System.out.println(driver.getTitle());
			Assert.assertTrue(false);
			logger.info("LoginTest failed");
		}
	}
}

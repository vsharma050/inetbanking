package com.inetbanking.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilites.ReadConfig;


public class BaseClass {

	ReadConfig config = new ReadConfig();
	
    public String baseURL = config.getApllicationURL();
    public String username = config.getUsername();
    public String password = config.getPassword();
    public static  WebDriver driver ;	
    public Logger logger = LogManager.getLogger(BaseClass.class) ;
    
    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser){
    	
    	if(browser.equals("chrome")){
    	System.setProperty("webdriver.chrome.driver",config.getChromePath()) ;
    	driver = new ChromeDriver();
    	}
    	else if(browser.equals("ie")){
    	
    		System.setProperty("webdriver.ie.driver",config.getIEPath());
    		driver = new InternetExplorerDriver() ;
    		
    	}
    	else if(browser.equals("firefox")){
        	
    		System.setProperty("webdriver.gecko.driver",config.getFirefoxPath());
    		driver = new FirefoxDriver() ;	
    		
    	}
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.get(baseURL); 
    	driver.manage().window().maximize();
    
     
   //     String log4jConfPath = "log4j.properties";
   //    String log4jConfPath = System.getProperty("user.dir")+File.separator+"log4j.properties" ;
       
   //   PropertyConfigurator.configure(log4jConfPath );
          logger.info("Base class started");
    }
    
    @AfterClass
    public void teardown(){
    	
    	driver.quit();
    	
    } 
    
	public void captureScreen(WebDriver driver,String tname)throws IOException{
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source,target);
		System.out.println("Screenshot taken");
		
		
		
	}
	
    public String randomUserString(){
		
		String generatedString = RandomStringUtils.randomAlphabetic(5) ;
		
		return generatedString;
		
	}
	
    public String randomUserNumber(){
		
		String generatedInt = RandomStringUtils.randomNumeric(4) ;
		
		return generatedInt;
		
	}
	
	
}

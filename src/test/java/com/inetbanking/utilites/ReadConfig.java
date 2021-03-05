package com.inetbanking.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
 
	Properties pro; 
	
	public ReadConfig(){
		
		File src =  new File("./Configrations/Config.properties");
		
		try{
		FileInputStream fil = new FileInputStream(src);
		pro = new Properties();
		pro.load(fil);
		
		} 
		
		catch(Exception e){
			
			System.out.println("Exception is"+ e.getMessage());
		}
			
	}
	
	
	 public String getApllicationURL(){
		 
		 String url = pro.getProperty("baseURL");
		return url; 
	
	 }
	
    public String getUsername(){
		 
		 String username = pro.getProperty("username");
		return username; 
	
	 } 
    
    public String getPassword(){
    	
    	String password = pro.getProperty("password");
		return password;
    	
    	
    }
    
    public String getChromePath(){
    	
    	String chromePath = pro.getProperty("chromepath");
		return chromePath;
    
    } 
    
    public String getIEPath(){
    	
		String iePath = pro.getProperty("iepath");
    	return iePath ;
    }
    
    public String getFirefoxPath(){
		
    	String firefoxPath = pro.getProperty("firefoxpath");
		return firefoxPath;
    	
    	
    }
    
}

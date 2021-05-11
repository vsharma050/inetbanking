package com.inetbabanking.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class) ;
		
	public static void main(String[]args){
		
		System.out.println("Hello world");
		
		logger.trace("Thie is a trac emessage");
		logger.info("this is information message");
		
		
	}
}

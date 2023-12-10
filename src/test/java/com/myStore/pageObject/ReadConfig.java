package com.myStore.pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ReadConfig {
	
	Properties props;
	
	String path="D:\\Eclipse Workspace\\seleniumframework.com\\config\\config.properties";
	
	public ReadConfig() {
		try {
			props=new Properties();
			FileInputStream fileInputStream = new FileInputStream(path);
			props.load(fileInputStream);
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public String getBaseUrl() {
	String value=props.getProperty("url");
	if(value!=null) 
		return value;
	else 
		
		throw new RuntimeException("Url not found in property file");
	}
	
	public String getBrowser() {
		String value=props.getProperty("browser");
		if(value!=null) 
			return value;
		else 
			
			throw new RuntimeException("Browser not found in property file");
		}

}

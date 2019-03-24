package com.test.EbayWeb;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public ChromeDriver dr;
	
	
	
	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anis\\Downloads\\chromedriver.exe");//Path
		
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.get("https://www.ebay.com");
		
	}
	
	
	public void close() throws InterruptedException{
		
		Thread.sleep(5000);
		dr.quit();
	
	}

}




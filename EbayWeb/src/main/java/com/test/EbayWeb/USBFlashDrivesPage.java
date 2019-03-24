package com.test.EbayWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USBFlashDrivesPage extends TestBase {
	private WebDriver dr;
	public USBFlashDrivesPage(WebDriver m){
	dr=m;
}
	@FindBy(xpath="//*[@id=w5-xCarousel-x-carousel-items]/ul/li[3]/a/p")
	WebElement ShopByprice;	
	

	@FindBy(xpath="//*[@id=w6-xCarousel-x-carousel-items]/ul/li[9]/a/p,'1 TB')")
	WebElement ShopByStorageCapacity;
	@FindBy(xpath="//*[@id=w7-xCarousel-x-carousel-items]/ul/li[2]/a/p,'USB 3.0')")
	WebElement ShopByUSBSpecication;
	@FindBy(xpath="//*[@id=w7-xCarousel-x-carousel-items]/ul/li[2]/a/p,'ImageforUSBFlashDrive')")
	
	WebElement ImageforUSBFlashDrive1TB;
	public USBFlashDrivesPage(){
		PageFactory.initElements(dr,this);
	}
	public boolean verifyUSBFlashDrives(){
		return dr.getTitle().contains("USB Flash Drives");		
}
	public void clickShopByprice(){
		ShopByprice.click();
		
	}
	public void clickShopByStorageCapacity1TB(){
		ShopByStorageCapacity.click();
		
	}
	public void clickShopByUSBSpecication(){
		ShopByUSBSpecication.click();
		
	}
	public AddToCartPage clickImageforUSBFlashDrive1TB(){
		ImageforUSBFlashDrive1TB.click();
			return new AddToCartPage();
	}
}





package com.test.EbayWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerTabletMorePage extends TestBase {
	private WebDriver dr;
	public ComputerTabletMorePage(WebDriver m){
	dr=m;
}
	@FindBy(xpath="//*[@id=w1-w0-w3-toggle-button]/span,'Computer Drives, Storage')")
	WebElement ComputerDrivesStorageLink;	
	

	@FindBy(xpath="/*[@id=w1-w0-w3-accordion-subtree]/li[12]/a")
	WebElement USBFlashDrives;
	
	public ComputerTabletMorePage(){
		PageFactory.initElements(dr,this);
	}	
		public boolean verifyComputerTabletMorePage(){
			return dr.getTitle().contains("Computers,Tablets & More");		
}
		public void clickComputerDrivesStorageLink(){
			ComputerDrivesStorageLink.click();
			
		}
		public USBFlashDrivesPage clickUSBFlashDrives(){
			 USBFlashDrives.click();
				return new  USBFlashDrivesPage();
		}
		
			
		
}

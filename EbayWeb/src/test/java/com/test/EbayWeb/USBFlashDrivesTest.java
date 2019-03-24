package com.test.EbayWeb;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class USBFlashDrivesTest extends TestBase {
	
	HomePage homePage;
	Sign_Up_Page 	sign_up_page;
	ComputerTabletMorePage computertabletpage;
	USBFlashDrivesPage usbflashdrivespage;
	public  USBFlashDrivesTest(){
		super();
	}
	
	@BeforeMethod
	public void open(){
		sign_up_page =new Sign_Up_Page();
		computertabletpage = new ComputerTabletMorePage();
		usbflashdrivespage = new USBFlashDrivesPage();
	homePage=sign_up_page.sign_up("Urmi","Khan","urmiKhan78@gmail.com","abc123");
	}	
	@Test(priority=1)
	public void verifyclickShopByprice(){
		usbflashdrivespage.clickShopByprice();
	}	
	@Test(priority=2)
	public void verifyclickShopByUSBSpecication(){
		usbflashdrivespage.clickShopByUSBSpecication();;
			
	}
	@Test(priority=3)
	public void verifyclickShopByStorageCapacity1TB(){
		usbflashdrivespage.clickShopByStorageCapacity1TB();
			
	}
	@Test(priority=4)
	public void verifyclickImageforUSBFlashDrive1TB(){
		usbflashdrivespage.clickImageforUSBFlashDrive1TB();
			
	}
	@Test(priority=3)
	public void verifyComputerPageTitleTest(){
		boolean CompuetrTabletPagetittle=computertabletpage.verifyComputerTabletMorePage();
	Assert.assertTrue("Computer,Tablet & More",  CompuetrTabletPagetittle);
	}
	@AfterMethod
	public void close(){
	
}
}
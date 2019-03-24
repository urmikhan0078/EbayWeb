package com.test.EbayWeb;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ComputerTabletMoreTest extends TestBase {
	
	HomePage homePage;
	Sign_Up_Page 	sign_up_page;
	ComputerTabletMorePage computertabletpage;

	public ComputerTabletMoreTest(){
		super();
	}
	
	@BeforeMethod
	public void open(){
		sign_up_page =new Sign_Up_Page();
		computertabletpage = new ComputerTabletMorePage();
	homePage=sign_up_page.sign_up("Urmi","Khan","urmiKhan78@gmail.com","abc123");
	}	
	@Test(priority=1)
	public void verifyComputerDrivesStorageLink(){
		computertabletpage.clickComputerDrivesStorageLink();
	}	
	@Test(priority=2)
	public void verifyUSBFlashDrives(){
		computertabletpage.clickUSBFlashDrives();
			
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
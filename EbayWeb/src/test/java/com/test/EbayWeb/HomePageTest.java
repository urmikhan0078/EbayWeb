package com.test.EbayWeb;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HomePageTest extends TestBase {
	HomePage homePage;
	Sign_Up_Page 	sign_up_page;

	public HomePageTest(){
		super();
	}
	@BeforeMethod
	public void open(){
		sign_up_page =new Sign_Up_Page();

	homePage=sign_up_page.sign_up("Urmi","Khan","urmiKhan78@gmail.com","abc123");
	}
	@Test
	public void verifyPageTitleTest(){
		boolean HomePagetittle= homePage.verifyHomePageTitle();
	Assert.assertTrue("Home",HomePagetittle);
	}
	@Test
	public void verifyMousehoverlink(){
		homePage.mousehoverlink();
	}
	@Test
	public void verifyclickcomputerlink(){
		homePage.clickcomputerlink();
	}
	@AfterMethod
	public void close(){
	
		
	}

	}
	

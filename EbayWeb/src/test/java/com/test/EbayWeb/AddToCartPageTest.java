package com.test.EbayWeb;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AddToCartPageTest extends TestBase {
	
	HomePage homePage;
	Sign_Up_Page 	sign_up_page;
	ComputerTabletMorePage computertabletpage;
	USBFlashDrivesPage usbflashdrivespage;
	AddToCartPage addtocartpage;
	public  AddToCartPageTest(){
		super();
	}
	
	@BeforeMethod
	public void open(){
		sign_up_page =new Sign_Up_Page();
		computertabletpage = new ComputerTabletMorePage();
		usbflashdrivespage = new USBFlashDrivesPage();
		addtocartpage =new AddToCartPage();
	homePage=sign_up_page.sign_up("Urmi","Khan","urmiKhan78@gmail.com","abc123");
	}
	@Test(priority=1)
	public void verifyitemTitleTest(){
		boolean itemtittleTest=addtocartpage.verifyitemTitle();
	Assert.assertTrue("Shopping cart (1 item)",   itemtittleTest);
	}
	@Test(priority=2)
	public void verifyAddToCartTest(){
		addtocartpage.clickAddToCart();
	}
	@Test(priority=3)
	public void verifyShoppingCartTest(){
		boolean shoppingcartTest=addtocartpage.verifyshoppingCart();
		Assert.assertTrue("Lot ( 5 Pack ) Cruzer 2TB Mini Nano USB 3.0 Flash Pen Drive Memory Thumb Stick)", shoppingcartTest);
	}	
	@AfterMethod
	public void close(){
	
}
}
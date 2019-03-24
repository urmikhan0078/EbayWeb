package com.test.EbayWeb;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sign_up_Test extends TestBase {
	Sign_Up_Page 	sign_up_page;
	public Sign_up_Test(){
		super();
	}
	@BeforeMethod
	public void open(){
		sign_up_page =new Sign_Up_Page();	
	};
	@Test
	public void Sign_Up_Test(){
		sign_up_page.sign_up("Urmi","Khan","urmiKhan78@gmail.com","abc123");
	}
	@AfterMethod
	public void close(){
		
	}

}

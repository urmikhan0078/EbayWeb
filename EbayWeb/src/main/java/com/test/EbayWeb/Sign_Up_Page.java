package com.test.EbayWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up_Page extends TestBase {
	//Page Factory-OR:
	@FindBy(name="firstname")
	WebElement firstname;
	@FindBy(name="lastname")
	WebElement lastname;
	@FindBy(name="email")
	WebElement Email;
	@FindBy(name="PASSWORD")
	WebElement password;
	
	@FindBy(id="ppaFormSbtBtn")
	WebElement signupbtn;

public Sign_Up_Page(){
	PageFactory.initElements(dr,this);
}	
public HomePage sign_up(String fname,String lname,String eemail,String Pword){
	firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	Email.sendKeys(eemail);
	password.sendKeys(Pword);
	signupbtn.click();
	return new HomePage(dr);
}
	
}	
	
	
	
	








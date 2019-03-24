package com.test.EbayWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends TestBase {
	private WebDriver dr;
	public AddToCartPage(WebDriver m){
	dr=m;
}
	@FindBy(xpath="//*[@id=itemTitle]")
	WebElement itemTitleUSBFlashDrives3;
	@FindBy(xpath="//*[@id=isCartBtn_btn]")
	WebElement AddtoCart;

public AddToCartPage(){
	PageFactory.initElements(dr,this);
}
public boolean verifyitemTitle(){
	return dr.getTitle().contains("Shopping cart (1 item)");

}
public void clickAddToCart(){
	AddtoCart.click();
	
}
public boolean verifyshoppingCart(){
	return dr.getTitle().contains("Lot ( 5 Pack ) Cruzer 2TB Mini Nano USB 3.0 Flash Pen Drive Memory Thumb Stick");

}
}
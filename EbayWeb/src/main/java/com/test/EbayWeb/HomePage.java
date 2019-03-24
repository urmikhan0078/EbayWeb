package com.test.EbayWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
	private WebDriver dr;
	public  HomePage(WebDriver m){
	dr=m;

}
	@FindBy(xpath="//*[@id=mainContent]/div[1]/ul/li[5]/a,'Electronic')")
	WebElement ElectronicsLink;	
	

	@FindBy(xpath="//*[@id=mainContent]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/ul/li[3]/a")
	WebElement ComputerLink;
	
	public HomePage(){
		PageFactory.initElements(dr,this);
	}	
	//Actions
		public boolean verifyHomePageTitle(){
			return dr.getTitle().contains("Home");
			
		}
	public void mousehoverlink(){
    Actions action = new Actions(dr);
	action.moveToElement(dr.findElement( By.xpath("ElectronicsLink"))).build().perform();
	WebElement subElement = dr.findElement(By.linkText("computerLink"));
	 
    action.moveToElement(subElement);

    action.click();

    action.perform();
	}
	
public ComputerTabletMorePage clickcomputerlink(){
	ComputerLink.click();
	return new ComputerTabletMorePage();
}

}


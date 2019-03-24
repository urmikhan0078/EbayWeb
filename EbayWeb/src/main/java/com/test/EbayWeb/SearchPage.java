package com.test.EbayWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends TestBase {
	private WebDriver dr;
	public  SearchPage(WebDriver m){
	dr=m;
	
	}	
	public SearchPage(){
		PageFactory.initElements(dr,this);
	}	

}

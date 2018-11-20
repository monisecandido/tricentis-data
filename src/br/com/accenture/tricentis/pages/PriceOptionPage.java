package br.com.accenture.tricentis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceOptionPage {

	

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Select Option'])[1]/following::span[2]")
	private WebElement selectOption;

	@FindBy(id = "nextsendquote")
	private WebElement nextsendquote;
	

	public PriceOptionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	

	public void goSelectOption() {
		selectOption.click();
	}

	public void goNextSendQuote() {
		nextsendquote.click();
	}

}

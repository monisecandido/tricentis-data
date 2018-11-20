package br.com.accenture.tricentis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDataPage {
	
	

	@FindBy(id = "startdate")
	private WebElement startdate;

	@FindBy(id = "insurancesum")
	private WebElement insurancesum;

	@FindBy(id = "meritrating")
	private WebElement meritrating;

	@FindBy(id = "damageinsurance")
	private WebElement damageinsurance;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Optional Products'])[1]/following::span[1]")
	private WebElement optionalProducts;

	@FindBy(id = "courtesycar")
	private WebElement courtesycar;

	@FindBy(id = "nextselectpriceoption")
	private WebElement nextselectpriceoption;
	
	

	public ProductDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	

	public void testaProductDataPage(String startdate, String insurancesum, String meritrating, String demageinsurance,
			String courtesycar) {

	}
	

	public void typeStartDate(String value) {
		startdate.sendKeys(value);
	}

	public void typeInsuranceSum(String value) {
		insurancesum.sendKeys(value);
	}

	public void typetypeMeritRating(String value) {
		meritrating.sendKeys(value);
	}

	public void typeDamageInsurance(String value) {
		damageinsurance.sendKeys(value);
	}

	public void goOptionalProducts() {
		optionalProducts.click();
	}

	public void typeCourtesyCar(String value) {
		courtesycar.sendKeys(value);
	}

	public void goNextSelectPriceOption() {
		nextselectpriceoption.click();
	}

}

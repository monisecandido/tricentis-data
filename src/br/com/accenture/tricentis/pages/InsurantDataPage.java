package br.com.accenture.tricentis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurantDataPage {


	
	
	@FindBy(id = "firstname")
	private WebElement firstname;
	
	@FindBy(id = "lastname")
	private WebElement lastname;
	
	@FindBy(id = "birthdate")
	private WebElement birthdate;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Street Address'])[1]/preceding::span[1]")
	private WebElement gender;
	
	@FindBy(id = "streetaddress")
	private WebElement streetaddress;
	
	@FindBy(id = "country")
	private WebElement country;
	
	@FindBy(id = "zipcode")
	private WebElement zipcode;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "occupation")
	private WebElement occupation;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Select at least 1 options'])[1]/preceding::span[1]")
	private WebElement normalizeSpace;
	
	@FindBy(id = "website")
	private WebElement website;
	
	@FindBy(id = "picture")
	private WebElement picture;
	
	@FindBy(id = "nextenterproductdata")
	private WebElement nextenterproductdata;
	

	public InsurantDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	

	public void testaInsurantData(String firstname, String lastname, String birthdate, String streetaddress,
			String country, String zipcode, String city, String occupation, String website, String picture) {

	}
	
	

	public void typeFirstName(String value) {
		firstname.sendKeys(value);

	}

	public void typeLastName(String value) {
		lastname.sendKeys(value);

	}

	public void typeBirthDate(String value) {
		birthdate.sendKeys(value);
	}

	public void goGender() {
		gender.click();

	}

	public void typeStreetAddress(String value) {
		streetaddress.sendKeys(value);
	}

	public void typeCountry(String value) {
		country.sendKeys(value);
	}

	public void typeZipCode(String value) {
		zipcode.sendKeys(value);
	}

	public void typeCity(String value) {
		city.sendKeys(value);
	}

	public void typeOccupation(String value) {
		occupation.sendKeys(value);
	}

	public void goNormalizeSpace() {
		normalizeSpace.click();
	}

	public void typeWebSite(String value) {
		website.sendKeys(value);
	}

	public void typePicture(String value) {
		picture.sendKeys("");
	}

	public void goNextEnterProductData() {
		nextenterproductdata.click();
	}

}

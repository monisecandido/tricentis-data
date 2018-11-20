package br.com.accenture.tricentis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleDataPage {	

	@FindBy(id = "make")
	private WebElement make;

	@FindBy(id = "model")
	private WebElement model;

	@FindBy(id = "cylindercapacity")
	private WebElement cylindercapacity;

	@FindBy(id = "engineperformance")
	private WebElement engineperformance;

	@FindBy(id = "dateofmanufacture")
	private WebElement dateofmanufacture;

	@FindBy(id = "numberofseats")
	private WebElement numberofseats;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Date of Manufacture'])[1]/following::i[1]")
	private WebElement dateOfManufacture;

	@FindBy(id = "numberofseatsmotorcycle")
	private WebElement numberofseatsmotorcycle;

	@FindBy(id = "fuel")
	private WebElement fuel;

	@FindBy(id = "payload")
	private WebElement payload;

	@FindBy(id = "totalweight")
	private WebElement totalweight;

	@FindBy(id = "listprice")
	private WebElement listprice;

	@FindBy(id = "licenseplatenumber")
	private WebElement licenseplatenumber;

	@FindBy(id = "annualmileage")
	private WebElement annualmileage;

	@FindBy(id = "nextenterinsurantdata")
	private WebElement nextenterinsurantdata;
	

	public VehicleDataPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void TestaVehilcleData(String make, String model, String cylindercapacity, String typeEngineperformance,
			String typeOfManuFecture, String typeNumberOfSeats, String typeDateOfManufacture,
			String typeNumberOfSeatsMotorcycle, String typeFuel, String typePayload, String typeTotalWeight,
			String typeListPrice, String typeLicensePlateNumber, String typeAnnualMileage) {

	}
	

	public void typeMake(String value) {
		make.sendKeys(value);
	}

	public void typeModel(String value) {
		model.sendKeys(value);
	}

	public void typeCylindercapacity(String value) {
		cylindercapacity.sendKeys(value);
	}

	public void typeEngineperformance(String value) {
		engineperformance.sendKeys(value);
	}

	public void typeOfManuFecture(String value) {
		dateofmanufacture.sendKeys(value);
	}

	public void typeNumberOfSeats(String value) {
		numberofseats.sendKeys(value);
	}

	public void goDateOfManufacture() {
		dateOfManufacture.click();

	}

	public void typeNumberOfSeatsMotorcycle(String value) {
		numberofseatsmotorcycle.sendKeys(value);

	}

	public void typeFuel(String value) {
		fuel.sendKeys(value);

	}

	public void typePayload(String value) {
		payload.sendKeys(value);

	}

	public void typeTotalWeight(String value) {
		totalweight.sendKeys(value);

	}

	public void typeListPrice(String value) {
		listprice.sendKeys(value);

	}

	public void typeLicensePlateNumber(String value) {
		licenseplatenumber.sendKeys(value);
	}

	public void typeAnnualMileage(String value) {
		annualmileage.sendKeys(value);

	}

	public void goNextEnterInsurantData() {
		nextenterinsurantdata.click();

	}

}

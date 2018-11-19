package br.com.accenture.tricentis.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.accenture.tricentis.pages.InsurantDataPage;
import br.com.accenture.tricentis.pages.PriceOptionPage;
import br.com.accenture.tricentis.pages.ProductDataPage;
import br.com.accenture.tricentis.pages.SendQuotePage;
import br.com.accenture.tricentis.pages.VehicleDataPage;

public class InitialTest {

	private WebDriver driver;
	private String uri;

	@Before
	public void setUp() throws Exception {
		this.driver = new ChromeDriver();
		this.uri = "http://sampleapp.tricentis.com/101/app.php";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void startFormsTest() {
		this.driver.get(uri);
		testaVehicleData();
		testaInsurantData();
		testaProductData();
		priceOption();	
		sendQuot();
		
	}
	
	 

	public void testaVehicleData() {
		VehicleDataPage vehicleDataPage = new VehicleDataPage(driver);
		
		vehicleDataPage.typeMake("Volvo");
		vehicleDataPage.typeModel("Moped");
		vehicleDataPage.typeCylindercapacity("234");
		vehicleDataPage.typeEngineperformance("100");
		vehicleDataPage.typeOfManuFecture("11/15/2018");
		vehicleDataPage.typeNumberOfSeats("1");
		vehicleDataPage.typeDateOfManufacture();
		vehicleDataPage.typeNumberOfSeatsMotorcycle("1");
		vehicleDataPage.typeFuel("Gas");
		vehicleDataPage.typePayload("500");
		vehicleDataPage.typeTotalWeight("120");
		vehicleDataPage.typeListPrice("10000");
		vehicleDataPage.typeLicensePlateNumber("1212");
		vehicleDataPage.typeAnnualMileage("112");
    	vehicleDataPage.typeNextEnterInsurantData();		
		
		
	}
	
	

	public void testaInsurantData() {
		InsurantDataPage insurantDataPage = new InsurantDataPage(driver);
			
		insurantDataPage.typeFirstName("Monise");
		insurantDataPage.typeLastName("Candido");
		insurantDataPage.typeBirthDate("10/20/1998");
		insurantDataPage.typeGender();
		insurantDataPage.typeStreetAddress("123456");
		insurantDataPage.typeCountry("Brazil");
		insurantDataPage.typeZipCode("123456");
		insurantDataPage.typeCity("Recife");
		insurantDataPage.typeOccupation("Employee");
		insurantDataPage.typeNormalizeSpace();
		insurantDataPage.typeWebSite("www.nise.com.br");
		insurantDataPage.typePicture("");
		insurantDataPage.typeNextEnterProductData();

	}
	
	
	
	public void testaProductData() {
		ProductDataPage productDataPage = new ProductDataPage(driver);
		
		productDataPage.typeStartDate("01/01/2019");
		productDataPage.typeInsuranceSum("3.000.000,00");
		productDataPage.typetypeMeritRating("Bonus 1");
		productDataPage.typeDamageInsurance("No Coverage");
		productDataPage.typeOptionalProducts();
		productDataPage.typeCourtesyCar("No");
		productDataPage.typeNextSelectPriceOption();
		
		
		
	}

	public void priceOption() {
		PriceOptionPage priceOptionPage = new PriceOptionPage(driver);
		
		priceOptionPage.typeSelectOption();
		priceOptionPage.typeNextSendQuote();
		
	}
	
	

	public void sendQuot() {
		SendQuotePage sendQuotePage = new SendQuotePage(driver);
		
		sendQuotePage.typeEmail("monnysecandido@gmail.com");
		sendQuotePage.typePhone("995364806");
		sendQuotePage.typeUsername("nise");
		sendQuotePage.typePassword("Bla123");
		sendQuotePage.typeConfirmPassword("Bla123");
		sendQuotePage.typeComents("selenium selenium selenium");
		sendQuotePage.typeSendEmail();
		

		WebElement resultMessage = driver.findElement(By.tagName("h2"));
		
		String message = resultMessage.getText();
		assertEquals("Sending e-mail success!", message);

	}

}

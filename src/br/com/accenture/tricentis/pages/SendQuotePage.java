package br.com.accenture.tricentis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage {

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "confirmpassword")
	private WebElement confirmpassword;

	@FindBy(id = "Comments")
	private WebElement Comments;

	@FindBy(id = "sendemail")
	private WebElement sendemail;
	

	public SendQuotePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void testaSendQuote(String email, String phone, String username, String password, String comfirmpassword,
			String comments) {

	}

	public void typeEmail(String value) {
		email.sendKeys(value);
	}

	public void typePhone(String value) {
		phone.sendKeys(value);
	}

	public void typeUsername(String value) {
		username.sendKeys(value);
	}

	public void typePassword(String value) {
		password.sendKeys(value);
	}

	public void typeConfirmPassword(String value) {
		confirmpassword.sendKeys(value);
	}

	public void typeComents(String value) {
		Comments.sendKeys(value);
	}

	public void typeSendEmail() {
		sendemail.click();
	}

}

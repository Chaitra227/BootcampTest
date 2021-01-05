package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.TestBase;

public class HotelBookingPage extends TestBase{
	
	
	@FindBy(name="userName") WebElement username;
	@FindBy(name="userPwd") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement loginBtn;
	@FindBy(id="txtFirstName") WebElement FirstName;
	@FindBy(id="txtLastName") WebElement LastName;
	@FindBy(id="txtEmail") WebElement Email;
	@FindBy(id="txtPhone") WebElement PhoneNo;
	@FindBy(xpath="//td/textarea") WebElement address;
	@FindBy(name="city") WebElement City;
	@FindBy(name="state") WebElement State;
	@FindBy(id="txtCardholderName") WebElement CardHolderName;
	@FindBy(id="txtDebit") WebElement CardNumber;
	@FindBy(id="txtCvv") WebElement CVV;
	@FindBy(id="txtMonth") WebElement ExpMonth;
	@FindBy(id="txtYear") WebElement ExpYear;
	@FindBy(id="btnPayment") WebElement ConfirmBookingBtn;
	
	
	public HotelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginBtn() {
		loginBtn.click();		
	}
	
	public void EnterUsername() {
		username.sendKeys(prop.getProperty("username"));		
	}
	
	public void EnterPassword() {
		password.sendKeys(prop.getProperty("password"));
	}
	
	public String validateTitle() {
		return driver.getTitle();
	}

	public void ConfirmBookingButton() {
		ConfirmBookingBtn.click();		
	}
	
	public void EnterFName() {
		FirstName.sendKeys(prop.getProperty("fname"));		
	}
		
	public void EnterLName() {
		LastName.sendKeys(prop.getProperty("lname"));		
	}
	
	public void EnterAdress(){
		address.sendKeys(prop.getProperty("address"));
	}
	
	public void SelectCity(){
		Select x =new Select(City);
		x.selectByValue("Bangalore");		
	}
		
	public void SelectState() {
		Select y =new Select(State);
		y.selectByIndex(2);
	}
	public void EnterCardHolderName() {
		CardHolderName.sendKeys(prop.getProperty("cardName"));	
	}
	public void EnterCardNumber() {
		CardNumber.sendKeys(prop.getProperty("cardNumber"));	
	}
	public void EnterCVV() {
		CVV.sendKeys(prop.getProperty("cvv"));	
	}
	public void EnterExpMonth() {
		ExpMonth.sendKeys(prop.getProperty("expirationMonth"));	
	}
	public void EnterExpYear() {
		ExpYear.sendKeys(prop.getProperty("expirationYear"));	
	}
	
}

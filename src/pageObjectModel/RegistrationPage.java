package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	
	WebDriver ldriver;
	RegistrationPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement code;
	
	@FindBy(name="country")
	WebElement country;
	
	public void Registrationclick()
	{
		Register.click();
	}
	public void setfirstname(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void setphone(String ph)
	{
		phone.sendKeys(ph);
	}
	
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setAddress(String adds)
	{
		address.sendKeys(adds);
	}
	
	public void setCity(String cty)
	{
		city.sendKeys(cty);
	}
	
	public void setStat(String stat)
	{
		state.sendKeys(stat);
	}
	
	public void setPostalCode(String pcode)
	{
		code.sendKeys(pcode);
	}
	
	public void setCountry(String cntry)
	{
		Select drop=new Select(country);
		drop.selectByVisibleText(cntry);
				
	}
	
	
}

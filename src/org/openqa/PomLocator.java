package org.openqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//create constructor

public class PomLocator extends Baseclass {
	public PomLocator() {
		PageFactory.initElements(driver, this);
	}
	//maintain all the locator
	@FindBy(id ="username")
	private WebElement txtUsername;
	@FindBy(id ="password")
	private WebElement txtPassword;
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement btnLogin;
	@FindBy(xpath ="//select[@id='location']")
	private WebElement Location;
	@FindBy(xpath ="//select[@id='hotels']")
	private WebElement Hotels;
	@FindBy(xpath ="//select[@id='room_type']")
	private WebElement RoomType;
	@FindBy(xpath ="//select[@id='room_nos']")
	private WebElement RoomNos;
	@FindBy(xpath ="//select[@id='adult_room']")
	private WebElement Adultroom;
	@FindBy(xpath ="//select[@id='child_room']")
	private WebElement ChildRoom ;
	@FindBy(xpath ="//input[@value='Search']")
	private WebElement btnSearch;
	@FindBy(xpath ="//input[@id='radiobutton_0']")
	private WebElement RadioButton1;
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement Continue;
	@FindBy(xpath ="//input[@id='first_name']")
	private WebElement FirstName;
	@FindBy(xpath ="//input[@id='last_name']")
	private WebElement LastName;
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement Address;
	@FindBy(xpath ="//input[@id='cc_num']")
	private WebElement CCNum;
	@FindBy(xpath ="//select[@id='cc_type']")
	private WebElement CCType;
	@FindBy(xpath ="//select[@id='cc_exp_month']")
	private WebElement ExpMonth;
	@FindBy(xpath ="//select[@id='cc_exp_year']")
	private WebElement ExpYear;
	@FindBy(xpath ="//input[@id='cc_cvv']")
	private WebElement CCCVv;
	@FindBy(xpath ="//input[@id='book_now']")
	private WebElement BookNow;
	@FindBy(xpath ="//input[@id='logout']")
	private WebElement Logout;
	
	//create getters
	
	public WebElement getLogout() {
		return Logout;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCCNum() {
		return CCNum;
	}

	public WebElement getCCType() {
		return CCType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCCCVv() {
		return CCCVv;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	
	
	public WebElement getRadioButton1() {
		return RadioButton1;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNos() {
		return RoomNos;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	public WebElement getLocation() {
		return Location;
	}
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}

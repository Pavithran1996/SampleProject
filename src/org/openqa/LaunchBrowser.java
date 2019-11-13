package org.openqa;

import java.io.IOException;

public class LaunchBrowser extends Baseclass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser("https://adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		PomLocator p = new PomLocator();
		type(p.getTxtUsername(),"pavithran1996");
		type(p.getTxtPassword(),"pranav@85");
		click(p.getBtnLogin());
		selectByText(p.getLocation(), "Sydney");
		selectByText(p.getHotels(), "Hotel Sunshine");
		selectByText(p.getRoomType(), "Deluxe");
		selectByText(p.getRoomNos(), "3 - Three");
		selectByText(p.getAdultroom(), "2 - Two");
		selectByText(p.getChildRoom(), "1 - One");
		click(p.getBtnSearch());
		click(p.getRadioButton1());
		click(p.getContinue());
		type(p.getFirstName(),"pavithran");
		type(p.getLastName(),"p");
		type(p.getAddress(),"chennai");
		type(p.getCCNum(),"1234567847849307");
		selectByText(p.getCCType(),"VISA");
		selectByText(p.getExpMonth(),"July");
		selectByText(p.getExpYear(),"2022");
		type(p.getCCCVv(),"345");
		click(p.getBookNow());
		Thread.sleep(10000);
		ScreenShot("C:\\Image\\Screenshot.png");
		click(p.getLogout());
		Thread.sleep(5000);
		closeBrowser();
		
		
	}

}

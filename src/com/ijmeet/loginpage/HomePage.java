package com.ijmeet.loginpage;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	private void verifyIfUserCanStartQuickMeetingWithUnverifiedAccount() {
		System.setProperty("webdriver.chrome.driver", "D:\\Programming Softwares\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ijmeet.com/");
		

	}

	public static void main(String[] args) {
		
		new LandingPage().verifyIfUserCanSignInWithValidCredentials();
		new HomePage().verifyIfUserCanStartQuickMeetingWithUnverifiedAccount();

	}

}

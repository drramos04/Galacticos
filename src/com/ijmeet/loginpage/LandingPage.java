package com.ijmeet.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPage {
	
	
	public  void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Programming Softwares\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ijmeet.com/");
	}

	public void verifyIfNewUserCanSignUpWithAllValidCredentials() throws InterruptedException {
		
		driver.findElement(By.linkText("Sign Up")).click();
		driver.findElement(By.cssSelector("input[id=name]")).sendKeys("Vinit Rane");
		driver.findElement(By.id("company_name")).sendKeys("Amazon");
		driver.findElement(By.id("email")).sendKeys("desai214@gmail.com");
		driver.findElement(By.xpath("//input[@ placeholder=' Enter mobile number ']")).sendKeys("9850236964");
		driver.findElement(By.id("password")).sendKeys("Vinit214@Ram");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

	}
	
	public void verifyIfUserCanSignInWithValidCredentials() {
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Programming Softwares\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ijmeet.com/");
		*/
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("desai214@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Vinit214@Ram");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	public void verifyIfUserCanStartQuickMeetingWithUnverifiedAccount() {
		/*System.setProperty("webdriver.chrome.driver", "D:\\Programming Softwares\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://ijmeet.com/");
		*/
		driver.findElement(By.xpath("//div[@id='quick_meeting_tab']")).click();
		driver.findElement(By.xpath("//div[@class='swal2-actions']")).click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		//new LandingPage().verifyIfNewUserCanSignUpWithAllValidCredentials();
		//new LandingPage().verifyIfUserCanSignInWithValidCredentials();
	}

}

package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.Loginpage;
public class TestScripts {

	WebDriver driver;
	
	
	@BeforeMethod

	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url="https://tutorialsninja.com/demo/";
		driver.get(url);
		
	}
	
	@Test
	
	public void login() throws InterruptedException {
		
		Loginpage obj = new Loginpage(driver);
		
		obj.clickAccount();
		obj.clickLogin();
	    obj.enterEmail("anu122@gmail.com");
	    obj.enterPassword("anu123");
        obj.clickLogin1();
		Thread.sleep(3000);

		System.out.println("The page heading is --- " +obj.getHeading());

        obj.clickLogout();
	}
	
		

}

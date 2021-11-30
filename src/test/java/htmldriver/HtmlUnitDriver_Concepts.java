package htmldriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver_Concepts {

	public static void main(String[] args) {
		//without launching the browser we can test 
		
		WebDriver driver= new HtmlUnitDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("charanraj");
		driver.findElement(By.id("passContainer")).sendKeys("raj123@");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		
		
	}

}



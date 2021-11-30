package sikuli1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headlessbrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("websmaste");
		driver.findElement(By.name("q")).click();
		System.out.println(driver.getTitle());
		
	}

}

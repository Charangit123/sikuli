package sikuli1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("charanraj");
		driver.findElement(By.id("pass")).sendKeys("charanraj");
		WebElement elemnt = driver.findElement(By.xpath("//button[@name='login']"));
		//highlight(elemnt, driver);
		drawborder(elemnt, driver);
		
		// takes ss
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\user1\\eclipse-workspace\\myProject\\Screenshots\\2.png"));
		
		//generates alert
		generateAlert(driver, "This is alert box in facebook");

		// clickon webelement
		//clickElemnt(driver, elemnt);
		Thread.sleep(3000);
		//driver.navigate().refresh();// selenium refresh
		
		//refresh in JS
		//refreshButtonJS(driver);

		//getTitle in JS
		System.out.println(getTileJS(driver));
		
		//Innertextpf page
		System.out.println(Innertext(driver));
		
		WebElement elemnet1= driver.findElement(By.xpath("//a[contains(text(),'Terms']"));
		//Scroll down
		ScrollpageDown(driver);
		
		//scrolls till the elemnet is found
		ScrollIntoView(driver,elemnet1);
		
		
	}

	public static void highlight(WebElement element, WebDriver driver) throws IOException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String backcolor = element.getCssValue("background-color");
		for (int i = 0; i < 100; i++) {
			changColor("rgb(0,200,0)", element, driver);
			changColor(backcolor, element, driver);
		}
	}

	public static void changColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.background-color='" + color + "'", element);
	}

	public static void generateAlert(WebDriver driver, String msg) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + msg + "')");
	}

	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void clickElemnt(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argumnets[0].click();", element);
	}

	public static void refreshButtonJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTileJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String Innertext(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		return js.executeScript("return document.documentElement.innerText;").toString();		
	}
	public static void ScrollpageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("windows.scrollTo(0,document.body.scrollHeight)");
	}
	public static void ScrollIntoView(WebDriver driver, WebElement element1) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element1);
	}


	}


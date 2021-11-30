package sikuli1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ima {

	public static void main(String[] args) throws FindFailed {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.get("https://www.youtube.com/watch?v=wpZ0FjJQ8qs&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=23");
	
		driver.get("https://www.google.com/");

		Screen sc= new Screen();
		
		
		Pattern FullScreen = new Pattern("feel.png");
		sc.wait(FullScreen,2000);
		sc.click();
		sc.click();
		
//		Pattern Pause= new Pattern("YT_Pause.png");
//		s.wait(Pause,2000);
//		s.click();
////		s.click();
//		
//		
//		Pattern Resume = new Pattern("YT_Resume.png");
//		s.wait(Resume,2000);
//		s.click();
////		s.click();
//		
//		
//		Pattern Settings = new Pattern("YT_Settings.png");
//		s.wait(Settings,2000);
//		s.click();
//		s.click();


	}

}

package sikuli;

import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=wpZ0FjJQ8qs&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=23");
	

		Screen s= new Screen();
		
//		Pattern Pause = new Pattern("YT_Pause.png");
//		Pattern Pause= new Pattern("YT_Pause.png");
//		s.wait(pause,2000);
//		s.click();
//		
//		
//		Pattern Resume = new Pattern("YT_Resume.png");
//		s.wait(pause,2000);
//		s.click();
//		
//		Pattern FullScreen = new Pattern("YT_FullScreen.png");
//		s.wait(pause,2000);
//		s.click();
//		
//		Pattern Settings = new Pattern("YT_Settings.png");
//		s.wait(pause,2000);
//		s.click();


	}

}

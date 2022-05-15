package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", ".\\executabels\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}

package SeleniumAssignment;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBasicOperation {

	

	public static void main(String[] args) {
		String driverpath1=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverpath1);
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension (500, 700));
		
		System.out.println("current page title is"+driver.getTitle());
		
		System.out.println("current url is"+driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		WebElement bestsellers= driver.findElement(By.cssSelector("div#nav-xshop-container>div>*:nth-child(2)"));
		
		 bestsellers.click();
		 
		 driver.navigate().back();
		 
		 driver.close();
		
		
		
		
		
		
		
	}

}

package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAssignment {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		String actualTitle=driver.getTitle();
	    String expectedTitle="Execute Automation";
		System.out.println("Title Length: "+actualTitle.length());
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully..");
			
		}
		else {
			System.out.println("Either login page not opened or page title got changed");
		}
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://demosite.executeautomation.com/Login.html";
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Current Url Validation is Passed");
			
		}
		else {
			System.out.println("Current Url Validation is failed");
		}
		WebElement usernameInputField=driver.findElement(By.name("UserName"));
		
		 usernameInputField.sendKeys("execution");
		 
		 usernameInputField.clear();
		 
		 usernameInputField.sendKeys("execution");
		 WebElement passwardInputField=driver.findElement(By.name("Password"));
		 passwardInputField.sendKeys("admin");
		 WebElement loginButton=driver.findElement(By.name("Login"));
		 loginButton.click();
		 
		 
		 
		 
		 
		 
		

	}

}

package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicoperationOnBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executabels\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		String appCurrentUrl=cdriver.getCurrentUrl();
		String expectedUrl="https://www.google.com";
		System.out.println("Actual Url" +appCurrentUrl);
		System.out.println("Expected Url" +expectedUrl);
		if(appCurrentUrl.contains(expectedUrl)) {
			System.out.println("Current Url Validation is Passed");
			
		}else {
			System.out.println("Current Url Validation is failed");
			
		}
		String actualTitle=cdriver.getTitle();
		String expectedTitle="Google";
		System.out.println("Actual Title:"+actualTitle);
		System.out.println("Expected Title:"+expectedTitle);
		System.out.println("Title Length: "+actualTitle.length());
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title validation is Passed");
		}else {
			System.out.println("Title validation is failed");
		}
		String sourceContent=cdriver.getPageSource();
		System.out.println("Source Content Length:" +sourceContent.length());
		
		cdriver.close();
		

	}
}

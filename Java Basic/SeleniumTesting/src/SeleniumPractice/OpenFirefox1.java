package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox1 {
	public static void main(String[] args) {
		//Absolute path
		String driverPath1="G:\\accelration\\workspace\\Java Basic\\SeleniumTesting\\src\\SeleniumPractice\\OpenFirefox1.java";
		//or Relative path --> '.' indicate current working dir
		String driverPath2=".\\executabels\\geckodriver.exe";
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executabels\\geckodriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath2);
		//create an instance of required browser class
		WebDriver fdriver=new FirefoxDriver();
		//System.out.println("path1"+driverPath1);
		//System.out.println("path2"+driverPath2);
		//System.out.println("path3"+driverPath3);
	}

}

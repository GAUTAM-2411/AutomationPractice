package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		
			                                 //absolute path
			String driverpath1="G:\\accelration\\workspace\\Java Basic\\SeleniumTesting\\executabels\\geckodriver.exe";
		                              //	or relative path -->' . '
			String driverpath2=".\\executabels\\chromedriver.exe";
			                          //     or using system class
			String driverpath3=System.getProperty("user.dir")+"executabels\\geckodriver.exe";

					//set the driver executable path using system.set property(string key, string value)
			System.setProperty("webdriver.gecko.driver",  driverpath1);
		             //create an instance of required browser class
		          FirefoxDriver fdriver=new  FirefoxDriver ();
		}
	}
	
		




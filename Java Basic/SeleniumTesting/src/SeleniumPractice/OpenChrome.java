package SeleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                                 //absolute path
		String driverpath1="G:\\accelration\\workspace\\Java Basic\\SeleniumTesting\\executabels\\chromedriver.exe";
	                              //	or relative path -->' . '
		String driverpath2=".\\executabels\\chromedriver.exe";
		                          //     or using system class
		String driverpath3=System.getProperty("user.dir")+"executabels\\chromedriver.exe";

				//set the driver executable path using system.set property(string key, string value)
		System.setProperty("webdriver.chrome.driver",  driverpath2);
	             //create an instance of required browser class
	           ChromeDriver cdriver=new ChromeDriver ();
	           cdriver.get("https://www.google.com");
	}
}





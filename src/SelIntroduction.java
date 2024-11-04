import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SelIntroduction  {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Invoking the browser 
		// Chrome - ChromeDriver (Class) --> Methods close get
		// Firefox - FirefoxDriver ( Class ) ---> Methods close get
		// WebDriver close get
		//System.setProperty(null, null)
		// chromedriver.exe ---> chrome browser help to invoke the browser
		//System.setProperty("webdriver.chrome.driver", "C:\Users\rahib\Downloads\chromedriver.exe");
	    // Microsoft Edge
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\rahib\\OneDrive\\Documents\\Selenium learning\\chromedriver-win64\\chromedriver-win64");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
		

	}

}

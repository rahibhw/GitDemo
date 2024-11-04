import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		//opt.setExperimentalOption("excludeSwitches",
			     //Arrays.asList("disable-popup-blocking"));
		Proxy proxy = new Proxy();//when a site need Proxy to access
		proxy.setHttpProxy("ipaddress:4444");
		opt.setCapability("proxy", proxy);
		//EdgeOptions opt1= new EdgeOptions();
		//opt1.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());
		
	}

}

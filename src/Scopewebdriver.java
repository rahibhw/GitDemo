import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopewebdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://qaclickacademy.com/practice.php/");
		//how to find total numbers of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//now we need to know total no of links count in footer area
		WebElement footerDriver=driver.findElement(By.id("gf-BIG")); // this is limiting WebDriver Scope to footer only
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//now we need to know total links in first column of header , then declare one more sub driver
		WebElement columndriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//click on each link on the column and check if these are working?
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++)
		{
		String clickonlinktab =	Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
		}
		Set <String> windows = driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		while (it.hasNext())
				{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
				}
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Actions a = new Actions(driver);
		//move to specific element 
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Login']"))).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.cssSelector(".Pke_EE"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}

}

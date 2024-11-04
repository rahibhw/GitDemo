import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-group']/div/label[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticdropdown = driver.findElement(By.cssSelector("[class='form-group'] select"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("consult");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(3000);
		
		//.col-lg-9 app-card-list
		String []itemsRequired = {"iphone X","Samsung Note 8","Nokia Edge"};
		List<WebElement> items=driver.findElements(By.xpath("//app-card-list[@class='row']/app-card/div"));
		for (int i=0;i<items.size();i++)
		{
			String name =items.get(i).getText().split("\n")[0];
			List a = Arrays.asList(itemsRequired);
			if (a.contains(name)) {
				driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
			}
		}
		driver.findElement(By.cssSelector("a.nav-link.btn")).click();
			
		
	}

}

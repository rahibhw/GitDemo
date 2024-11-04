import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommercePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Carrot", "Brinjal" };
		Thread.sleep(3000);
		//// div[@class='product-action']/button
		addItem(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		// driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO
		// CHECKOUT')]"));
		driver.findElement(By.xpath("//div[@class='cart-preview active']//div[@class='action-block']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItem(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < items.size(); i++) {
			String[] name = items.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List al = Arrays.asList(itemsNeeded);
			if (al.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}

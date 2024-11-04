import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.cssSelector("a[href*='offers']")).click();
		// WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(3));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr/th[1]")));
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veg=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> vegfinal=veg.stream().filter(s->s.getText().contains("Rice"))
				.collect(Collectors.toList());
		Assert.assertEquals(veg.size(), vegfinal.size());
		

	}

}

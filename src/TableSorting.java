import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TableSorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.cssSelector("a[href*='offers']")).click();
		// WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(3));
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr/th[1]")));
		Set<String> abc = driver.getWindowHandles();
		Iterator it = abc.iterator();
		Object parentId = it.next();
		Object childId = it.next();
		driver.switchTo().window((String) childId);
		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> elementslist = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> originallist = elementslist.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originallist.equals(sortedlist));

		// print the price of a veg "Beans" from the table
		//List<String> price = elementslist.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPrice(s))
				//.collect(Collectors.toList());
		//price.forEach(a -> System.out.println(a));
		//Pagination concept below when we print the price of Rice in 4th page
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
					
					price =rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
					.collect(Collectors.toList());
					price.forEach(a->System.out.println(a));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while(price.size()<1);

	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}

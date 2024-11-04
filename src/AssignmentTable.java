import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
        //driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(2000);
        //driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
        //driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		
		//System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		WebElement table =driver.findElement(By.cssSelector(".table-display"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement>secondRow =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

	}

}

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cartitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot","Tomato" };
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			// Brocolli - 1 Kg
			String formatedName = name[0].trim();
			// format/trip the veg name as to remove -1 Kg word and then pass it in the loop
			// convert itmesNeeded array into arrayList for a easy search
			// check the name from above method returned is present in the arrayList or not
			List a = Arrays.asList(itemsNeeded);

			if (a.contains(formatedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}

	}

}

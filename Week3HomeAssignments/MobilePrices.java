package Week3HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
driver.findElement(By.id("nav-search-submit-button")).click();
List<WebElement>phones = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
int total = phones.size();
System.out.println("Total number of phones:"+total);
List<Integer>allphones =new ArrayList<Integer>();
for(WebElement mobileprice : phones) {
	String text = mobileprice.getText();
	String priceText = text.replaceAll("[^0-9]", "");
	int price  = Integer.parseInt(priceText);
	allphones.add(price);
}
Collections.sort(allphones);
System.out.println(allphones);

	}

}

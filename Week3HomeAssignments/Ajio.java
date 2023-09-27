package Week3HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://www.ajio.com/");
driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
driver.findElement(By.xpath("//span[@class='ic-search']")).click();
driver.findElement(By.xpath("//span[text()='gender']"));
driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"));
driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
String str= driver.findElement(By.xpath("//div[@class='length']")).getText();
System.out.println(str);
List<WebElement>BrandBags=driver.findElements(By.xpath("//div[@class='brand']"));
System.out.println(BrandBags);
for(int i=0; i<BrandBags.size();i++) {
	 String str1 = BrandBags.get(i).getText();
	 System.out.println(str1);
	
	
	
}

	}

}

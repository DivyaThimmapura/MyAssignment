import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		driver.findElement(By.xpath("//div[@aria-label='Bags for boys']")).click();
		WebElement r=driver.findElement(By.xpath("//span[text()='1-48 of over 50000 results for']"));
		String result=r.getText();
		System.out.println(result);
		driver.findElement(By.linkText("American Tourister")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sky Bags")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement n=driver.findElement(By.xpath("//span[text()='Skybags']"));
		String name=n.getText();
		System.out.println("name:"+name);
		WebElement p=driver.findElement(By.xpath("//span[text()='990']"));
		String price=p.getText();
		System.out.println("Discount Price"+price);
		String title=driver.getTitle();
		System.out.println(title);








	}

}

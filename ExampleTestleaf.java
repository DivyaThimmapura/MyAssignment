import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleTestleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("firstName")).sendKeys("Divya");
		driver.findElement(By.id("lastName")).sendKeys("Thimmapuram");
		WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select option = new Select(select);
		option.selectByIndex(4);
		WebElement select1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option1 = new Select(select1);
		option1.selectByVisibleText("Automobile");
		WebElement select2 = driver.findElement(By.id("createLeadForm_ownership"));
		Select option2 = new Select(select2);
		option2.selectByValue("Corporation");
		driver.findElement(By.name("submit")).click();













	}

}

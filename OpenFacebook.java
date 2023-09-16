import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("testleaf2023@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();



		//driver.close();
	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com");
		driver.findElement(By.xpath("//span[text()='Bus']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[text()='Today']")).click();
		WebElement b = driver.findElement(By.xpath("//h5[text()='YoloBus']"));
		String Busname = b.getText();
		System.out.println("Busname:"+Busname);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement s=driver.findElement(By.xpath("//small[text()='12']"));
		String seat=s.getText();
		System.out.println("seats:"+seat);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//span[text()='Available']")).click();
		driver.findElement(By.xpath("//span[text()='Sinsuri']")).click();
		driver.findElement(By.xpath("//span[text()='Attibele Toll Gate']")).click();
		WebElement ss=driver.findElement(By.xpath("//span[text()='DU5']"));
		String selectedseats = ss.getText();
	    System.out.println("selectedseats:"+selectedseats);
		WebElement Tf = driver.findElement(By.xpath("//span[text()='Base Fare']"));
		String fare = Tf.getText();
		System.out.println("Busfare:"+fare);
		String title =driver.getTitle();
		System.out.println(title); 


















	}

}

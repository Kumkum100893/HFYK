import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HfykLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://marketadvisor.co.in/mob-app/dev/app/#/login");
		driver.findElement(By.className("btn-skip")).click();
		driver.findElement(By.className("text-input")).sendKeys("kumkum");//
		//driver.findElement(By.cssSelector("input[placeholder='Passphrase']")).sendKeys("123456789101112");
		driver.findElement(By.xpath("//input[@placeholder='Passphrase']")).sendKeys("123456789101112");
        driver.findElement(By.xpath("//span/h3")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span/h2")).click();
        driver.findElement(By.xpath("//*[text()='Warning']")).click();
        driver.findElement(By.className("ionImg__sendIcon")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("job__name--font")).click();
       // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Apply");
        //Thread.sleep(2000);
      //driver.findElement(By.xpath("//*[text()='Apply And Complete Minimum 2 Jobs A Week']")).click();
        //  System.out.println(driver.findElement(By.className("click-block")).getText());
        
	}

}

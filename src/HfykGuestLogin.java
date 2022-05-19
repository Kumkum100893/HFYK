import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HfykGuestLogin {

	public static void main(String[] args)
	
	{
		
		
		//WebDriver driver=new ChromeDriver();
        //WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://marketadvisor.co.in/mob-app/dev/app/#/login");
		
		driver.findElement(By.className("btn-skip")).click();
		driver.findElement(By.xpath("//*[text()='Continue as a Guest Parent']")).click();
		System.out.println(driver.findElement(By.xpath("//*[text()='Just Getting Started?']")).getText());
	
		

	}

}

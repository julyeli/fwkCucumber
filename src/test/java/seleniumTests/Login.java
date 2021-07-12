package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	private static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\giuliana.siles\\Documents\\Automation\\QA-Autom\\src\\drivers\\chromedriver.91.0.4472.101.exe");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://test.comercios2.firstdata.com.ar/comercios/");
		 
		 WebElement email = driver.findElement(By.cssSelector("#email"));
		 email.sendKeys("diego.quiroz@firstdata.com.ar");
		 
		 WebElement password = driver.findElement(By.cssSelector("#password"));
		 password.sendKeys("comercio009*");
		 
		 WebElement ingresar = driver.findElement(By.cssSelector("#sendLogin"));
		 ingresar.click();
		 
		 Thread.sleep(15000);
		 
		 WebElement usuario = driver.findElement(By.xpath("//div[@class='user-menu-styles']/md-menu/button"));
		 
		 if (usuario.isEnabled()) {
			 usuario.click();
			 Thread.sleep(2000);
			 WebElement cerrarSesion = driver.findElement(By.xpath("//div[@id='menu_container_1']/md-menu-content/md-menu-item[4]/a/img"));
			 if (cerrarSesion.isEnabled()) {
				 cerrarSesion.click();
			 }
		 }
		 
		 Thread.sleep(9000);
		 
		 driver.quit();
		 
	}

}

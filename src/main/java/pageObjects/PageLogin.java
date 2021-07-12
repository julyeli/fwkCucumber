package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class PageLogin {

	WebDriver driver;
	public PageLogin (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Localizadores
	@FindBy(how = How.CSS, using = "#email")
	private WebElement tbxEmail;
	
	@FindBy(how = How.CSS, using = "#password")
	private WebElement tbxPassword;
	
	@FindBy(how = How.CSS, using = "#sendLogin")
	private WebElement btnIngresar;
	
	// Acciones
	public void navegarA_Login() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getUrl_UAT());
	}
	public void ingresar_Email (String mail) {
		tbxEmail.sendKeys(mail);
	}
	
	public void ingresar_Contrasenia (String clave) {
		tbxPassword.sendKeys(clave);
	}
	
	public void clic_Ingresar () {
		btnIngresar.click();
	}
	
}

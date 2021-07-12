package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageUsuario {
	
	public PageUsuario(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Localizadores
	@FindBy(how = How.XPATH, using = "//div[@class='user-menu-styles']/md-menu/button")
	private WebElement btnUsuario;
	
	@FindBy(how = How.XPATH, using = "//div[@id='menu_container_1']/md-menu-content/md-menu-item[4]/a/img")
	private WebElement btnCerrarSesion;
	
	// Acciones
	public void clic_botonUsuario () {
		btnUsuario.click();
	}
	
	public void clic_CerrarSesion () {
		btnCerrarSesion.click();
	}
	
}

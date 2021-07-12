package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.PageLogin;
import pageObjects.PageUsuario;

public class PageObjectManager {

	WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	PageLogin login;
	public PageLogin getPageLogin () {
		return (login == null) ? login = new PageLogin(driver) : login;		
	}
	
	PageUsuario user;
	public PageUsuario getPageUsuario () {
		return (user == null) ? user = new PageUsuario(driver) : user;
	}
	
}

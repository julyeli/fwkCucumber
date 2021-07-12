package stepDefinition;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.FileReaderManager;
import pageObjects.PageLogin;

public class StepsLogin {

	//WebDriver driver;
	//PageObjectManager mngPO;
	//WebDriverManager mngWD;
	//PageLogin login;
	//PageUsuario user;
	
	TestContext testContext;
	PageLogin login;
	
	public StepsLogin (TestContext context) {
		testContext = context;
		login = testContext.getPageObjectManager().getPageLogin();
	}
	
	@Given("^me logeo al Merchant Portal$")
	public void me_logeo_al_Merchant_Portal() throws Throwable {
		testContext.getWebDriverManager().getDriver();
		//mngWD = new WebDriverManager();
		//driver = mngWD.getDriver();
		//mngPO = new PageObjectManager(driver);
		//login = mngPO.getPageLogin();
		login.navegarA_Login();
	}

	@When("^ingreso mi E-mail \"([^\"]*)\" en Mi Cuenta$")
	public void ingreso_mi_E_mail_en_Mi_Cuenta(String mail) throws Throwable {
		//login = mngPO.getPageLogin();
		login.ingresar_Email(mail);
	}

	@When("^ingreso mi Contaseña \"([^\"]*)\" en Mi Cuenta$")
	public void ingreso_mi_Contaseña_en_Mi_Cuenta(String pass) throws Throwable {
		//login = mngPO.getPageLogin();
		login.ingresar_Contrasenia(pass); 
		//login = mngPO.getPageLogin();
		login.clic_Ingresar();
		Thread.sleep(FileReaderManager.getInstance().getConfigReader().getWait());
	}
	
}

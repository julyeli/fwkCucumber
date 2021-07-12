package stepDefinition;

import org.junit.Assert;
import io.cucumber.java.en.Then;

import cucumber.TestContext;
import pageObjects.PageUsuario;

public class StepsUsuario {
	
	TestContext testContext;
	PageUsuario usuario;
	
	public StepsUsuario (TestContext context) {
		testContext = context;
		usuario = testContext.getPageObjectManager().getPageUsuario();
	}

	@Then("^accedo a la pagina Resumen del Merchant Portal$")
	public void accedo_a_la_pagina_Resumen_del_Merchant_Portal() throws Throwable {
	    //System.out.println("Titulo: "+driver.getTitle()+" - Url: "+driver.getCurrentUrl());
	    //Assert.assertEquals(" Error en la URL ", "https://test.comercios2.firstdata.com.ar/comercios/dashboard", driver.getCurrentUrl());
	}

	@Then("^cierro sesion de mi cuenta$")
	public void cierro_sesion_de_mi_cuenta() throws Throwable {
		usuario.clic_botonUsuario();
		Thread.sleep(3000);
		usuario.clic_CerrarSesion();
		Thread.sleep(9000);
	}
	
}

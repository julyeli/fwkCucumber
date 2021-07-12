Feature: Prueba de acceso del Merchant Portal

	Scenario: Logearse al portal y cerrar sesion
		Given me logeo al Merchant Portal
		When ingreso mi E-mail "diego.quiroz@firstdata.com.ar" en Mi Cuenta
		And ingreso mi Contaseña "comercio009*" en Mi Cuenta
		And hago click en Ingresar de Mi Cuenta
		Then accedo a la pagina Resumen del Merchant Portal
		And cierro sesion de mi cuenta

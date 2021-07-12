package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "src//configs//Configs.properties";
	 
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Archivo de propiedades no funciona " + propertyFilePath);
		} 
	}
	 
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
			else throw new RuntimeException("Driver no especificado en el archivo de configuración "); 
	}
	
	public String getDriverBrowser(){
		String driverBrowser = properties.getProperty("driverBrowser");
		if(driverBrowser!= null) return driverBrowser;
			else throw new RuntimeException("Driver Browser no especificado en el archivo de configuración "); 
	}
	
	public long getWait() { 
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
			else throw new RuntimeException("Tiempo de espera no especificado "); 
	}
	 
	public String getUrl_UAT() {
		String url = properties.getProperty("URL_UAT");
		if(url != null) return url;
			else throw new RuntimeException("La URL no fue especificada en el archivo de configuracion ");
	}
	
	public DriverType getBrowser() {
		String browserName = properties.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
			else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
			else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
			else throw new RuntimeException("El valor para browser no a sido establecido : " + browserName);
	}
		 
	public EnvironmentType getEnvironment() {
		String environmentName = properties.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
			else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
			else throw new RuntimeException("EL valor para el ambiente no a sido establecido : " + environmentName);
	}
		 
	public Boolean getBrowserSize() {
		String windowSize = properties.getProperty("windowMaximize");
			if(windowSize != null) return Boolean.valueOf(windowSize);
			return true;
	}


}

package com.crm.ReadDataFromExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataUtility {

	public static String ReadPropertyData(String key) throws IOException {
		Properties prop = new Properties();
		File file = new File("E:\\Q-Spiders\\Selenium\\com.crm.advanceselenium\\src\\test\\resources\\ConfigFile\\Dws.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		String urlMethod = prop.getProperty(key);
		return urlMethod;
	}
}

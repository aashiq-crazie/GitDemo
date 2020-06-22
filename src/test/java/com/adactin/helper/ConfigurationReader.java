package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws IOException {
		File file = new File(".//src//test//java//com//adactin//properties//adactin.properties");
		FileInputStream fis = new FileInputStream(file);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowserName() {
		String bName = p.getProperty("Browsername");
		return bName;

	}

	public String getUrl() {
		String urlName = p.getProperty("Url");
		return urlName;
	}

}

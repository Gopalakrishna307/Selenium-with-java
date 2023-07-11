package com.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config_Reader {
	
	public static Properties property;
	private static String config_Path ="src\\test\\java\\com\\configuration_files\\confg.properties";
	private static String fromDetails_Path ="src\\test\\java\\com\\configuration_files\\fromDetails.properties";

	public static void read_config_Data() {
		property = new Properties();
		
		try {
			InputStream instm= new FileInputStream(config_Path);
			property.load(instm);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public static void read_fromDetails_Data() {
			property = new Properties();
			
			try {
				InputStream instm= new FileInputStream(fromDetails_Path);
				property.load(instm);
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

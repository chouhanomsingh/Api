package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains reusable method to read data from properties file
 */
public class PropertiesUtility {
	private Properties property;
	/**
	 * this method initializers properties file
	 * @param filePath
	 */
	public void propertiesInit(String filePath) {
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}	
		/**
		 * This method fetches the value of the key specified from properties file
		 * @paraam key
		 * @return String
		 */
		public String readFromProperties(String key) {
			return property.getProperty(key);
		}
		
	}


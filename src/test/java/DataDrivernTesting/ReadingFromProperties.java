package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.devtools.v122.runtime.Runtime.GetPropertiesResponse;

public class ReadingFromProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Properties pr=new Properties();
		pr.load(fis);
		System.out.println(pr.getProperty("url"));
	}

}

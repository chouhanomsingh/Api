package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteWithProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Properties pr=new Properties();
		pr.load(fis);
		pr.put("subject", "value");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		pr.store(fos, "updated successfully");
	}
}

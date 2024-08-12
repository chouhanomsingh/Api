package GenericUtilities;

public interface IConstantPath {
	/**
	 * this interface contains the external file paths and JDBC url
	 * @author omsin
	 */
			String PROPERTIES_PATH="./src/test/resources/data.properties";
			String JDBC_URL="jdbc:mysql://localhost:3306/selenium";
			 String EXCEL_PATH= System.getProperty("user.dir")+"/src/test/resources/VtigerCRMTestData.xlsx";
}

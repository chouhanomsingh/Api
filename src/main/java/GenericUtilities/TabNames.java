//package GenericUtilities;
///**
// * This enum stores all the tab names of vtiger application
// * @author omsin
// */
//public enum TabNames {
//	ORGANIZATION("Accounts"),CONTACTS("Contacts"),LEADS("Leads");
//	private String tabName;
//	private void TabName(String tabName) {
//		this.tabName=tabName;
//	}
//	public String getTabName() {
//		
//	}
//}

package GenericUtilities;

/**
 * This enum stores all the tab names of vtiger application
 * @author omsin
 *
 */
public enum TabNames {

	ORGANIZATIONS("Accounts"), CONTACTS("Contacts"), LEADS("Leads");
	
	private String tabName;
	
	private TabNames(String tabName) {
		this.tabName = tabName;
	}
	
	public String getTabName() {
		return tabName;
	}
}

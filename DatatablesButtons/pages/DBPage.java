package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBPage {
	WebDriver driver;

	@FindBy(xpath = "//div[@id='main-header']/h1")
	private WebElement pageHeader;
	String pageHead;

	@FindAll(@FindBy(tagName = "table"))
	private List<WebElement> tables;

	@FindAll(@FindBy(xpath = "//table[@id='t01']//tr"))
	private List<WebElement> table1Rows;
	@FindAll(@FindBy(xpath = "//table[@id='t01']//tr/th"))
	private List<WebElement> table1Columns;
	@FindBy(xpath = "//table[@id='t01']//tr/th[1]")
	private WebElement table1Header1;
	@FindBy(xpath = "//table[@id='t01']//tr/th[2]")
	private WebElement table1Header2;
	@FindBy(xpath = "//table[@id='t01']//tr/th[3]")
	private WebElement table1Header3;
	@FindBy(xpath = "//table[@id='t01']//tr[4]/td[3]")
	private WebElement michaelAge;
	private String table1Header;

	@FindAll(@FindBy(xpath = "//table[@id='t02']//tr"))
	private List<WebElement> table2Rows;
	@FindAll(@FindBy(xpath = "//table[@id='t02']//tr/th"))
	private List<WebElement> table2Columns;
	@FindAll(@FindBy(xpath = "//table[@id='t02']//tr/td"))
	private List<WebElement> table2data;
	private int table2RowCount;

	@FindBy(name = "firstname")
	private WebElement fName;
	@FindBy(name = "lastname")
	private WebElement lName;
	boolean inputFields;

	@FindAll(@FindBy(xpath = "//nav//ol//li/a"))
	private List<WebElement> breadCrumbLinks;
	@FindBy(xpath = "//nav//ol//li[3]")
	private WebElement contactUs;
	private boolean contactUsCheck;

	@FindAll(@FindBy(xpath = "//nav//ul//li/a"))
	private List<WebElement> paginationLinks;
	private boolean pagesCheck;

	@FindAll(@FindBy(xpath = "//table[@class='table table-light traversal-table']//tr"))
	private List<WebElement> table3Rows;
	@FindAll(@FindBy(xpath = "//table[@class='table table-light traversal-table']//tr[@class='bg-primary']/th"))
	private List<WebElement> table3Columns;
	@FindAll(@FindBy(xpath = "//table[@class='table table-light traversal-table']//tr/th"))
	private List<WebElement> headerdata;
	@FindAll(@FindBy(xpath = "//table[@class='table table-light traversal-table']//tr/td"))
	private List<WebElement> table3data;
	private int table3RowsCount;

	@FindAll(@FindBy(xpath = "//div[@class='traversal-button-states']//button[@type='button']"))
	private List<WebElement> buttonStates1;
	@FindAll(@FindBy(xpath = "//div[@class='btn-group btn-group-toggle']//button[@type='button']"))
	private List<WebElement> buttonStates2;
	@FindBy(xpath = "//button[@class='btn btn-outline-warning disabled']")
	private WebElement warningButton;
	private boolean warningBtn;
	private int nT;

	public DBPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String headerCheck() {
		return pageHead = pageHeader.getText();
	}

	public int tablesCheck() {

		nT = tables.size();
		System.out.println("Number of Tables in this web Page : " + nT);
		return nT;
	}

	public String table1Details() {
		System.out.println("Number of rows in Table1 : " + table1Rows.size());
		System.out.println("Number of rows in Table1 : " + table1Columns.size());
		table1Header = table1Header1.getText() + " , " + table1Header2.getText() + " , " + table1Header3.getText();
		System.out.println(table1Header);
		System.out.println("Age of Michael : " + michaelAge.getText());
		return table1Header;
	}

	public int table2Details() {
		System.out.println("Number of rows in Table2 : " + table2Rows.size());
		table2RowCount = table2Rows.size();
		System.out.println("Number of rows in Table2 : " + table2Columns.size());

		for (WebElement w : table2data) {
			System.out.println(w.getText());
		}

		return table2RowCount;
	}

	public boolean inputFieldsCheck(String firstName, String lastName, String inpText) {
		fName.sendKeys(firstName);
		lName.sendKeys(lastName);
		inputFields = fName.isEnabled();
		System.out.println(lName.isEnabled());
		System.out.println(inputFields);
		return inputFields;

	}

	public boolean breadCrumbLinksCheck() {
		for (WebElement links : breadCrumbLinks) {
			System.out.println(links.getAttribute("href"));
			System.out.println(links.getText());
			System.out.println(links.isEnabled());
		}
		contactUsCheck = contactUs.isEnabled();
		return contactUsCheck;

	}

	public boolean paginationLinksCheck() {
		for (WebElement pagLinks : paginationLinks) {
			System.out.println(pagLinks.getAttribute("href"));
			pagesCheck = pagLinks.getAttribute("href").contentEquals("https://webdriveruniversity.com/Data-Table/index.html#");

		}
		return pagesCheck;
	}

	public int table3Check() {
		table3RowsCount = table3Rows.size();
		System.out.println("Number of rows in Table3 : " + table3RowsCount);
		System.out.println("Number of rows in Table3 : " + table3Columns.size());
		for (WebElement headData : headerdata) {
			System.out.println("Table 3 header data : " + headData.getText());
		}
		for (WebElement tableData : table3data) {
			System.out.println("Table 3 data : " + tableData.getText());
		}
		return table3RowsCount;

	}

	public boolean buttonstatesCheck() {
		for (WebElement btn1 : buttonStates1) {
			System.out.println(btn1.isEnabled());
			System.out.println(btn1.getText());
		}
		for (WebElement btn2 : buttonStates2) {
			System.out.println(btn2.isEnabled());
			System.out.println(btn2.getText());
			btn2.click();
			System.out.println(btn2.getText());
		}
		warningBtn = warningButton.isEnabled();
		System.out.println(warningBtn);
		return warningBtn;

	}

}

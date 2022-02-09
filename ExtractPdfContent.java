package pdf;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtractPdfContent {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		// specify the location of the driver
		System.setProperty("webdriver.chrome.driver", "./exes\\chromedriver.exe");

		// instantiate the driver
		driver = new ChromeDriver();
	}

	@Test
	public void verifyContentInPDf() {
		// specify the url of the pdf file
		String url = "http://www.pdf995.com/samples/pdf.pdf";
		driver.get(url);
		try {
			String pdfContent = readPdfContent(url);
			System.out.println(pdfContent);
			Assert.assertTrue(pdfContent.contains("Introduction"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public static String readPdfContent(String url) throws IOException {

		URL pdfUrl = new URL(url);
		InputStream in = pdfUrl.openStream();
		BufferedInputStream bf = new BufferedInputStream(in);
		PDDocument doc = PDDocument.load(bf);
		PDFTextStripper pdfStrip = new PDFTextStripper();
		pdfStrip.setStartPage(2);
		String content = pdfStrip.getText(doc);
		doc.close();

		return content;
	}

	public static int getPageCount(PDDocument doc) {
		// get the total number of pages in the pdf document
		int pageCount = doc.getNumberOfPages();
		return pageCount;

	}

}

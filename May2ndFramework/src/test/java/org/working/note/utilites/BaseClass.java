package org.working.note.utilites;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert alt;
	public static Select s;
	public static WebDriverWait w;
	public static JavascriptExecutor js;
	public static FileInputStream fin;
	public static Date d;
	
//	1.launching Chrome	
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
//	2.launching edge
	public static void launchEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
//	3.launching IE
	public static void launchIE() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
//	4.launching firefox
	public static void launchFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
//	5.creating get URL by creating a method where we can enter URL eachtime
	public static void loadUrl(String url) {
		driver.get(url);
	}
//  6.Getting title of the URL	
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
//	7.Getting Current URL
	public static void printCurrentURl() {
		System.out.println(driver.getCurrentUrl());
	}
//	8.performing closing current tab
	public static void tabClose() {
		driver.close();
	}
//	9.Quit from the browser
	public static void browserQuit() {
		driver.quit();
	}
//  10.Using WebElement method to sendKeys	
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
	}
//	11.Using WebElement Click method
	public static void btnClick(WebElement c) {
		c.click();
	}
//	12.Maximizing the browser
	public static void maxi() {
		driver.manage().window().maximize();
	}
//  13.Getting text
	public static void para(WebElement p) {
		String text = p.getText();
		System.out.println(text);
	}
	
//	17.attri
	public static void attri(WebElement a, String v) {
	String attribute = a.getAttribute(v);
	System.out.println(attribute);
	}
//  14. Is selected
	public static void selection(WebElement s) {
		System.out.println(s.isSelected());
	}
//  15.displayed 
	public static void displaying(WebElement d) {
		System.out.println(d.isDisplayed());
	}
//	16. Enabled
	public static void enabling(WebElement e) {
	System.out.println(e.isEnabled());	
	}
//	18.moving mouse to element
	public static void movement(WebElement mo) {
		a = new Actions(driver);
		a.moveToElement(mo).perform();
	}
//	19 drag and drop
	public static void dandd(WebElement d1, WebElement d2) {
		a = new Actions(driver);
		a.dragAndDrop(d1, d2).perform();
	}
//	20 double click
	public static void dclick(WebElement dc) {
		a = new Actions(driver);
		a.doubleClick(dc).perform();
	}
//	21 context click
	public static void rclick(WebElement rc) {
		a = new Actions(driver);
		a.contextClick(rc).perform();
	}
	
//	22.sleep
	public static void slp() throws InterruptedException {
	Thread.sleep(5000);
	}
	
//	23. KeyPress
	public static void keyD() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_C);
	}
	
//	24.KeyUp
	public static void keyUp() {
		r.keyRelease(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_C);
	}
//	25. Alert Switch
	public static void altSwitch() {
		alt = driver.switchTo().alert();
	}
//	26. frame id
	public static void frmId(String id) {
		driver.switchTo().frame(id);
	}
//	27. frame name
	public static void frmName(String name) {
		driver.switchTo().frame(name);
	}
//	28. frame element
	public static void frmEle(WebElement ele) {
		driver.switchTo().frame(ele);
	}
//	29. frame Index
	public static void frmindx(int ind) {
		driver.switchTo().frame(ind);
	}
//	30.Parent Frame
	public static void frmPar() {
		driver.switchTo().parentFrame();
	}
//	31. default frame
	public static void frmDef() {
		driver.switchTo().defaultContent();
	}
//	32. parent window
	public static void parWin() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
//	33. child window
	public static void chiWin() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}
//	34.Select Index
	public static void slctInd(WebElement ele, int index) {
		s = new Select(ele);
		s.selectByIndex(index);
		
	}
//	35. Select visible Text
	public static void slctVTxt(String vt) {
		s.selectByVisibleText(vt);
	}
//	36. select value
	public static void slctVal(String vl) {
		s.selectByValue(vl);
	}
//	37. Is Multiple
	public static void multi() {
		System.out.println(s.isMultiple());
	}
//	38. getOption
	public static void goption() {
		s.getOptions();
	}
//	39. Get All Selected option
	public static void slctOpt() {
		s.getAllSelectedOptions();
	}
//	40. Get first selected option
	public static void fOpt() {
		s.getFirstSelectedOption();
	}
//	41. Deselect option index
	public static void dSlctIn(int n) {
		s.deselectByIndex(n);
	}
//	42. Deslect Visible text
	public static void dslctVisTx(String vt) {
		s.deselectByVisibleText(vt);
	}
//	43. Deselect value
	public static void dslctval(String val) {
		s.deselectByValue(val);
	}
//	44. Deselect All
	public static void DeSlctAll() {
		s.deselectAll();
	}
//	45. SwitchWindow
	public static void SwitchWindownUrl(String url) {
		driver.switchTo().window(url);
	}
//	46.Element to be click
	public static void elementToBeclick(WebElement wa) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(wa));
	}
//	47. Element to be selected
	public static void elementToBeSelect(WebElement wa) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeSelected(wa));
	}
//	48. Alert Present
	public static void alertPresent() {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.alertIsPresent());
	}
//	49. Element selection state
	public static void elementSelection(WebElement wa) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementSelectionStateToBe(wa, true));
	}
// 50. Visibility of
	public static void visibilityOff(WebElement wa) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOf(wa));
	}
//	51. Visibility of  Element
	public static void visibilityOfElement(WebElement wa, int sec) {
		w = new WebDriverWait(driver, sec);
		w.until(ExpectedConditions.visibilityOfAllElements(wa));
	}
//	52. Visibility of Element Locate
	public static void visibilityOfElementLoct(By locate) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfElementLocated(locate));
	}
//	53. Visibility of Elements locate
	public static void visibilityOfElementLoctBy(By locate) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locate));
	}
//	54. Title Is
	public static void titleIs(String is) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleIs(is));
	}
//	55. Title Contains
	public static void titleContn(String is) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.titleContains(is));
	}
//	56.Text to be Present in Element 
	public static void txtPrsntInElement(WebElement wa, String til) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.textToBePresentInElement(wa, til));
	}
//	57. Text to be Present In Element LocateBy
	public static void txtPrsntInElementBy(By l, String til ) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.textToBePresentInElementLocated(l, til));
	}
//	58.Text to be present In ElementValue
	public static void txtPrsntInElementByVal(By l, String til ) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.textToBePresentInElementValue(l, til));
	}
//	59. Presence of all element located
	public static void presOfAllElementLoc(By l) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.presenceOfElementLocated(l));
}
//	60. Presence of all element Located By
	public static void presOfAllElementLocBy(By l) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(l));
}	
//	61. Invisibility of all Element 
	public static void invisOfAllElementLoc(By l) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.invisibilityOfElementLocated(l));
}
//	62. Invisibility of All Element Text
	public static void invisOfAllElementTxt(By l, String s) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.invisibilityOfElementWithText(l, s));
}
//	63. Frame available to Switch
	public static void frmAvailSwitch(By l) {
		w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(l));
}
//	64.ImWait
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//	65. Scroll Down
	public static void scrolldwn(WebElement ele) {
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele );
	}
//  66.scroll Up
	public static void scrollUp(WebElement ele) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);

	}
	
	public static void createnewsheet(String xlName,int rowNo,int cellNo, String sheetName,String cellValue) throws IOException {
		File f = new File("C:\\Users\\Admin\\GreenTech\\May2ndFramework\\data\\"+ xlName);
		boolean a = f.createNewFile();
		System.out.println(a);
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet(sheetName);
		Row row = s.createRow(rowNo);
		Cell c = row.createCell(cellNo);
		c.setCellValue(cellValue);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done creating xl");
		
	}
	public static void updateSheet(String xlName,int rowNo,int cellNo, String sheetName,String cellValue) throws IOException {
		File f = new File("C:\\Users\\Admin\\GreenTech\\May2ndFramework\\data\\"+ xlName);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(sheetName);
		Row row = s.createRow(rowNo);
		Cell c = row.createCell(cellNo);
		c.setCellValue(cellValue);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done updating xl");
	
	}
	public static String dataSheet(int rowNo,int cellNo) throws IOException {
		File f = new File("C:\\Users\\Admin\\GreenTech\\May2ndFramework\\data\\FbLoginDetails.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("fbCredentials");
		Row row = s.getRow(rowNo);
		Cell c = row.getCell(cellNo);
		int cellType = c.getCellType();
		String value = " ";
		if (cellType==1) {
			value =c.getStringCellValue();
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			
			value = String.valueOf(l);
		}
		return value;
	}
	
	public void dateTime() {
		d = new Date();
		System.out.println(d);
	}
	
}
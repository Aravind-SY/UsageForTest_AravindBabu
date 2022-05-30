package org.working.note;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.working.note.utilites.BaseClass;
import org.working.note.utilites.LoginPojo;

public class NoteBookWorkOut extends BaseClass {
	
		

	@BeforeClass
	public static void browser() {
		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		maxi();
	}
	
	@Before
	public void startTime() {
		dateTime();
	}
	
	@Test
	public void userDetails() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		String f = "aravind";
		Assert.assertTrue(f, f.contains("aravind"));
		fill(l.getfName(),f);
		System.out.println("Updated the given details");
		fill(l.getlName(), "babu");
		fill(l.getRegEmail(), "arav@babu.com");
		fill(l.getMob(), "9876543210");
		Select s = new Select(l.getCountry());
		s.selectByValue("4");
		fill(l.getCity(), "tamilnadhu");
		fill(l.getMessage(), "first time Reg");
		
		Thread.sleep(8000);
		btnClick(l.getCreate());

	}
	
//	@AfterClass
//	public static void closeBrowser() {
//		tabClose();

//	}
	
	
	
				
	
	}








































//LoginPojo l = new LoginPojo();
//btnClick(l.getBtnClick());
//
//fill(l.getTxtuser(), "arav");
//fill(l.getTxtpass(), "123@qewrt");
//
//btnClick(l.getBtnClick1());










////1st scroll print
//LoginPojo l = new LoginPojo();
//scrolldwn(l.getObj1());
//System.out.println(l.getObj1().getText());
////2nd scroll print
//scrollUp(l.getObj2());
//System.out.println(l.getObj2().getText());
//
////locating and clicking Certification
//btnClick(l.getCerti());
//
////locating content of Selenium
//btnClick(l.getContent());
//
////scrolling down and printing
//scrolldwn(l.getTestimonal());
//System.out.println(l.getTestimonal().getText());
//
////scrolling up to locate course
//scrollUp(l.getMovingUp());
//
////locating course and doing mousehover
//movement(l.getCourse());
//
////locating Java  training
//movement(l.getmJava());
//
////locating core java and click
//movement(l.getmCoreJava());
//l.getmCoreJava().click();
//
////locating anitha paragraph
//scrolldwn(l.getLocatePara());
//
////printing Ani Para
//System.out.println(l.getpAniText().getText());
//
////moving up to select career
//scrollUp(l.getUpobj());
//
////clicking careers
//l.getsCareers().click();
//
////going down to locate email address
//scrolldwn(l.getgDwn());
//
////Locaing last email address and printing
//System.out.println(l.getlEmail().getText());
//
////scrolling up
//scrollUp(l.getUpUp());
//
////locating and contactUS
//l.getContactUs().click();
//
////parentWindow
//parWin();
////childWindow
//chiWin();
//
//System.out.println("Done");
//



//launchChrome();
//loadUrl("http://adactinhotelapp.com/index.php");
//impWait();
//
//LoginPojo l = new LoginPojo();
//
//fill(l.getUser(), "aravind1603");
//fill(l.getPass(), "qwerty");
//
//btnClick(l.getLogin());
//
//slctInd(l.getLocation(), 2);
//slctInd(l.getHotel(), 2);
//slctInd(l.getRoomTy(), 3);
//slctInd(l.getrNo(), 4);
//fill(l.getCheckIn(), "13/05/2022");
//fill(l.getCheckOut(), "17/05/2022");
//slctInd(l.getAdult(), 2);
//slctInd(l.getChild(), 2);
//btnClick(l.getSearch());
//btnClick(l.getRadio());
//btnClick(l.getConti());
//fill(l.getfName(), "Aravind");
//fill(l.getlName(), "Babu");
//fill(l.getAddress(), "Chennai");
//fill(l.getCcNum(), "9123456789012345");
//slctInd(l.getCcType(), 2);
//slctInd(l.getExpMonth(), 6);
//slctInd(l.getExpYear(), 4);
//fill(l.getCvv(), "123");
//btnClick(l.getbNow());
////attri(l.getOrNo(), "value");
//
//WebElement f1 = driver.findElement(By.id("order_no"));
//String attribute = f1.getAttribute("value");
//System.out.println(attribute);

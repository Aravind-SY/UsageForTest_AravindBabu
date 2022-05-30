package org.working.note.utilites;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="first-name")
	private WebElement fName;
	
	@FindBy(id="last-name")
	private WebElement lName;
	
	@FindBy(id ="email")
	private WebElement regEmail;
	
	@FindBy(id="mobile")
	private WebElement mob;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy (id="message")
	private WebElement message;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement create;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getRegEmail() {
		return regEmail;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getCreate() {
		return create;
	}
	
	
	
	
	
//	@FindBy(name ="login")
//	private WebElement btnClick;
//	
//	@FindBy (name = "email")
//	private WebElement txtuser;
//
//	@FindBy (name = "pass")
//	private WebElement txtpass;
//
//	public WebElement getBtnClick() {
//		return btnClick;
//	}
//
//	public WebElement getTxtuser() {
//		return txtuser;
//	}
//
//	public WebElement getTxtpass() {
//		return txtpass;
//	}
//
//@FindBy(id="username")
//private WebElement user;
//
//@FindBy(id="password")
//private WebElement pass;
//
//@FindBy(id="login")
//private WebElement login;
//
//@FindBy(id="location")
//private WebElement location;
//
//@FindBy(id="hotels")
//private WebElement hotel;
//
//@FindBy (id="room_type")
//private WebElement roomTy;
//
//@FindBy(id="room_nos")
//private WebElement rNo;
//
//@FindBy(id="datepick_in")
//private WebElement checkIn;
//
//@FindBy(id="datepick_out")
//private WebElement checkOut;
//
//@FindBy(id="adult_room")
//private WebElement adult;
//
//@FindBy(id="child_room")
//private WebElement child;
//
//@FindBy(id="Submit")
//private WebElement search;
//
//@FindBy(id="radiobutton_0")
//private WebElement radio;
//
//@FindBy(id="continue")
//private WebElement conti;
//
//@FindBy(id="first_name")
//private WebElement fName;
//
//@FindBy(id="last_name")
//private WebElement lName;
//
//@FindBy(id="address")
//private WebElement address;
//
//@FindBy(id="cc_num")
//private WebElement ccNum;
//
//@FindBy(id="cc_type")
//private WebElement ccType;
//
//@FindBy (id="cc_exp_month")
//private WebElement expMonth;
//
//@FindBy(id="cc_exp_year")
//private WebElement expYear;
//
//@FindBy(id="cc_cvv")
//private WebElement cvv;
//
//@FindBy(id="book_now")
//private WebElement bNow;
//
//@FindBy(id="order_no")
//private WebElement orNo;
//
//public WebElement getOrNo() {
//	return orNo;
//}
//
//public WebElement getfName() {
//	return fName;
//}
//
//public WebElement getlName() {
//	return lName;
//}
//
//public WebElement getAddress() {
//	return address;
//}
//
//public WebElement getCcNum() {
//	return ccNum;
//}
//
//public WebElement getCcType() {
//	return ccType;
//}
//
//public WebElement getExpMonth() {
//	return expMonth;
//}
//
//public WebElement getExpYear() {
//	return expYear;
//}
//
//public WebElement getCvv() {
//	return cvv;
//}
//
//public WebElement getbNow() {
//	return bNow;
//}
//
//public WebElement getRadio() {
//	return radio;
//}
//
//public WebElement getConti() {
//	return conti;
//}
//
//public WebElement getSearch() {
//	return search;
//}
//
//public WebElement getHotel() {
//	return hotel;
//}
//
//public WebElement getRoomTy() {
//	return roomTy;
//}
//
//public WebElement getrNo() {
//	return rNo;
//}
//
//public WebElement getCheckIn() {
//	return checkIn;
//}
//
//public WebElement getCheckOut() {
//	return checkOut;
//}
//
//public WebElement getAdult() {
//	return adult;
//}
//
//public WebElement getChild() {
//	return child;
//}
//
//public WebElement getLocation() {
//	return location;
//}
//
//public WebElement getUser() {
//	return user;
//}
//
//public WebElement getPass() {
//	return pass;
//}
//
//public WebElement getLogin() {
//	return login;
//}


	
	
	
	
}








































//@FindBy(id="footer-wrapper")
//private WebElement obj1;
//
//@FindBy(xpath="//h1[@style='font-size:22px;']")
//private WebElement obj2;
//
//@FindBy(xpath="//a[text()='Certifications']")
//private WebElement certi;
//
//@FindBy(xpath="(//a[text()='Course Content'])[29]")
//private WebElement content;
//
//@FindBy(xpath="(//div[@class='trainer-info'])[6]")
//private WebElement Testimonal;
//
//@FindBy(xpath="//h2[text()='Selenium Training in Chennai']")
//private WebElement movingUp;
//
//@FindBy(xpath="//a[text()='COURSES']")
//private WebElement course;
//
//@FindBy(xpath="//a[text()='Java Training ']")
//private WebElement mJava;
//
//@FindBy (xpath="//a[text()='Core Java Training']")
//private WebElement mCoreJava;
//
//@FindBy (xpath="//h2[text()='Java training Reviews from Anitha']")
//private WebElement locatePara;
//
//@FindBy(xpath="//p[contains(text(),'learn Android and Java')]")
//private WebElement pAniText;
//
//@FindBy(id="pageHeader")
//private WebElement upobj;
//
//@FindBy(xpath="//a[text()='CAREERS']")
//private WebElement sCareers;
//
//@FindBy(xpath="//div[@class='copyright']")
//private WebElement gDwn;
//
//@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
//private WebElement lEmail;
//
//@FindBy(xpath="//h1[@title='Selenium Training in Chennai']")
//private WebElement upUp;
//
//@FindBy(xpath="//a[@title='Contact Us']")
//private WebElement contactUs;
//
//
//public WebElement getContactUs() {
//	return contactUs;
//}
//
//public WebElement getUpUp() {
//	return upUp;
//}
//
//public WebElement getlEmail() {
//	return lEmail;
//}
//
//public WebElement getgDwn() {
//	return gDwn;
//}
//
//public WebElement getsCareers() {
//	return sCareers;
//}
//
//public WebElement getUpobj() {
//	return upobj;
//}
//
//public WebElement getpAniText() {
//	return pAniText;
//}
//
//public WebElement getLocatePara() {
//	return locatePara;
//}
//
//public WebElement getmJava() {
//	return mJava;
//}
//
//public WebElement getmCoreJava() {
//	return mCoreJava;
//}
//
//public WebElement getCourse() {
//	return course;
//}
//
//public WebElement getMovingUp() {
//	return movingUp;
//}
//
//public WebElement getTestimonal() {
//	return Testimonal;
//}
//
//public WebElement getContent() {
//	return content;
//}
//
//public WebElement getCerti() {
//	return certi;
//}
//
//public WebElement getObj1() {
//	return obj1;
//}
//
//public WebElement getObj2() {
//	return obj2;
//}

















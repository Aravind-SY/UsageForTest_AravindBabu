package org.working.note;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.working.note.utilites.BaseClass;

public class ProductPojo extends BaseClass{
	
	public ProductPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="(//a[@class='sf-with-ul'])[4]"),
		@FindBy(xpath="//a[text()='Browse By Age Group']")
	})
	private WebElement selAgeGrp;
	
	@FindBy(xpath="//a[text()='Age 1 - 3 Years (Toddlers)']")
	private WebElement catSelect;
	
	@FindBy(xpath="//div[@class='image']")
	private WebElement frProduct;
	
	


	public WebElement getSelAgeGrp() {
		return selAgeGrp;
	}

	public WebElement getCatSelect() {
		return catSelect;
	}

	public WebElement getFrProduct() {
		return frProduct;
	}

}

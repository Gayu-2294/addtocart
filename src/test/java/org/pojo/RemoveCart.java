package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveCart extends BaseClass {
	public RemoveCart() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath = "(//span[@aria-hidden='true'])[3]")
	private WebElement adcart;

	public WebElement getAdcart() {
		return adcart;
	}
	@CacheLookup
	@FindBy(xpath="//input[@aria-label='Delete SGF11 Women&#39;s Kanjivaram Soft Lichi Silk Saree With Blouse Piece (Dark Blue 02)']")
private WebElement delete;

	public WebElement getDelete() {
		return delete;
	}
	
	}



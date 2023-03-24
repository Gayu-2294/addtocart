package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class AddtoCart extends BaseClass {
	public AddtoCart() {
		PageFactory.initElements(driver, this);

	}

	@CacheLookup
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchbox;

	public WebElement getSearchbox() {
		return searchbox;
	}

	@CacheLookup
	@FindBy(xpath = "//span[text()='945']")

	private WebElement product;

	public WebElement getProduct() {
		return product;
	}

}

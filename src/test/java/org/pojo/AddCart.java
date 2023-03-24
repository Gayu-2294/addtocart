package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart extends BaseClass {
public AddCart() {
	PageFactory.initElements(driver,this);
}
@CacheLookup
@FindBy(xpath="//input[@id='add-to-cart-button']")
private WebElement Cart ;

public WebElement getCart() {
	return Cart;
}
@CacheLookup
@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
private WebElement buybutton;

public WebElement getBuybutton() {
	return buybutton;
}

@CacheLookup	
@FindBy(xpath="//input[@type='email']")
private WebElement signin;

public WebElement getSignin() {
	return signin;
}
@CacheLookup
@FindBy(xpath="//*[@id=\"ap_password\"]")
private WebElement pass;

public WebElement getPass() {
	return pass;
}
@CacheLookup
@FindBy(xpath="//*[@id=\"shipToThisAddressButton\"]/span/input")
private WebElement useadd;

public WebElement getUseadd() {
	return useadd;
}

@CacheLookup
@FindBy(xpath="(//input[@type='radio'])[1]")
private WebElement cod;

public WebElement getCod() {
	return cod;
}
@FindBy(xpath="//*[@id=\"header\"]/div/div[4]/a/img")
private WebElement lock;

public WebElement getLock() {
	return lock;
}
}

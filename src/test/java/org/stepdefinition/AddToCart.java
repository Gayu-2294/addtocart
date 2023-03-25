package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojo.AddCart;
import org.pojo.AddtoCart;

import org.pojo.RemoveCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart extends BaseClass {

	@Given("user launch the url of amazon page and do a product search")
	public void user_launch_the_url_of_amazon_page_and_do_a_product_search() throws InterruptedException, AWTException {
		launchBrowser();
		loadUrl("https://www.amazon.in/");
		Thread.sleep(3000);
		maxBrowser();
		pageUrl();
		pageTitle();
		AddtoCart l = new AddtoCart();
		fill(l.getSearchbox(), "sarees for women");
		toPerformEnter();
		scrollintoview();
		Thread.sleep(3000);
		btnClick(l.getProduct());
		Thread.sleep(6000);
		WindowHandles(1);

	}

	@When("user select any product and add that to the cart")
	public void user_select_any_product_and_add_that_to_the_cart() throws InterruptedException {
		AddCart a = new AddCart();
		btnClick(a.getCart());
		Thread.sleep(3000);
		btnClick(a.getBuybutton());

	}

	@When("user place order and login the application using correct credential")
	public void user_place_order_and_login_the_application_using_correct_credential()
			throws AWTException, InterruptedException {
		AddCart a = new AddCart();
		fill(a.getSignin(), "8870724865");
		toPerformEnter();
		fill(a.getPass(), "Gayu@2210");
		toPerformEnter();
		Thread.sleep(3000);

	}

	@When("user select address and select payment option")
	public void user_select_address_and_select_payment_option() throws InterruptedException {
		AddCart a = new AddCart();
		btnClick(a.getUseadd());
		scrollintoview();
		Thread.sleep(9000);
		btnClick(a.getCod());
		btnClick(a.getLock());
		
		WindowHandles(2);
		

	}

	@Then("user remove the product from the cart")
	public void user_remove_the_product_from_the_cart() throws InterruptedException {
		
		RemoveCart rc = new RemoveCart();
		

		btnClick(rc.getAdcart());
		btnClick(rc.getDelete());
		Thread.sleep(3000);
		driver.quit();

	}

}

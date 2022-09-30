package com.blazeecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blazeflight.ReusableMethod;

public class Addcart extends ReusableMethod {

	public Addcart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops']")
	private WebElement clicklaptop;

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macbookClick;

	@FindBy(xpath = "//a[text()='Add to cart']")
	private WebElement addcartbtn;

	@FindBy(id = "cartur")
	private WebElement cartbtn;

	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeorderbtn;

	public WebElement getPlaceorderbtn() {
		return placeorderbtn;
	}

	public void setPlaceorderbtn(WebElement placeorderbtn) {
		this.placeorderbtn = placeorderbtn;
	}

	public WebElement getClicklaptop() {
		return clicklaptop;
	}

	public void setClicklaptop(WebElement clicklaptop) {
		this.clicklaptop = clicklaptop;
	}

	public WebElement getMacbookClick() {
		return macbookClick;
	}

	public void setMacbookClick(WebElement macbookClick) {
		this.macbookClick = macbookClick;
	}

	public WebElement getAddcartbtn() {
		return addcartbtn;
	}

	public void setAddcartbtn(WebElement addcartbtn) {
		this.addcartbtn = addcartbtn;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	public void setCartbtn(WebElement cartbtn) {
		this.cartbtn = cartbtn;
	}

	/**
	 * @param clicklaptop
	 * @param macbookClick
	 * @param addcartbtn
	 * @param cartbtn
	 */
	public void AddMacbook() {
		Click(getClicklaptop());
		Click(getMacbookClick());
		Click(getAddcartbtn());
		Click(getCartbtn());
		Click(getPlaceorderbtn());
	}

}

package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.ReusableMethod;

public class SelectHotel extends ReusableMethod {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement btnSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void select() {
		Click(getBtnSelect());
		Click(getBtnContinue());

	}
	

}

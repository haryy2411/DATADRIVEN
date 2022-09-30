package pomTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.ReusableMethod;

public class LoginPagepom  extends ReusableMethod{
			
			public LoginPagepom() {
		PageFactory.initElements(driver, this);
			}

		@FindBy(id="username")
		private WebElement txtUsername;

		@FindBy(id="password")
		private WebElement txtpassword;

		@FindBy(id="login")
		private WebElement btnLogin;

		public WebElement getTxtUsername() {
			return txtUsername;
		}

		public WebElement getTxtpassword() {
			return txtpassword;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}
			public void login(String userName, String password) {
				
		enterText(getTxtUsername(), userName);
		enterText(getTxtpassword(), password);
		Click(getBtnLogin());	
			}		

}

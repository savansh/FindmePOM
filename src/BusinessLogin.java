import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BusinessLogin {
	
	//constructor
		WebDriver driver;
		public BusinessLogin(WebDriver driver){
			this.driver=driver;
					}
	
	@FindBy(xpath="html/body/div[1]/div/header/div/div/div[2]/div/a[2]")
	public WebElement openlogin;
	@FindBy(xpath="//*[@id='login_username']")
	public WebElement username;
	@FindBy(xpath="//*[@id='login_password']")
	public WebElement password;
	@FindBy(xpath="//*[@id='loginForm']/div[2]/button")
	public WebElement Submitbutton;
	
	public Addbusinees_Step1 Login(String Username, String Password) throws Exception {
		openlogin.click();
		Thread.sleep(2000);
		username.clear();
		username.sendKeys(Username);
		password.clear();
		password.sendKeys(Password);
		Submitbutton.click();
		
		return PageFactory.initElements(driver, Addbusinees_Step1.class);
     
	}

}

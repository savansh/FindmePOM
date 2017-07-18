import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Business_Register {
	
	//constructor
		WebDriver driver;
		public Business_Register(WebDriver driver){
			this.driver=driver;
					}
	
	@FindBy(xpath="html/body/div[1]/div/header/div/div/div[2]/div/a[2]")
	public WebElement Addbusinessbutton;
	@FindBy(linkText="Register Now!")
	public WebElement registernow;
	@FindBy(id="UserFirstname")
	public WebElement UserFirstname;
	@FindBy(id="UserLastname")
	public WebElement UserLastname;
	@FindBy(id="UserUsername")
	public WebElement UserUsername;
	@FindBy(id="UserEmail")
	public WebElement UserEmail;
	@FindBy(id="UserPassword")
	public WebElement UserPassword;
	@FindBy(id="UserRepassword")
	public WebElement UserRepassword;
	@FindBy(id="UserCityId")
	public WebElement UserCityId;
	@FindBy(id="UserConfirm")
	public WebElement UserConfirm;
	@FindBy(id="registerbtn")
	public WebElement registerbtn;
	
		
  public Addbusinees_Step1 Add_BuserTest(String firstname, String lastname, String username, String email, String userpassword,
		  String confirmpassword, String cityname) throws Exception {
	  Thread.sleep(5000);
	  driver.switchTo().defaultContent();
	  Addbusinessbutton.click();
	  Thread.sleep(200);
	  registernow.click();
	  Thread.sleep(200);
	  UserFirstname.clear();
	  UserFirstname.sendKeys(firstname);
	  UserLastname.clear();
	  UserLastname.sendKeys(lastname);
	  UserUsername.clear();
	  UserUsername.sendKeys(username);
	  UserEmail.clear();
	  UserEmail.sendKeys(email);
	  UserPassword.clear();
	  UserPassword.sendKeys(userpassword);
	  UserRepassword.clear();
	  UserRepassword.sendKeys(confirmpassword);
	  UserCityId.sendKeys(cityname);
	  UserConfirm.click();
	  registerbtn.click();
	  
	  return PageFactory.initElements(driver, Addbusinees_Step1.class);
    }

}

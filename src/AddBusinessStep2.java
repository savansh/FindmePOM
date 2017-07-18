import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddBusinessStep2 {
	
	//constructor
		WebDriver driver;
		public AddBusinessStep2(WebDriver driver){
			this.driver=driver;
					}
    
	@FindBy(xpath="//*[@id='BusinessEmail']")
	public WebElement email;
	@FindBy(xpath="//*[@id='headercity']")
	public static WebElement city;
	@FindBy(xpath="//*[@id='BusinessCity<%=Key%>LocationEn']")
	public WebElement location;
	@FindBy(xpath="//*[@id='BusinessCity<%=Key%>PhoneNumber']")
	public WebElement Phonenumber;
	@FindBy(xpath="//*[@id='BusinessCity<%=Key%>PhoneNumber2']")
	public WebElement mobilenumber;
	//Next Address Grid
	@FindBy(xpath="//*[@id='locationblock']/span/a")
	public WebElement locationblock;
	
	
	@FindBy(xpath="//*[@id='BusinessTwitterUrl']")
	public WebElement TwitterUrl;
	@FindBy(xpath="//*[@id='BusinessFacebookUrl']")
	public WebElement FacebookUrl;
	@FindBy(xpath="//*[@id='BusinessInstagramUrl']")
	public WebElement InstagramUrl;
	@FindBy(xpath="//*[@id='BusinessWebUrl']")
	public WebElement WebUrl;
	@FindBy(xpath="//*[@id='BusinessWhatsappNumber']")
	public WebElement WhatsappNumber;
	@FindBy(partialLinkText="Next")
	public static WebElement next;
	
	public AddbusinessStep3 Step2(String userbusinessemail ) {
		
		email.clear();
		email.sendKeys(userbusinessemail);
		city.sendKeys("Jeddah");
		
		next.click();
		
		return PageFactory.initElements(driver, AddbusinessStep3.class);
	}

}

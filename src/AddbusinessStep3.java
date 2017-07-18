import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddbusinessStep3 {
	

	//constructor
		WebDriver driver;
		public AddbusinessStep3(WebDriver driver){
			this.driver=driver;
					}
	
	@FindBy(id="form_time")
	public WebElement Starttime;
	@FindBy(id="to_time")
	public WebElement Endtime;
	@FindBy(xpath="//*[@id='UserStep3Form']/div[2]/div[4]/button")
	public WebElement Submittime;
	@FindBy(partialLinkText="Next")
	public WebElement nextbutton3;
	@FindBy(id="successMessage")
	public WebElement SuccMess;
	
	public void AddBusinessStep3(String startTime, String endTime) throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Starttime.sendKeys(startTime);
		Endtime.sendKeys(endTime);
		Submittime.click();
		Thread.sleep(2000);
		nextbutton3.click();
		//String= SMSuccMess.getText();
		
		

	}

}

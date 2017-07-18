import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class Addbusinees_Step1 {
	
	//constructor
	WebDriver driver;
	public Addbusinees_Step1(WebDriver driver){
		this.driver=driver;
				}
	
  @FindBy(id="BusinessBusinessNameEn")
  public WebElement BusinessNameEn; 
  @FindBy(id="BusinessBusinessNameAr")
  public WebElement BusinessNameAr;
  @FindBy(xpath="//*[@id='s2id_headerCategory']")
  public WebElement clickonCategory;
  @FindBy(xpath="//*[@id='s2id_autogen1_search']")
  public WebElement SearchCategory;
  @FindBy(xpath="//*[@id='BusinessSubcategory0_chosen']/ul")
  public WebElement opensubcategory;
  @FindBy(xpath="//*[@id='BusinessSubcategory0_chosen']/ul/li/input")
  public WebElement searchsubcategory;
  @FindBy(xpath="BusinessPriceRange")
  public WebElement PriceRange;
  @FindBy(name="data[Business][short_desc_en]")
  public WebElement ShortDescEn;
  @FindBy(name="data[Business][short_desc_ar]")
  public WebElement ShortDescAr;
  @FindBy(id="logo_file")
  public WebElement logo_file;
  @FindBy(xpath="//*[@id='imageCropperContailner']/div/div[1]/div[4]/button")
  public WebElement saveCropImage;
  @FindBy(id="cover_file")
  public WebElement coverimage;
  @FindBy(xpath="//*[@id='file_upload_other_images']")
  public WebElement otherimages;
  @FindBy(xpath="//*[@id='menu_file_upload']")
  public WebElement menufileupload;
  @FindBy(partialLinkText="Next")
  public WebElement Nextbutton;
  

  public AddBusinessStep2 AddBussss1(String BusinessNameEnglish, String BusinessNameArabic, String categoryname, String subcategorysearch,
		  String price, String ShortDescEnglish, String ShortDescArabic, String logo, String CoverImage, 
		  String image1, String image2, String image3, String image4, String image5,
		  String menu1, String menu2, String menu3, String menu4, String menu5) throws Exception 
		  {
   
	  BusinessNameEn.clear();
	  BusinessNameEn.sendKeys(BusinessNameEnglish);
	  BusinessNameAr.clear();
	  BusinessNameAr.sendKeys(BusinessNameArabic);
	  clickonCategory.click();
	  Thread.sleep(2000);
	  SearchCategory.clear();
	  SearchCategory.sendKeys(categoryname);
	  Thread.sleep(2000);
	  SearchCategory.sendKeys(Keys.ENTER);
	  opensubcategory.click();
	  Thread.sleep(2000);
	  searchsubcategory.clear();
	  searchsubcategory.sendKeys(subcategorysearch);
	  Thread.sleep(2000);
	  searchsubcategory.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  //price range
	  driver.findElement(By.id("BusinessPriceRange")).click();
	    new Select(driver.findElement(By.id("BusinessPriceRange"))).selectByVisibleText("Moderate");
	  //end
	    //scroll page
	    Thread.sleep(2000);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
	  //ShortDescEn.clear();
	  ShortDescEn.sendKeys(ShortDescEnglish);
	  ShortDescAr.clear();
	  ShortDescAr.sendKeys(ShortDescArabic);
	  logo_file.sendKeys(logo);
	  Thread.sleep(2000);
	  saveCropImage.click();
	  Thread.sleep(2000);
	  coverimage.sendKeys(CoverImage);
	  Thread.sleep(2000);
	  saveCropImage.click();
	  Thread.sleep(2000);
	  otherimages.sendKeys(image1);
	  Thread.sleep(7000);
	  otherimages.sendKeys(image2);
	  Thread.sleep(7000);
	  otherimages.sendKeys(image3);
	  Thread.sleep(7000);
	  otherimages.sendKeys(image4);
	  Thread.sleep(7000);
	  otherimages.sendKeys(image5);
	  Thread.sleep(7000);
	  menufileupload.sendKeys(menu1);
	  Thread.sleep(2000);
	  menufileupload.sendKeys(menu2);
	  Thread.sleep(2000);
	  menufileupload.sendKeys(menu3);
	  Thread.sleep(2000);
	  menufileupload.sendKeys(menu4);
	  Thread.sleep(2000);
	  menufileupload.sendKeys(menu5);
	  Thread.sleep(10000);
	  Nextbutton.click();
	  
	  return PageFactory.initElements(driver, AddBusinessStep2.class);
  }

}

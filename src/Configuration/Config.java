package Configuration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Config {

	//Login Page
	public static final String openlogin="html/body/div[1]/div/header/div/div/div[2]/div/a[2]";
	
	public static final String ="//*[@id='login_username']");
	public WebElement username;
	@FindBy(xpath="//*[@id='login_password']")
	public WebElement password;
	@FindBy(xpath="//*[@id='loginForm']/div[2]/button")
	public WebElement Submitbutton;
	
	
	//Register
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
	
	//Add Business Step1
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
	  
	  
	  //Add Business Step 2
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
		
		//Add Business Step 3
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
	
	}



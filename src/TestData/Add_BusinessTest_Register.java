package TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.AddBusinessStep2;
import Pages.Addbusinees_Step1;
import Pages.AddbusinessStep3;
import Pages.Business_Register;


public class Add_BusinessTest_Register {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:/SELENIUM/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://findmeksa.com/app/webroot/demo/");
		
		Business_Register BR=PageFactory.initElements(driver, Business_Register.class);
		Addbusinees_Step1 step1= BR.Add_BuserTest("firstname3", "lastname4", "username5", "user5@yopmail.com", "123456", "123456", "Riyad");
		Thread.sleep(10000);
		AddBusinessStep2 Step2=step1.AddBussss1("BusinessNameEnglish", "BusinessNameArabic", "Cars & Rides", "Car Wash", "Economic", "ShortDescEnglish", "ShortDescArabic", "C:/Users/kipl34/Desktop/Findme Images/Logo.png", "C:/Users/kipl34/Desktop/Findme Images/Cover_image.png", "C:/Users/kipl34/Desktop/Findme Images/racing-car.jpeg", "C:/Users/kipl34/Desktop/Findme Images/Cover_image.png", "C:/Users/kipl34/Desktop/Findme Images/pexels-photo-167605.jpeg", "C:/Users/kipl34/Desktop/Findme Images/skydiving_175.jpg", "C:/Users/kipl34/Desktop/Findme Images/zipling.jpg", "C:/Users/kipl34/Desktop/Findme Images/wind tunnel - Copy.jpg", "C:/Users/kipl34/Desktop/Findme Images/pexels-photo-185406.jpeg", "C:/Users/kipl34/Desktop/Findme Images/pexels-photo-342520.jpeg", "C:/Users/kipl34/Desktop/Findme Images/flying_lessons_173 - Copy.jpg", "C:/Users/kipl34/Desktop/Findme Images/Cover_image.png");
		AddbusinessStep3 Step3=Step2.Step2("emial12@yopmail.com");
		Step3.AddBusinessStep3("10:00am", "10:00pm");
	}

}

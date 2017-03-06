package junitpack;

import static org.junit.Assert.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class junit_login {
	
	@Test
	public void Login() throws Exception {
				System.setProperty("webdriver.gecko.driver", "C:/Users/alexyang/Desktop/geckodriver.exe");
				//System.setProperty("webdriver.ie.driver", "C:/Users/alexyang/Desktop/IEDriverServer.exe");
				//System.setProperty("webdriver.chrome.driver", "C:/Users/alexyang/Desktop/ChromeDriver.exe");
				WebDriver driverChrome= new FirefoxDriver();
				//WebDriver driverChrome= new InternetExplorerDriver();
				//WebDriver driverChrome= new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driverChrome, 10);
		//login
					driverChrome.manage().window().maximize();
					driverChrome.navigate().to("https://alpha.kalay.us/");
					
		//迴圈		for(int i = 0 ; i < 10; i++){
					driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
					Thread.sleep(1000);
					driverChrome.findElement(By.id("input-email")).clear();
					Thread.sleep(1000);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
				    Thread.sleep(1000);
				    driverChrome.findElement(By.id("input-password")).clear();
				    Thread.sleep(1000);
				    driverChrome.findElement(By.id("input-password")).sendKeys("alex2457");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    Thread.sleep(1000);
		//logout
				    driverChrome.findElement(By.cssSelector("[class='navi_user list_icon']")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driverChrome.findElement(By.linkText("登出")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    
		//keyin Email address: Abnormal    
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b2457111@gmail.com");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).sendKeys("alex2457");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String Email_Abnormal = "帳號或密碼錯誤";
				    //  try{
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
				    // }catch (Exception e){;}
				    String element1 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.4']")).getText();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    if(Email_Abnormal.equals(element1) == true){
				    		System.out.println("1.keyin Email address: Abnormal = pass");
				    }else{
				    		System.out.println("1.keyin Email address: Abnormal = fail");	
				    	 }
		//keyin error password
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).sendKeys("888888ii");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String error_password = "帳號或密碼錯誤";
				//  try{
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.4']")));
				    // }catch (Exception e){;}
				    String element2 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.4']")).getText();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    if(error_password.equals(element2) == true){
				    		System.out.println("2.keyin error password = pass");
				    }else{
				    		System.out.println("2.keyin error password = fail");	
				    	 }
		//keyin less than 8 characters password
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).sendKeys("alex245");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String less_than_8_characters = "請使用8到20個字元之間的字母和數字組合來建立密碼"; 
				//  try{
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.2.1']")));
				    // }catch (Exception e){;}
				    String element3 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    if(less_than_8_characters.equals(element3) == true){
				    		System.out.println("3.keyin less than 8 characters password = pass");
				    }else{
				    		System.out.println("3.keyin less than 8 characters password = fail");	
				    	 }
		// keyin 1~8 password
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).sendKeys("12345678");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String keyin_1to8_password = "請使用8到20個字元之間的字母和數字組合來建立密碼"; 
				//  try{
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.2.1']")));
				    // }catch (Exception e){;}
				    String element4 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    if(keyin_1to8_password.equals(element4) == true){
				    		System.out.println("4.keyin 1~8 password = pass");
				    }else{
				    		System.out.println("4.keyin 1~8 password = fail");	
				    	 }
		// keyin over 20 characters
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).sendKeys("888888888888888iiiiii");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String keyin_over_20_characters = "請使用8到20個字元之間的字母和數字組合來建立密碼"; 
				//  try{
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.2.1']")));
				    // }catch (Exception e){;}
				    String element5 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.2.1']")).getText();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    if(keyin_over_20_characters.equals(element5) == true){
				    		System.out.println("5.keyin over 20 characters = pass");
				    }else{
				    		System.out.println("5.keyin over 20 characters = fail");	
				    	 }
		//The e-mail format incorrect
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("12345678");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).clear();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-password")).sendKeys("888888ii");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("/html/body/div[@id='root']/div/section/form/div[3]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String The_email_format_incorrect = "電子郵件格式錯誤"; 
				//  try{
				    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[data-reactid='.0.1.0.1.1']")));
				    // }catch (Exception e){;}
				    String element6 = driverChrome.findElement(By.cssSelector("span[data-reactid='.0.1.0.1.1']")).getText();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    if(The_email_format_incorrect.equals(element6) == true){
				    		System.out.println("6.The e-mail format incorrect = pass");
				    }else{
				    		System.out.println("6.The e-mail format incorrect = fail");	
				    	 }
		//Enter resend email page	    
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("//*[@id='root']/div/section/div[2]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    String Enter_resend_email_page = "請輸入您的電子郵件地址以重設密碼"; 
					//  try{
					    Thread.sleep(1000);
					    // }catch (Exception e){;}
					    String element7 = driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/form/h4")).getText();
					    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					    if(Enter_resend_email_page.equals(element7) == true){
					    		System.out.println("7.Enter resend email page = pass");
					    }else{
					    		System.out.println("7.Enter resend email page = fail");	
					    	 }
					driverChrome.findElement(By.xpath("//span[@id='logo']")).click();

		//Enter error Captcha verification code	    
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("//*[@id='root']/div/section/div[2]/span")).click();
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.id("input-email")).sendKeys("b24571111@gmail.com");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("//*[@id='input-undefined']")).sendKeys("101");
				    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/form/div[3]/span")).click();
				    String Enter_error_Captcha_verification_code = "驗證碼錯誤,請再試一次"; 
					//  try{
					    Thread.sleep(1000);
					    // }catch (Exception e){;}
					    String element9 = driverChrome.findElement(By.xpath("//*[@id='root']/div/div[2]/form/div[2]/div/span")).getText();
					    driverChrome.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					    if(Enter_error_Captcha_verification_code.equals(element9) == true){
					    		System.out.println("9.Enter error Captcha verification code = pass");
					    }else{
					    		System.out.println("9.Enter error Captcha verification code = fail");	
					    	 }
					driverChrome.findElement(By.xpath("//span[@id='logo']")).click();
					
					File scrFile = ((TakesScreenshot)driverChrome).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
					
		//迴圈			}
				    driverChrome.quit();
				    Thread.sleep(1000);
			}
		}

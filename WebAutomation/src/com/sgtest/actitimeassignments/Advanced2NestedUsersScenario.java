package com.sgtest.actitimeassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced2NestedUsersScenario {
	private static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAsAdmin();	minimizeFlyOutWindow();	createUser1();	logout();
		loginAsUser1();	startExploringActiTime();	createUser2();	logout();
		loginAsUser2();	startExploringActiTime();	createUser3();	logout();
		loginAsUser3(); startExploringActiTime();	createUser4();	logout();
		loginAsUser4();startExploringActiTime();	logout();
		
		loginAsUser3(); modifyUser4();logout();
		loginAsModifiedUser4();logout();
		
		loginAsUser3(); deleteUser4();logout();
		
		loginAsUser2(); modifyUser3(); logout();
		loginAsModifiedUser3();logout();
		loginAsUser2(); deleteUser3();logout();
		
		loginAsUser1(); modifyUser2(); logout();
		loginAsModifiedUser2();logout();
		loginAsUser1(); deleteUser2();logout();
		
		loginAsAdmin(); modifyUser1(); logout();
		loginAsModifiedUser1();logout();
		loginAsAdmin(); deleteUser1();logout();
		closeApp();	
	}

	
	private static void launchBrowser() 
	{
		try 
		{
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/user/submit_tt.do");
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void loginAsAdmin() 
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow() 
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void createUser1() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			oBrowser.findElement(By.name("email")).sendKeys("user1.demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser1() {
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome1");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void startExploringActiTime()
	{
		try
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser2() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User2");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			oBrowser.findElement(By.name("email")).sendKeys("user2.demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("welcome2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser2() {
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser3() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User3");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			oBrowser.findElement(By.name("email")).sendKeys("user3.demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("welcome3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser3() {
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser4() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User4");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			oBrowser.findElement(By.name("email")).sendKeys("user4.demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User4");
			oBrowser.findElement(By.name("password")).sendKeys("welcome4");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome4");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginAsUser4() {
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("User4");
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome4");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(4000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser4()
	{
		try 
		{

			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			//Modify User4
			oBrowser.findElement(By.xpath("//span[text()='demo, User4']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("sample4");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sample4");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

	private static void loginAsModifiedUser4() {
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("User4");
			oBrowser.findElement(By.name("pwd")).sendKeys("sample4");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void modifyUser3()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			//Modify User3
			oBrowser.findElement(By.xpath("//span[text()='demo, User3']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("sample3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sample3");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

	private static void loginAsModifiedUser3() {
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("User3");
			oBrowser.findElement(By.name("pwd")).sendKeys("sample3");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void modifyUser2()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			//Modify User2
			oBrowser.findElement(By.xpath("//span[text()='demo, User2']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("sample2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sample2");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

	private static void loginAsModifiedUser2() {
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("User2");
			oBrowser.findElement(By.name("pwd")).sendKeys("sample2");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser1()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			//Modify User1
			oBrowser.findElement(By.xpath("//span[text()='demo, User1']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("sample1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sample1");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	

	private static void loginAsModifiedUser1()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("User1");
			oBrowser.findElement(By.name("pwd")).sendKeys("sample1");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser4() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			oBrowser.findElement(By.xpath("//span[text()='demo, User4']")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser3() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			oBrowser.findElement(By.xpath("//span[text()='demo, User3']")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser2() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			oBrowser.findElement(By.xpath("//span[text()='demo, User2']")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser1() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			
			oBrowser.findElement(By.xpath("//span[text()='demo, User1']")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout() 
	{
		try 
		{
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
				e.printStackTrace();
		}
	}
	
	private static void closeApp() 
	{
		try 
		{
			oBrowser.quit();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

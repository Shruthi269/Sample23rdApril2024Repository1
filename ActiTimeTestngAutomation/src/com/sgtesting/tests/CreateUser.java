package com.sgtest.actitimeassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUser
{
	private static WebDriver oBrowser = null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApp();
	}
	private static void launchBrowser() 
	{
		try 
		{
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);
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
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
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
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	private static void createUser() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			oBrowser.findElement(By.name("email")).sendKeys("user1.demo@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("welcome1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void deleteUser() 
	{
		try
		{
			oBrowser.findElement(By.xpath("(//span[text()='demo, User1'])[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
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

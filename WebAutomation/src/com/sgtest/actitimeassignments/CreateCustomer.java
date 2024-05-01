package com.sgtest.actitimeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer
{
	private static WebDriver oBrowser = null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logout();
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
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void login() 
	{
		try 
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
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
	
	private static void createCustomer() 
	{
		try 
		{
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Client1");
			oBrowser.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys("Small Business");
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try 
		{
			oBrowser.findElement(By.xpath("(//div[@class='editButton available'])[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
			oBrowser.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();			
			Thread.sleep(2000);
			
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

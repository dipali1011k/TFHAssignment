package com.TFH.test;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.TFH.commons.commons;
import io.appium.java_client.android.AndroidDriver;

public class login1 {
	@Test
public static void loginTest() throws MalformedURLException
{
DesiredCapabilities dc=new DesiredCapabilities();

// Set desired capabilities for your app
dc.setCapability("deviceName", "30cc6c3b");
dc.setCapability("platformName", "Android");
dc.setCapability("appPackage", "com.avegen.together3.16");
dc.setCapability("appActivity", "com.avegen.together.MainActivity");

URL remoteUrl = new URL("http://localhost:4723/wd/hub");
commons.driver = new AndroidDriver(remoteUrl, dc);
commons.driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

WebElement allow=commons.driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW']"));
allow.click();
WebElement eng=commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Eng']"));
eng.click();
WebElement next1 = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
next1.click();
WebElement name = commons.driver.findElement(By.xpath("//android.widget.EditText[@text='Type here']"));
name.sendKeys("Test");
System.out.println("first name you have entered is:"+name);
WebElement next2 = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Next']"));
next2.click();
WebElement month = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='6']"));
month.click();
WebElement next3 = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='NEXT']"));
next3.click();

WebElement skip = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']"));
skip.click();
WebElement location = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Allow']"));
location.click();
WebElement whileUsing = commons.driver.findElement(By.xpath("//android.widget.Button[@text='WHILE USING THE APP']"));
whileUsing.click();
WebElement home = commons.driver.findElement(By.xpath("//android.widget.TextView[@text='Your Current Week']"));
assertTrue(home.isDisplayed());

}
}

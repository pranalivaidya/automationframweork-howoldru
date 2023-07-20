package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class locators {
	
	public static WebElement yourName = baseClass.driver.findElement(By.xpath("//input[@name='name']")); 
	public static WebElement birthdayYear = baseClass.driver.findElement(By.xpath("//input[@name='birthday']")); 
	public static WebElement submitButton=baseClass.driver.findElement(By.xpath("//button[@id='submitButton']"));
	
	public static WebElement incorrectSymbols=baseClass.driver.findElement(By.xpath("//span[contains(text(),'incorrect symbols')]"));

}

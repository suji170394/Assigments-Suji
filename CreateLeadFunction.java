package org.testleaf.week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction
 {
    public static void main(String[] args) 

    {
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://leaftaps.com/opentaps/control/main");

        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM")).click();
        driver.findElement(By.linkText("Lead")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suji");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Caitlyn");
        WebElement dropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select industrySelect = new Select(dropDown);
        industrySelect.selectByIndex(1);
        driver.findElement(By.className("smallSubmit")).click();
        
    }

}

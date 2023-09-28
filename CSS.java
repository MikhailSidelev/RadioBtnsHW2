package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();

        WebElement profileID = driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("mikhailSidelev");

      //        fill in the profile name
        WebElement profileName = driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("hello");


        WebElement feedbackJenny = driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("web is not working");


        WebElement feedbackRaj = driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("web is working");

        //        contains method to fill course topic
        WebElement courseTopics = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("selenium");

        //        using starts with
        WebElement introtoAdv = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        introtoAdv.sendKeys("welcome");
//end with
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("all is good");



    }
}

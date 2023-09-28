package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HW2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement radioEnblBtns = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        radioEnblBtns.click();

        WebElement radioBtnFemale = driver.findElement(By.xpath("//input[@type='radio' and @value='gender-female']"));
        radioBtnFemale.click();

        //        check if the female radio button is displayed

        boolean btnisDisplayedStatus = radioBtnFemale.isDisplayed();
        System.out.println("the female radio button is displayed " + btnisDisplayedStatus);

        WebElement radioShowBtns = driver.findElement(By.xpath("//button[@id='enabledradio']"));
        radioShowBtns.click();

        btnisDisplayedStatus = radioBtnFemale.isDisplayed();
        System.out.println("The female radio button is displayed after clicking 'Show Button': " + btnisDisplayedStatus);


    }
}
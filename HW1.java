package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();


        WebElement checkBox1 = driver.findElement(By.id("//input[@type='checkbox' and @value='Checkbox-1']"));

        // Check if Checkbox1 is enabled
        if (!checkBox1.isEnabled()) {
            // If it's disabled, click on the "Enable Checkboxes" button
            WebElement enableButton = driver.findElement(By.id("//button[@id='enabledcheckbox']"));
            enableButton.click();

            // Wait for Checkbox1 to become enabled
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
            wait.until(ExpectedConditions.elementToBeClickable(checkBox1));
        }

        // Click on Checkbox1
        checkBox1.click();

        // Confirm that Checkbox1 is selected
        if (checkBox1.isSelected()) {
            System.out.println("Checkbox1 is selected.");
        } else {
            System.out.println("Checkbox1 is not selected.");
        }


    }
}
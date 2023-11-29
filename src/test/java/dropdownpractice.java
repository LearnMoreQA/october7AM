import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.Option;

public class dropdownpractice {

    WebDriver driver;
    Select select;

    static Option option;




    public void login() {

        driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/dropdown.html");
    }




    //select dropdown
    public void selectCondition(String option)
    {

        WebElement dropdown = driver.findElement(By.id("selectDropdown"));
        select = new Select(dropdown);
       // select.selectByVisibleText(option);
       // select.selectByValue(option);
       select.selectByIndex(2);
        String selectedOption = select.getFirstSelectedOption().getText();
        System.out.println("TC PASS");


    }

    public static void main (String[]args)
    {
        dropdownpractice objCall = new dropdownpractice();
        objCall.login();

        objCall.selectCondition(String option);


    }
}














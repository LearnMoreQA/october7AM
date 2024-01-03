package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reuseable.BaseClass;
import utils.DriverUtils;

public class CalendarPage extends BaseClass {

    public CalendarPage() {
        PageFactory.initElements(DriverUtils.getInstance().getDriver(), this);
    }


    @FindBy(id = "datepicker")
    private WebElement datePicker;

    @FindBy(className = "ui-datepicker-month")
    private WebElement month;

    @FindBy(className = "ui-datepicker-year")
    private WebElement year;

    @FindBy(xpath = "//a[@title='Next']")
    private WebElement nextBtn;

    @FindBy(xpath = "//a[text()='11']")
    private WebElement day;


    public CalendarPage clickOnDatePicker() {
        clickOnElement(datePicker);
        return this;
    }

    public void clickFutureDate() {
        String currentMonth;
        String currentYear;
        currentMonth = getElementText(month);
        currentYear = getElementText(year);

        while (!(currentMonth.equals("February") && currentYear.equals("2024"))){
            clickOnElement(nextBtn);
            currentMonth =  getElementText(month);
            currentYear = getElementText(year);
        }
        clickOnElement(day);
    }
}

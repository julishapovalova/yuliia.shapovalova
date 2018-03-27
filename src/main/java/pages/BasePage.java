package pages;

import driver.ApplicationManager;
import org.openqa.selenium.WebDriver;

public class BasePage {


    protected ApplicationManager manager;
    private WebDriver driver;


    public BasePage(ApplicationManager manager) {
        this.manager = manager;
        driver = manager.getWebDriverSingleton().getDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BasePage open() {

        return new BasePage(manager);
    }

    public boolean checkIsOpened(String title) {

        return driver.getTitle().equals(title);
    }
}
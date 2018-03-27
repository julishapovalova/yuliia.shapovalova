package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Hooks {
    public WebDriver driver;
    Properties properties = new Properties();
    InputStream input = null;

    public Hooks() {
        driver = null;

        try {
            input = new FileInputStream("config.properties");
            properties.load(input);
            System.out.println(properties.getProperty("browser"));
            System.out.println(properties.getProperty("timeout"));
            System.out.println(properties.getProperty("email"));
            System.out.println(properties.getProperty("password"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

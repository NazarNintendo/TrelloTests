package pages;

import elements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String url = "https://trello.com/";
    private String title = "Trello";

    public Link loginLink = new Link(By.cssSelector("a[href='/login']"));

    public String getTitle() {
        return title;
    }
}

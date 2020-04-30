package pages;

import elements.Container;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardsPage extends Page {
    public BoardsPage(WebDriver driver) {
        super(driver);
    }

    public Container allBoardsContainer = new Container(By.cssSelector("div.all-boards"));
}

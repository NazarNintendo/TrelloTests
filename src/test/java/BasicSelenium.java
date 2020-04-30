import conf.TestManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.BoardsPage;
import pages.HomePage;
import pages.LoginPage;

public class BasicSelenium extends TestManager {

    @Test
    public void openHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.openPage(homePage.url);
        String title = homePage.getTitle();
        Assertions.assertEquals(title, homePage.getTitle());
    }

    @Test
    public void loginTest() {
        // Home page
        HomePage homePage = new HomePage(driver);
        homePage.openPage(homePage.url);
        homePage.loginLink.click();

        // Login page
        LoginPage loginpage = new LoginPage(driver);
        loginpage.emailField.sendKeys("nazarchik1701@gmail.com");
        loginpage.passwordField.sendKeys("electricpants1701" + Keys.ENTER);

        // Boards page
        BoardsPage boardsPage = new BoardsPage(driver);
        Assertions.assertTrue(boardsPage.allBoardsContainer.elementExists());
    }

}

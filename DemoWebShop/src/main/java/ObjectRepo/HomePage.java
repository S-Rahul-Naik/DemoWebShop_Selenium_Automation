package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;


    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ============================================================
    // HOME PAGE WEBELEMENTS
    // ============================================================

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Log in")
    private WebElement loginLink;

    @FindBy(linkText = "Log out")
    private WebElement loginOut;

    @FindBy(linkText = "Shopping cart")
    private WebElement shoppingCartLink;

    @FindBy(linkText = "Wishlist")
    private WebElement wishlistLink;

    @FindBy(linkText = "Gift Cards")
    private WebElement giftCardsLink;

    @FindBy(id = "small-searchterms")
    private WebElement searchBox;

    @FindBy(css = "input[value='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;


    // ============================================================
    // NAVIGATION METHODS
    // ============================================================

    public void clickRegister() {
        registerLink.click();
    }

    public void clickLogin() {
        loginLink.click();
    }

    public void clickLoginOut() {
        loginOut.click();
    }

    public void clickShoppingCart() {
        shoppingCartLink.click();
    }

    public void clickWishlist() {
        wishlistLink.click();
    }

    public void clickGiftCards() {
        giftCardsLink.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }


    // ============================================================
    // SEARCH METHODS
    // ============================================================

    public void enterProductName(String productName) {
        searchBox.sendKeys(productName);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void searchProduct(String productName)
            throws InterruptedException {

        searchBox.clear();
        searchBox.sendKeys(productName);

        Thread.sleep(2000);

        searchButton.click();
    }


    // ============================================================
    // SEARCH RESULT VERIFICATION
    // ============================================================

    public boolean isProductDisplayedInSearchResults(
            String productName) {

        WebElement product =
                driver.findElement(
                        By.xpath(
                                "//h2[@class='product-title']/a[normalize-space()='"
                                + productName
                                + "']"
                        )
                );

        return product.isDisplayed();
    }


    // ============================================================
    // SEARCH RESULT PRODUCT
    // ============================================================

    public void clickSearchedProduct(String productName) {

        driver.findElement(
                By.xpath(
                        "//h2[@class='product-title']/a[normalize-space()='"
                        + productName
                        + "']"
                )
        ).click();
    }
}
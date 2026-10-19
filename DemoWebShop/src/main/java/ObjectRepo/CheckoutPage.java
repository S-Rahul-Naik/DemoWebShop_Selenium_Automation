package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

    private WebDriver driver;


    // ============================================================
    // CONSTRUCTOR
    // ============================================================

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // ============================================================
    // STEP 1 - BILLING ADDRESS
    // ============================================================

    @FindBy(id = "billing-address-select")
    private WebElement billingAddressDropdown;

    @FindBy(id = "BillingNewAddress_FirstName")
    private WebElement billingFirstName;

    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement billingLastName;

    @FindBy(id = "BillingNewAddress_Email")
    private WebElement billingEmail;

    @FindBy(id = "BillingNewAddress_Company")
    private WebElement billingCompany;

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement billingCountry;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    private WebElement billingState;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement billingCity;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement billingAddress1;

    @FindBy(id = "BillingNewAddress_Address2")
    private WebElement billingAddress2;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement billingZipCode;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement billingPhoneNumber;

    @FindBy(id = "BillingNewAddress_FaxNumber")
    private WebElement billingFaxNumber;

    @FindBy(css = "#billing-buttons-container input.new-address-next-step-button")
    private WebElement billingContinueButton;


    // ============================================================
    // STEP 2 - SHIPPING ADDRESS
    // ============================================================

    @FindBy(id = "shipping-address-select")
    private WebElement shippingAddressDropdown;

    @FindBy(id = "ShippingNewAddress_FirstName")
    private WebElement shippingFirstName;

    @FindBy(id = "ShippingNewAddress_LastName")
    private WebElement shippingLastName;

    @FindBy(id = "ShippingNewAddress_Email")
    private WebElement shippingEmail;

    @FindBy(id = "ShippingNewAddress_Company")
    private WebElement shippingCompany;

    @FindBy(id = "ShippingNewAddress_CountryId")
    private WebElement shippingCountry;

    @FindBy(id = "ShippingNewAddress_StateProvinceId")
    private WebElement shippingState;

    @FindBy(id = "ShippingNewAddress_City")
    private WebElement shippingCity;

    @FindBy(id = "ShippingNewAddress_Address1")
    private WebElement shippingAddress1;

    @FindBy(id = "ShippingNewAddress_Address2")
    private WebElement shippingAddress2;

    @FindBy(id = "ShippingNewAddress_ZipPostalCode")
    private WebElement shippingZipCode;

    @FindBy(id = "ShippingNewAddress_PhoneNumber")
    private WebElement shippingPhoneNumber;

    @FindBy(id = "ShippingNewAddress_FaxNumber")
    private WebElement shippingFaxNumber;

    @FindBy(id = "PickUpInStore")
    private WebElement pickupInStoreCheckbox;

    @FindBy(css = "#shipping-buttons-container input.new-address-next-step-button")
    private WebElement shippingContinueButton;
    


    // ============================================================
    // STEP 3 - SHIPPING METHOD
    // ============================================================

    @FindBy(id = "shippingoption_0")
    private WebElement groundShipping;

    @FindBy(id = "shippingoption_1")
    private WebElement nextDayAirShipping;

    @FindBy(id = "shippingoption_2")
    private WebElement secondDayAirShipping;

    @FindBy(css = "#shipping-method-buttons-container input.shipping-method-next-step-button")
    private WebElement shippingMethodContinueButton;


    // ============================================================
    // STEP 4 - PAYMENT METHOD
    // ============================================================

    @FindBy(id = "paymentmethod_0")
    private WebElement cashOnDelivery;

    @FindBy(id = "paymentmethod_1")
    private WebElement checkMoneyOrder;

    @FindBy(id = "paymentmethod_2")
    private WebElement creditCard;

    @FindBy(id = "paymentmethod_3")
    private WebElement purchaseOrder;

    @FindBy(css = "#payment-method-buttons-container input.payment-method-next-step-button")
    private WebElement paymentMethodContinueButton;


    // ============================================================
    // STEP 5 - PAYMENT INFORMATION
    // ============================================================

    // Credit Card payment information

    @FindBy(id = "CreditCardType")
    private WebElement creditCardTypeDropdown;

    @FindBy(id = "CardholderName")
    private WebElement cardholderNameField;

    @FindBy(id = "CardNumber")
    private WebElement cardNumberField;

    @FindBy(id = "ExpireMonth")
    private WebElement expirationMonthDropdown;

    @FindBy(id = "ExpireYear")
    private WebElement expirationYearDropdown;

    @FindBy(id = "CardCode")
    private WebElement cardCodeField;


    // Purchase Order payment information

    @FindBy(id = "PurchaseOrderNumber")
    private WebElement purchaseOrderNumberField;

    @FindBy(css = "#payment-info-buttons-container input.payment-info-next-step-button")
    private WebElement paymentInfoContinueButton;


    // ============================================================
    // STEP 6 - CONFIRM ORDER
    // ============================================================

    @FindBy(css = "#checkout-confirm-order-load")
    private WebElement confirmOrderSection;

    @FindBy(css = "ul.billing-info li.payment-method")
    private WebElement confirmPaymentMethod;

    @FindBy(css = "ul.shipping-info li.shipping-method")
    private WebElement confirmShippingMethod;

    @FindBy(css = "table.cart")
    private WebElement confirmProductTable;

    @FindBy(css = "span.product-price.order-total strong")
    private WebElement confirmOrderTotal;

    @FindBy(css = "#confirm-order-buttons-container input.confirm-order-next-step-button")
    private WebElement confirmOrderButton;


    // ============================================================
    // STEP 7 - ORDER COMPLETED
    // ============================================================

    @FindBy(css = "div.order-completed .title")
    private WebElement orderCompletedTitle;

    @FindBy(css = "div.order-completed .details")
    private WebElement orderCompletedMessage;


    // ============================================================
    // STEP 1 - BILLING ADDRESS METHODS
    // ============================================================

    public void selectBillingAddress(String address) {
        Select select = new Select(billingAddressDropdown);
        select.selectByVisibleText(address);
    }

    public void enterBillingFirstName(String firstName) {
        billingFirstName.clear();
        billingFirstName.sendKeys(firstName);
    }

    public void enterBillingLastName(String lastName) {
        billingLastName.clear();
        billingLastName.sendKeys(lastName);
    }

    public void enterBillingEmail(String email) {
        billingEmail.clear();
        billingEmail.sendKeys(email);
    }

    public void enterBillingCompany(String company) {
        billingCompany.clear();
        billingCompany.sendKeys(company);
    }

    public void selectBillingCountry(String country) {
        Select select = new Select(billingCountry);
        select.selectByVisibleText(country);
    }

    public void selectBillingState(String state) {
        Select select = new Select(billingState);
        select.selectByVisibleText(state);
    }

    public void enterBillingCity(String city) {
        billingCity.clear();
        billingCity.sendKeys(city);
    }

    public void enterBillingAddress1(String address1) {
        billingAddress1.clear();
        billingAddress1.sendKeys(address1);
    }

    public void enterBillingAddress2(String address2) {
        billingAddress2.clear();
        billingAddress2.sendKeys(address2);
    }

    public void enterBillingZipCode(String zipCode) {
        billingZipCode.clear();
        billingZipCode.sendKeys(zipCode);
    }

    public void enterBillingPhoneNumber(String phoneNumber) {
        billingPhoneNumber.clear();
        billingPhoneNumber.sendKeys(phoneNumber);
    }

    public void enterBillingFaxNumber(String faxNumber) {
        billingFaxNumber.clear();
        billingFaxNumber.sendKeys(faxNumber);
    }

    public void clickBillingContinue() {
        billingContinueButton.click();
    }


    // ============================================================
    // STEP 2 - SHIPPING ADDRESS METHODS
    // ============================================================

    public void selectShippingAddress(String address) {
        Select select = new Select(shippingAddressDropdown);
        select.selectByVisibleText(address);
    }

    public void enterShippingFirstName(String firstName) {
        shippingFirstName.clear();
        shippingFirstName.sendKeys(firstName);
    }

    public void enterShippingLastName(String lastName) {
        shippingLastName.clear();
        shippingLastName.sendKeys(lastName);
    }

    public void enterShippingEmail(String email) {
        shippingEmail.clear();
        shippingEmail.sendKeys(email);
    }

    public void enterShippingCompany(String company) {
        shippingCompany.clear();
        shippingCompany.sendKeys(company);
    }

    public void selectShippingCountry(String country) {
        Select select = new Select(shippingCountry);
        select.selectByVisibleText(country);
    }

    public void selectShippingState(String state) {
        Select select = new Select(shippingState);
        select.selectByVisibleText(state);
    }

    public void enterShippingCity(String city) {
        shippingCity.clear();
        shippingCity.sendKeys(city);
    }

    public void enterShippingAddress1(String address1) {
        shippingAddress1.clear();
        shippingAddress1.sendKeys(address1);
    }

    public void enterShippingAddress2(String address2) {
        shippingAddress2.clear();
        shippingAddress2.sendKeys(address2);
    }

    public void enterShippingZipCode(String zipCode) {
        shippingZipCode.clear();
        shippingZipCode.sendKeys(zipCode);
    }

    public void enterShippingPhoneNumber(String phoneNumber) {
        shippingPhoneNumber.clear();
        shippingPhoneNumber.sendKeys(phoneNumber);
    }

    public void enterShippingFaxNumber(String faxNumber) {
        shippingFaxNumber.clear();
        shippingFaxNumber.sendKeys(faxNumber);
    }

    public void selectInStorePickup() {
        if (!pickupInStoreCheckbox.isSelected()) {
            pickupInStoreCheckbox.click();
        }
    }

    public void deselectInStorePickup() {
        if (pickupInStoreCheckbox.isSelected()) {
            pickupInStoreCheckbox.click();
        }
    }

    public void clickShippingContinue() {
        shippingContinueButton.click();
    }


    // ============================================================
    // STEP 3 - SHIPPING METHOD METHODS
    // ============================================================

    public void selectGroundShipping() {
        groundShipping.click();
    }

    public void selectNextDayAirShipping() {
        nextDayAirShipping.click();
    }

    public void selectSecondDayAirShipping() {
        secondDayAirShipping.click();
    }

    public void clickShippingMethodContinue() {
        shippingMethodContinueButton.click();
    }


    // ============================================================
    // STEP 4 - PAYMENT METHOD METHODS
    // ============================================================

    public void selectCashOnDelivery() {
        cashOnDelivery.click();
    }

    public void selectCheckMoneyOrder() {
        checkMoneyOrder.click();
    }

    public void selectCreditCard() {
        creditCard.click();
    }

    public void selectPurchaseOrder() {
        purchaseOrder.click();
    }

    public void clickPaymentMethodContinue() {
        paymentMethodContinueButton.click();
    }


    // ============================================================
    // STEP 5 - PAYMENT INFORMATION METHODS
    // ============================================================

    public void selectCreditCardType(String cardType) {
        Select select = new Select(creditCardTypeDropdown);
        select.selectByVisibleText(cardType);
    }

    public void enterCardholderName(String cardholderName) {
        cardholderNameField.clear();
        cardholderNameField.sendKeys(cardholderName);
    }

    public void enterCardNumber(String cardNumber) {
        cardNumberField.clear();
        cardNumberField.sendKeys(cardNumber);
    }

    public void selectExpirationMonth(String month) {
        Select select = new Select(expirationMonthDropdown);
        select.selectByVisibleText(month);
    }

    public void selectExpirationYear(String year) {
        Select select = new Select(expirationYearDropdown);
        select.selectByVisibleText(year);
    }

    public void enterCardCode(String cardCode) {
        cardCodeField.clear();
        cardCodeField.sendKeys(cardCode);
    }

    public void enterPurchaseOrderNumber(String purchaseOrderNumber) {
        purchaseOrderNumberField.clear();
        purchaseOrderNumberField.sendKeys(purchaseOrderNumber);
    }

    public void clickPaymentInfoContinue() {
        paymentInfoContinueButton.click();
    }


    // ============================================================
    // STEP 6 - CONFIRM ORDER METHODS
    // ============================================================

    public String getConfirmPaymentMethod() {
        return confirmPaymentMethod.getText();
    }

    public String getConfirmShippingMethod() {
        return confirmShippingMethod.getText();
    }

    public String getConfirmOrderTotal() {
        return confirmOrderTotal.getText();
    }

    public void clickConfirmOrder() {
        confirmOrderButton.click();
    }


    // ============================================================
    // STEP 7 - ORDER COMPLETED METHODS
    // ============================================================

    public boolean isOrderPlacedSuccessfullyDisplayed() {
        return orderCompletedMessage.isDisplayed();
    }

    public boolean isOrderCompletedDisplayed() {
        return orderCompletedMessage.isDisplayed();
    }

    public String getOrderCompletedMessage() {
        return orderCompletedTitle.getText();
    }


    // ============================================================
    // BILLING ADDRESS - VERIFICATION METHODS
    // ============================================================

    public boolean isBillingFirstNameDisplayed() {
        return billingFirstName.isDisplayed();
    }

    public boolean isBillingLastNameDisplayed() {
        return billingLastName.isDisplayed();
    }

    public boolean isBillingEmailDisplayed() {
        return billingEmail.isDisplayed();
    }

    public boolean isBillingCompanyDisplayed() {
        return billingCompany.isDisplayed();
    }

    public boolean isBillingCountryDisplayed() {
        return billingCountry.isDisplayed();
    }

    public boolean isBillingStateDisplayed() {
        return billingState.isDisplayed();
    }

    public boolean isBillingCityDisplayed() {
        return billingCity.isDisplayed();
    }

    public boolean isBillingAddress1Displayed() {
        return billingAddress1.isDisplayed();
    }

    public boolean isBillingAddress2Displayed() {
        return billingAddress2.isDisplayed();
    }

    public boolean isBillingZipCodeDisplayed() {
        return billingZipCode.isDisplayed();
    }

    public boolean isBillingPhoneNumberDisplayed() {
        return billingPhoneNumber.isDisplayed();
    }

    public boolean isBillingFaxNumberDisplayed() {
        return billingFaxNumber.isDisplayed();
    }

    public boolean isBillingContinueDisplayed() {
        return billingContinueButton.isDisplayed();
    }


    // ============================================================
    // SHIPPING ADDRESS - VERIFICATION METHODS
    // ============================================================

    public boolean isShippingFirstNameDisplayed() {
        try {
            return shippingFirstName.isDisplayed();

        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isShippingLastNameDisplayed() {
        return shippingLastName.isDisplayed();
    }

    public boolean isShippingEmailDisplayed() {
        return shippingEmail.isDisplayed();
    }

    public boolean isShippingCompanyDisplayed() {
        return shippingCompany.isDisplayed();
    }

    public boolean isShippingCountryDisplayed() {
        return shippingCountry.isDisplayed();
    }

    public boolean isShippingStateDisplayed() {
        return shippingState.isDisplayed();
    }

    public boolean isShippingCityDisplayed() {
        return shippingCity.isDisplayed();
    }

    public boolean isShippingAddress1Displayed() {
        return shippingAddress1.isDisplayed();
    }

    public boolean isShippingAddress2Displayed() {
        return shippingAddress2.isDisplayed();
    }

    public boolean isShippingZipCodeDisplayed() {
        return shippingZipCode.isDisplayed();
    }

    public boolean isShippingPhoneNumberDisplayed() {
        return shippingPhoneNumber.isDisplayed();
    }

    public boolean isShippingFaxNumberDisplayed() {
        return shippingFaxNumber.isDisplayed();
    }

    public boolean isPickupInStoreDisplayed() {
        return pickupInStoreCheckbox.isDisplayed();
    }

    public boolean isShippingContinueDisplayed() {
        try {
            return shippingContinueButton.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    // ============================================================
    // SHIPPING METHOD - VERIFICATION METHODS
    // ============================================================

    public boolean isGroundShippingDisplayed() {
        try {
            return groundShipping.isDisplayed();

        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isNextDayAirShippingDisplayed() {
        return nextDayAirShipping.isDisplayed();
    }

    public boolean isSecondDayAirShippingDisplayed() {
        return secondDayAirShipping.isDisplayed();
    }

    public boolean isShippingMethodContinueDisplayed() {
        try {
            return shippingMethodContinueButton.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    // ============================================================
    // PAYMENT METHOD - VERIFICATION METHODS
    // ============================================================

    public boolean isCashOnDeliveryDisplayed() {
        return cashOnDelivery.isDisplayed();
    }

    public boolean isCheckMoneyOrderDisplayed() {
        return checkMoneyOrder.isDisplayed();
    }

    public boolean isCreditCardDisplayed() {
        return creditCard.isDisplayed();
    }

    public boolean isPurchaseOrderDisplayed() {
        return purchaseOrder.isDisplayed();
    }

    public boolean isPaymentMethodContinueDisplayed() {
        return paymentMethodContinueButton.isDisplayed();
    }


    // ============================================================
    // CONFIRM ORDER - VERIFICATION METHODS
    // ============================================================

    public boolean isConfirmOrderSectionDisplayed() {
        return confirmOrderSection.isDisplayed();
    }

    public boolean isConfirmProductTableDisplayed() {
        return confirmProductTable.isDisplayed();
    }

    public boolean isConfirmOrderButtonDisplayed() {
        return confirmOrderButton.isDisplayed();
    }


    // ============================================================
    // BILLING VALIDATION MESSAGE METHODS
    // ============================================================

    public String getBillingValidationMessage(
            String fieldName) throws InterruptedException {

        String xpath = "";

        switch (fieldName) {

        case "FirstName":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.FirstName']";
            break;

        case "LastName":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.LastName']";
            break;

        case "Email":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.Email']";
            break;

        case "Country":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.CountryId']";
            break;

        case "City":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.City']";
            break;

        case "Address1":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.Address1']";
            break;

        case "Zip":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.ZipPostalCode']";
            break;

        case "Phone":
            xpath =
                "//span[@data-valmsg-for='BillingNewAddress.PhoneNumber']";
            break;

        default:
            throw new IllegalArgumentException(
                "Invalid validation field: " + fieldName
            );
        }

        Thread.sleep(1000);

        return driver.findElement(By.xpath(xpath))
                     .getText()
                     .trim();
    }

    public boolean isBillingValidationMessageDisplayed(
            String fieldName,
            String expectedMessage) throws InterruptedException {

        String actualMessage =
                getBillingValidationMessage(fieldName);

        return actualMessage.equalsIgnoreCase(expectedMessage);
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Locatores
    private By userField = By.id("user-name");
    private By passField = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMsg = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarUsuario(String user) {
        driver.findElement(userField).sendKeys(user);
    }

    public void ingresarPassword(String pass) {
        driver.findElement(passField).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    // Parte 5: metodo simplificado
    public void login(String user, String pass) throws InterruptedException {
        this.ingresarUsuario(user);
        Thread.sleep(1000); // Pausa opcional para observar
        this.ingresarPassword(pass);
        Thread.sleep(1000);
        this.clickLogin();
    }

    public String obtenerMensajeError() {
        return driver.findElement(errorMsg).getText();
    }
}
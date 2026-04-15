import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    WebDriver driver;
        LoginPage loginPage;

        @BeforeEach
        void setUp() {
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            loginPage = new LoginPage(driver);
        }

        @Test
        void loginCorrecto() throws InterruptedException {
            // Usando el método simplificado de la Parte 5
            loginPage.login("standard_user", "secret_sauce");

            Thread.sleep(2000); // Para observar el resultado final

            // Comprobación de URL
            String urlActual = driver.getCurrentUrl();
            assertTrue(urlActual.contains("inventory"), "La URL no redirigió a inventory");
        }

        @Test
        void loginIncorrecto() throws InterruptedException {
            // Introducir datos erróneos
            loginPage.login("user_invalido", "clave_falsa");

            Thread.sleep(2000);

            // Comprobar que aparece el mensaje de error
            String error = loginPage.obtenerMensajeError();
            assertTrue(error.contains("Epic sadface"), "El mensaje de error no es el esperado");
        }

        @AfterEach
        void tearDown() {
            driver.quit();
        }
    }


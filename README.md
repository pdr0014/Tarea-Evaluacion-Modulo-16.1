# Automatización de Pruebas: SauceDemo Login

Este proyecto es un ejercicio práctico de automatización de pruebas web utilizando **Selenium WebDriver**, **JUnit 5** y el patrón de diseño **Page Object Model (POM)**.

## Objetivo
El objetivo es automatizar el flujo de inicio de sesión en la web [SauceDemo](https://www.saucedemo.com/), validando tanto escenarios de éxito como de error (credenciales incorrectas).

## Tecnologías Utilizadas
* **Lenguaje:** Java 11+
* **Framework de Pruebas:** [JUnit 5](https://junit.org/junit5/)
* **Automatización Web:** [Selenium WebDriver](https://www.selenium.dev/)
* **Gestión de Dependencias:** Maven
* **Gestor de Drivers:** WebDriverManager (para evitar la configuración manual de chromedriver)

## Estructura del Proyecto
El proyecto utiliza el patrón **Page Object Model**, lo que separa la lógica de los elementos de la página de la lógica de los tests:

* `src/main/java/pages/LoginPage.java`: Contiene los locatarios (locators) y los métodos que interactúan con la página de inicio de sesión.
* `src/test/java/LoginTest.java`: Contiene los casos de prueba (scripts de prueba) que validan el comportamiento del sitio.

## Casos de Prueba Automatizados
1.  **Login Correcto:** Valida que un usuario con credenciales válidas sea redirigido a la página de inventario (`/inventory.html`).
2.  **Login Incorrecto:** Valida que, al ingresar datos erróneos, el sistema muestre un mensaje de error ("Epic sadface...").

## Configuración y Ejecución
1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/tu-usuario/nombre-del-repo.git](https://github.com/tu-usuario/nombre-del-repo.git)
    ```
2.  **Importar en tu IDE:** Abre el proyecto en IntelliJ IDEA o Eclipse como un proyecto Maven.
3.  **Ejecutar las pruebas:**
    * Desde el IDE: Haz clic derecho sobre la carpeta `src/test/java` y selecciona **Run 'All Tests'**.
    * Desde la terminal:
        ```bash
        mvn test
        ```

## Cuestiones Teóricas Resueltas
El proyecto incluye respuestas a conceptos clave:
* **@BeforeEach:** Configuración previa a cada test.
* **Asserts:** Verificación de resultados esperados.
* **POM:** Ventajas de diseño y mantenibilidad.

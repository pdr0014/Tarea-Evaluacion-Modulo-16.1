#Cuestiones

--¿Qué hace la anotación @BeforeEach?: Indica que el método anotado debe ejecutarse antes de cada test individualmente. Se usa para preparar el entorno (abrir el navegador, inicializar objetos).

--¿Para qué sirve assertTrue: ?Es una aserción de JUnit que verifica que una condición sea verdadera. Si la condición es falsa, el test falla automáticamente y muestra un mensaje opcional.

--¿Diferencia entre findElement() y findElements()?: findElement() devuelve el primer elemento que coincida con el localizador (lanza excepción si no hay ninguno). findElements() devuelve una lista de elementos (si no encuentra nada, devuelve una lista vacía).

--¿Por qué utilizamos una clase LoginPage?Por el patrón Page Object Model (POM). Esto separa la lógica de la interfaz (locatores y clics) de la lógica de negocio (tests). Facilita el mantenimiento: si el ID de un botón cambia, solo lo corriges en un sitio y no en todos los tests.

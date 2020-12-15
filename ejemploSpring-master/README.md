# ejemploSpring
mini proyecto en Spring Framework (CRUD de clientes)
 La conforma un servicio RESTful encargado de manejar un CRUD de clientes 

Este proyecto fue generado con:
- [Eclipse IDE for Java EE Developers](https://www.eclipse.org/downloads/packages/release/kepler/sr2/eclipse-ide-java-ee-developers)

## Indicaciones
Una vez descargado el proyecto y nuestro Eclipse listo para funcionar, importamos nuestro proyecto
con File> Open Projects from File System> Directory y elegimos la carpeta del proyecto.

Dentro de la carpeta src/main/resources se encuentra el archivo application.properties en donde 
se encuentran las configuraciones de nuestra conexión a la base de datos, ahi cambiaremos los datos 
como usuario, puerto o contraseña si es que difieren del usuario, puerto o contraseña que tenemos configurado en 
el gestor de base de datos.

Una vez el proyecto corriendo correctamente se pueden probar las funcionalidades con postman:
ingresamos la URI `http://localhost:8080/api/clientes` para consultar todos los clientes
ingresamos la URI `http://localhost:8080/api/clientes/id` para 
buscar un cliente en especifico por ejemplo `http://localhost:8080/api/clientes/30`

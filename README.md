# PersonaApp (BACKEND)

![Imagen del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/persona-frontend/refs/heads/main/Captura1.JPG?raw=true)



## Ejemplo en vivo
https://victorgranadosjimenez.github.io/persona-frontend/

## Descripción 📑

Aplicación backend en Spring Boot conectada a PostgreSQL en Render. Expone una API REST que permite gestionar personas y sus tarjetas.

## Pasos importantes 📌

Crear una base de datos PostgreSQL en Render

Apunta el hostname, db, username y password.

Configurar el application.properties

spring.datasource.url=jdbc:postgresql://<host>:5432/<db>
spring.datasource.username=<usuario>
spring.datasource.password=<contraseña>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Conectarte desde pgAdmin en tu PC

Añadir nuevo servidor con los datos de Render.

Verificar que las tablas se crean automáticamente al arrancar el backend.

Subir tu backend a Render

Ve a Render → New + → Web Service

Conecta tu repositorio de GitHub.

Errores comunes y soluciones

🚫 Permisos en mvnw

git update-index --chmod=+x mvnw
git commit -m "Fix: make mvnw executable for Render"
git push


🚫 Problema con el entorno de ejecución → Cambiar a Docker

Crear un Dockerfile en la raíz.

Ajustar a una versión de JDK soportada por la imagen oficial de Maven (ej. 20).

## Tecnologías 🛠
[![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://es.wikipedia.org/wiki/Java_(lenguaje_de_programaci%C3%B3n))
[![SPRINGBOOT](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)](https://en.wikipedia.org/wiki/Spring_Boot)

## Vista previa del proyecto
Si quieres hechas un vistazo al proyecto, te recomiendo:

![Captura del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/persona-frontend/refs/heads/main/Captura1.JPG?raw=true)
![Captura del proyecto](https://raw.githubusercontent.com/victorgranadosjimenez/persona-frontend/refs/heads/main/Captura2.JPG?raw=true)


## Autor ✒️
VÍCTOR GRANADOS JIMÉNEZ

<img src="https://avatars.githubusercontent.com/u/57761479?v=4" width=115><br>

* [Perfil Github](https://github.com/victorgranadosjimenez)
* [Correo](granadosvictor01@gmail.com)
* [LinkedIn](www.linkedin.com/in/victorgranadosjimenez/)


## Instalación 
Este proyecto no necesita de instalación. Simplemente abre la carpeta o haz doble click en el .html
  
## Licencia 📄
MIT Public License v3.0
No puede usarse comencialmente.



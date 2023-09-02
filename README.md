# Spring Boot 3 Desarrollar Una API Rest En Java

Realice este curso para Java y:
- Cree una API Rest de Java desde cero con Spring Boot
- Desarrolle CRUD usando la base de datos MySQL
- Use Flyway como una herramienta de migración de API
- Realizar validaciones usando Bean Validation
- Realizar paginación de datos API.

### Para saber más: Java y sus versiones

Estamos utilizando Java 17 en este curso, sin embargo, generalmente Oracle sugiere instalar la versión más actual y no tiene problema usar la versión más reciente pues así evita los problemas de compatibilidad.

Además, puede instalar una versión Java y utilizar otra versión en el IDE de su máquina. Vamos a mostrar dos ejemplos de cómo cambiar la versión de Java en un proyecto.

**Un ejemplo con Intellij IDEA:**

- Seleccione la opción 'File' en el menú principal.
- Seleccione 'Project Structure'.
- En 'Project Settings' en la parte 'Project' seleccione la opción deseada de Java en 'SDK' Y seleccione Ok.
Recuerde que es posible añadir nuevas versiones y utilizar como desee

Un ejemplo con Eclipse:

- Seleccione el proyecto con el botón derecho y seleccione la opción ‘Properties’.
- Seleccione la sección ‘Java Compiler’ y desmarque la opción de la parte ‘JDK Compliance’.
- Después es posible cambiar la versión de Java en la parte ‘Compiler compliance level’.
Seleccione la sección ‘**Java Compiler'** y desmarque la opción de la parte ‘**JDK Compliance**’.- Después es posible cambiar la versión de Java en la parte ‘Compiler compliance level’.

También tenemos un [artículo sobre Java y sus versiones desde Java 8](https://www.aluracursos.com/blog/caracteristica-destacables-java8-delante "artículo sobre Java y sus versiones desde Java 8").

### Para saber más: Spring y Spring Boot

Spring y Spring Boot no son lo mismo con diferentes nombres.

Spring es un framework para desarrollar aplicaciones en Java, creado a mediados de 2002 por Rod Johnson, que se ha vuelto muy popular y adoptado en todo el mundo debido a su simplicidad y facilidad de integración con otras tecnologías.

El framework se desarrolló de forma **modular**, en el que cada recurso que proporciona está representado por un módulo, que se puede agregar a una aplicación según sea necesario. Con esto, en cada aplicación podemos agregar solo los módulos que tengan sentido, haciéndola así más liviana. Hay varios módulos en Spring, cada uno con un propósito diferente, tales como: el módulo **MVC**, para desarrollar aplicaciones Web y API's Rest; el módulo de **Security**, para manejar el control de autenticación y autorización de las aplicaciones; y el módulo **Transactions**, para gestionar el control transaccional.

Sin embargo, uno de los mayores problemas de las aplicaciones que usaban Spring era la parte de configuración de sus módulos, que se hacía íntegramente con archivos XML, y después de unos años el framework también comenzó a soportar configuraciones a través de clases Java, utilizando principalmente anotaciones. En ambos casos, dependiendo del tamaño y complejidad de la aplicación, así como de la cantidad de módulos Spring utilizados en ella, dichas configuraciones eran bastante extensas y difíciles de mantener.

Además, iniciar un nuevo proyecto con Spring era una tarea bastante complicada, debido a la necesidad de realizar este tipo de configuraciones en el proyecto.

Precisamente para solventar tales dificultades, a mediados de 2014 se creó un nuevo módulo Spring, denominado **Boot**, con el objetivo de agilizar la creación de un proyecto que utilice Spring como framework, así como simplificar las configuraciones de sus módulos.

El lanzamiento de Spring Boot fue un hito para el desarrollo de aplicaciones Java, ya que hizo más simple y ágil esta tarea, facilitando mucho la vida de las personas que utilizan el lenguaje Java para desarrollar sus aplicaciones.

A lo largo del curso, aprenderemos a desarrollar una aplicación usando Spring Boot, junto con varios otros módulos de Spring, de una manera simple y productiva.

### Para saber más: novedades Spring Boot 3

La versión 3 de Spring Boot se lanzó en noviembre de 2022 y trae algunas características nuevas en comparación con la versión anterior. Entre las principales novedades se encuentran:

- Compatibilidad con Java 17
- Migración de especificaciones Java EE a Jakarta EE
- Compatibilidad con imágenes nativas
- Puede ver la lista completa de las novedades de Spring Boot versión 3 en el sitio web: Spring Boot 3.0 Release Notes

¡Aviso! Este curso no se centrará principalmente en explorar las novedades y características de la versión 3 de Spring Boot, sino en el desarrollo de una API Rest utilizando Spring Boot como marco, y algunas novedades de la versión 3 solo se utilizarán cuando tengan sentido en el proyecto.

### Haga lo que hicimos en el aula: creando el proyecto

¡Ahora está contigo! Haz el mismo procedimiento que hice en clase. Cree el proyecto inicial a través del sitio web [Spring Initializr](https://start.spring.io/ "Spring Initializr"), importarlo en IntelliJ y finalmente cree una clase Controller como Hello World.

```java
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String holaMundo() {
        return "Hello World Spring!";
    }
}
```

### Para saber más: Intellij y otras IDEs para Java

En primer lugar, si no está familiarizado con la idea de IDE, es una sigla para "Integrated Development Environment" que traducido sería [entorno de desarrollo integrado](https://www.aluracursos.com/blog/aprenda-todo-sobre-el-ide-entorno-de-desarrollo-integrado "entorno de desarrollo integrado"), es decir, un entorno instalado en su sistema operativo para poder manejar diferentes características presentes en un proyecto de desarrollo.

En este curso estamos utilizando la IDE Intellij IDEA pero existen otras herramientas que pueden ser utilizadas para el desarrollo con Java. Le recomendamos que use el mismo IDE que el maestro usa en el curso, sin embargo, no hay problema en usar otros IDEs y explorar los beneficios de ellos.

Así que aquí están algunos artículos que pueden ayudar en este tema:

- [IntelliJ IDEA para principiantes](https://www.aluracursos.com/blog/intellij-idea-para-principiantes "IntelliJ IDEA para principiantes")
- [Aumentando tu productividad con el eclipse](https://www.aluracursos.com/blog/aumentando-tu-productividad-con-el-eclipse "Aumentando tu productividad con el eclipse")
- [Desarrollo de aplicaciones en Java con VsCode](https://www.aluracursos.com/blog/desarrollando-aplicaciones-java-code "Desarrollo de aplicaciones en Java con VsCode")

### Lo que aprendimos

**En esta clase, aprendiste a:**

- Crear un proyecto Spring Boot usando el sitio web Spring Initializr;
- Importar el proyecto a IntelliJ y ejecutar una aplicación Spring Boot a través de la clase que contiene el método main;
- Crear una clase Controller y mapear una URL en él usando las anotaciones `@RestController` y `@RequestMapping`;
- Realizar una solicitud de prueba en el navegador accediendo a la URL mapeada en el Controller.

### Proyecto del aula anterior

¿Comenzando esta etapa? Aquí puedes descargar los archivos del proyecto que hemos realizado anteriormente en el aula.

[Descarga los archivos en Github](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/tree/clase-1 "Descarga los archivos en Github") o haz clic [aquí](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/archive/refs/heads/clase-1.zip "aquí") para descargarlos directamente.
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

### Para saber más: JSON

JSON (JavaScript Object Notation) es un formato utilizado para representar información, al igual que XML y CSV.

Una API necesita recibir y devolver información en algún formato, que representa los recursos que administra. JSON es uno de estos posibles formatos, habiéndose popularizado por su ligereza, sencillez, facilidad de lectura por personas y máquinas, así como por su soporte para diferentes lenguajes de programación.

Un ejemplo de representación de información en formato XML sería:

```java 
<producto>
    <nombre>Mochila</nombre>
    <precio>89.90</precio>
    <descripcion>Mochila para notebooks de hasta 17 pulgadas</descripcion>
</producto>
```
La misma información podría representarse en formato JSON de la siguiente manera:

```java 
{
    “nombre” : “Mochila”,
    “precio” : 89.90,
    “descripcion” : “Mochila para notebooks de hasta 17 pulgadas”
}
```

Observe cómo el formato JSON es mucho más compacto y legible. Precisamente por eso, se ha convertido en el formato universal utilizado en la comunicación de aplicaciones, especialmente en el caso de las API REST.

Se pueden encontrar más detalles sobre JSON en el sitio web [JSON.org](https://www.json.org/json-es.html "JSON.org").

### Para saber más: tratando con CORS

Cuando desarrollamos una API y queremos que todos sus recursos estén disponibles para cualquier cliente HTTP, una de las cosas que nos viene a la mente es CORS (Cross-Origin Resource Sharing), en Español, “Intercambio de recursos con diferentes orígenes” Si aún no te ha pasado, no te preocupes, es normal tener errores de CORS al consumir y poner a disposición las APIs.

![console](https://caelum-online-public.s3.amazonaws.com/1952-desarrollar-api-rest-java/imagem1.png "console")

Pero al fin y al cabo, ¿qué es CORS, qué provoca errores y cómo evitarlos en nuestras APIs con Spring Boot?

**CORS**

CORS es un mecanismo utilizado para agregar encabezados HTTP que le indican a los navegadores que permitan que una aplicación web se ejecute en un origen y acceda a los recursos desde un origen diferente. Este tipo de acción se denomina *cross-origin HTTP request*. En la práctica, les dice a los navegadores si se puede acceder o no a un recurso en particular.

Pero, ¿por qué ocurren los errores? ¡Es hora de entender!

**Same-origin policy**

Por defecto, una aplicación Front-end, escrita en JavaScript, solo puede acceder a los recursos ubicados en el mismo origen de la solicitud. Esto sucede debido a la política del mismo origen *(same-origin policy*), que es un mecanismo de seguridad de los navegadores que restringe la forma en que un documento o script de un origen interactúa con los recursos de otro. Esta política tiene como objetivo detener los ataques maliciosos.

Dos URL comparten el mismo origen si el protocolo, el puerto (si se especifica) y el host son los mismos. Comparemos posibles variaciones considerando la URL `https://cursos.alura.com.br/category/programacao:`

![URL](http://cursos.alura.com.br/category/programacao "URL")

Ahora, la pregunta sigue siendo: ¿qué hacer cuando necesitamos consumir una API con una URL diferente sin tener problemas con CORS? Como, por ejemplo, cuando queremos consumir una API que se ejecuta en el puerto 8000 desde una aplicación React que se ejecuta en el puerto 3000. ¡Compruébalo!

Al enviar una solicitud a una API de origen diferente, la API debe devolver un header llamado **Access-Control-Allow-Origin**. Dentro de ella es necesario informar los diferentes orígenes que serán permitidas de consumir la API, en nuestro caso: `Access-Control-Allow-Origin: http://localhost:3000.`

Puede permitir el acceso desde cualquier origen utilizando el símbolo * (asterisco): `Access-Control-Allow-Origin: *`. Pero esta no es una medida recomendada, ya que permite que fuentes desconocidas accedan al servidor, a menos que sea intencional, como en el caso de una API pública. Ahora veamos cómo hacer esto en Spring Boot correctamente.

**Habilitación de diferentes orígenes en Spring Boot**

Para configurar el CORS y permitir que un origen específico consuma la API, simplemente cree una clase de configuración como la siguiente:

```java
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:3000")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
```

[http://localhost:3000](http://localhost:3000/ "http://localhost:3000") sería la dirección de la aplicación Front-end y **.allowedMethods** los métodos que se permitirán ejecutar. Con esto, podrás consumir tu API sin problemas desde una aplicación front-end.

### Para saber más: Java Record

Lanzado oficialmente en Java 16, pero disponible experimentalmente desde Java 14. **Record** es un recurso que le permite representar una clase inmutable, que contiene solo atributos, constructor y métodos de lectura, de una manera muy simple y ágil.

Este tipo de clase encaja perfectamente para representar clases DTO, ya que su objetivo es únicamente representar datos que serán recibidos o devueltos por la API, sin ningún tipo de comportamiento.

Para crear una clase DTO inmutable, sin la utilización de Record, era necesario escribir mucho código. Veamos un ejemplo de una clase DTO que representa un teléfono:

```java
public final class Telefono {

    private final String ddd;
    private final String numero;

    public Telefono(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ddd, numero);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Telefono)) {
            return false;
        } else {
            Telefono other = (Telefono) obj;
            return Objects.equals(ddd, other.ddd)
              && Objects.equals(numero, other.numero);
        }
    }

    public String getDdd() {
        return this.ddd;
    }

    public String getNumero() {
        return this.numero;
    }
}
```

Ahora, con Record todo ese código se puede resumir en una sola línea:

```java
public record Telefono(String ddd, String numero){}
```

Mucho más simple, ¿no?

Bajo el capó, Java transformará este registro en una clase inmutable, muy similar al código que se muestra arriba.

Se pueden encontrar más detalles sobre esta función en la [documentación oficial](https://docs.oracle.com/en/java/javase/16/language/records.html "documentación oficial").

### Lo que aprendimos

**En esta clase, aprendiste a:**
- Mapear solicitudes POST en una clase Controller;
- Enviar solicitudes POST a la API usando Insomnia;
- Enviar datos a la API en formato JSON;
- Utilizar la anotación `@RequestBody` para recibir datos del cuerpo de la solicitud en un parámetro en el Controller;
- Use el padrón **DTO (Data Transfer Object)**, a través de Java Records, para representar los datos recibidos en una solicitud POST.
 DISCUTIR EN EL FORO
PRÓXIMA ACTIVIDAD

### Proyecto del aula anterior

¿Comenzando esta etapa? Aquí puedes descargar los archivos del proyecto que hemos realizado anteriormente en el aula.

[Descarga los archivos en Github](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/tree/clase-2 "Descarga los archivos en Github") o haz clic [aquí](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/archive/refs/heads/clase-2.zip "aquí") para descargarlos directamente.

### Preparando el ambiente: MySQL

En el curso se utilizará MySQL como sistema de gestión de base de datos, y se recomienda que también lo utilice.

Si no tiene MySQL instalado en su computadora, puede descargarlo de la pagina oficial [https://www.mysql.com/](https://www.mysql.com/ "https://www.mysql.com/")

Dejo acá algunas sugerencias de lectura y video para complementar su aprendizaje:

- [artículo] MySQL: desde la descarga e instalación hasta su primera tabla(Necesita correcciones y actualizar las imagenes (Gen))
- [vídeo] Banco de Datos MySQL | Contenidos ONE

Buenos estudios...

### Para saber más: ¿Archivo properties o yaml?

La configuración de una aplicación Spring Boot se realiza en archivos externos, y podemos usar el archivo de propiedades o el archivo YAML. En este “Para saber más”, abordaremos las principales diferencias entre ellos.

**Archivo de propiedades**
De forma predeterminada, Spring Boot accede a las configuraciones definidas en el archivo application.properties, que utiliza un formato clave=valor:

```java
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/clinica
spring.datasource.username=root
spring.datasource.password=root
```

Cada fila es una configuración única, por lo que necesitamos expresar datos jerárquicos usando los mismos prefijos para nuestras claves, es decir, necesitamos repetir los prefijos, en este caso `spring` y `datasource`.

**Configuración YAML**

YAML es otro formato muy utilizado para definir datos de configuración jerárquicos, como se hace en Spring Boot.

Tomando el mismo ejemplo de nuestro archivo `application.properties`, podemos convertirlo a YAML cambiando su nombre a `application.yml` y modificando su contenido a:

```java
spring:
    datasource:
        driver-class-name: com.mysql.cj.jdbc.Driver
        url: jdbc:mysql://localhost:3306/clinica
        username: root
        password: root
```

Con YAML, la configuración se ha vuelto más legible ya que no contiene prefijos repetitivos. Además de la legibilidad y la reducción de repeticiones, el uso de YAML facilita el almacenamiento de variables de configuración del entorno, como lo recomienda [12 Factor App](https://12factor.net/es/ "12 Factor App"), una metodología conocida y utilizada que define 12 mejores prácticas para crear una aplicación moderna, escalable y de sencillo mantenimiento.

**Pero después de todo, ¿qué formato usar?**

A pesar de las ventajas que nos aportan los archivos YAML frente al archivo properties, la decisión de elegir uno u otro es una cuestión de gusto personal. Además, no se recomienda tener ambos tipos de archivos en el mismo proyecto al mismo tiempo, ya que esto puede generar problemas inesperados en la aplicación.

Si elige usar YAML, tenga en cuenta que escribirlo al principio puede ser un poco laborioso debido a sus reglas de tabulación.
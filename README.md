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

### Para saber más: ¿Qué hay de las clases DAO?

En algunos proyectos Java, dependiendo de la tecnología elegida, es común encontrar clases que siguen el patrón **DAO**, usado para aislar el acceso a los datos. Sin embargo, en este curso usaremos otro patrón, conocido como **Repositorio**.

Pero entonces pueden surgir algunas preguntas: ¿cuál es la diferencia entre los dos enfoques y por qué esta elección?

**Patrón DAO**

El patrón de diseño DAO, también conocido como **Data Access Object**, se utiliza para la persistencia de datos, donde su objetivo principal es separar las reglas de negocio de las reglas de acceso a la base de datos. En las clases que siguen este patrón, aislamos todos los códigos que se ocupan de conexiones, comandos SQL y funciones directas a la base de datos, para que dichos códigos no se esparzan a otras partes de la aplicación, algo que puede dificultar el mantenimiento del código y también el intercambio de tecnologías y del mecanismo de persistencia.

**Implementación**
Supongamos que tenemos una tabla de productos en nuestra base de datos. La implementación del patrón DAO sería la siguiente:

Primero, será necesario crear una clase básica de dominio `Producto`:

```java
public class Producto {
    private Long id;
    private String nombre;
    private BigDecimal precio;
    private String descripcion;

    // constructores, getters y setters
}
```

A continuación, necesitaríamos crear la clase `ProductoDao`, que proporciona operaciones de persistencia para la clase de dominio `Producto`:

```java
public class ProductoDao {

    private final EntityManager entityManager;

    public ProductoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void create(Producto producto) {
        entityManager.persist(producto);
    }

    public Producto read(Long id) {
        return entityManager.find(Producto.class, id);
    }

    public void update(Producto producto) {
        entityManger.merge(producto);
    }

    public void remove(Producto producto) {
        entityManger.remove(producto);
   }

}
```

En el ejemplo anterior, se utilizó JPA como tecnología de persistencia de datos de la aplicación.

**Padrón Repository**
Según el famoso libro Domain-Driven Design de Eric Evans:

El repositorio es un mecanismo para encapsular el almacenamiento, recuperación y comportamiento de búsqueda, que emula una colección de objetos.

En pocas palabras, un repositorio también maneja datos y oculta consultas similares a DAO. Sin embargo, se encuentra en un nivel más alto, más cerca de la lógica de negocio de una aplicación. Un repositorio está vinculado a la regla de negocio de la aplicación y está asociado con el agregado de sus objetos de negocio, devolviéndolos cuando es necesario.

Pero debemos estar atentos, porque al igual que en el patrón DAO, las reglas de negocio que están involucradas con el procesamiento de información no deben estar presentes en los repositorios. Los repositorios no deben tener la responsabilidad de tomar decisiones, aplicar algoritmos de transformación de datos o brindar servicios directamente a otras capas o módulos de la aplicación. Mapear entidades de dominio y proporcionar funcionalidades de aplicación son responsabilidades muy diferentes.

Un repositorio se encuentra entre las reglas de negocio y la capa de persistencia:

1. Proporciona una interfaz para las reglas comerciales donde se accede a los objetos como una colección;
2. Utiliza la capa de persistencia para escribir y recuperar datos necesarios para persistir y recuperar objetos de negocio.
Por lo tanto, incluso es posible utilizar uno o más DAOs en un repositorio.

**¿Por qué el padrón repositorio en lugar de DAO usando Spring?**
El patrón de repositorio fomenta un diseño orientado al dominio, lo que proporciona una comprensión más sencilla del dominio y la estructura de datos. Además, al usar el repositorio de Spring, no tenemos que preocuparnos por usar la API de JPA directamente, simplemente creando los métodos, que Spring crea la implementación en tiempo de ejecución, lo que hace que el código sea mucho más simple, pequeño y legible.

### Para saber más: validación con Bean Validatión

Como se explicó en el video anterior, el Bean Validation se compone de varias anotaciones que se deben agregar a los atributos en los que queremos realizar las validaciones. Hemos visto algunas de estas anotaciones, como `@NotBlank`, que indica que un atributo `String` no puede ser nulo o vacío.

Sin embargo, existen decenas de otras anotaciones que podemos utilizar en nuestro proyecto, para los más diversos tipos de atributos. Puede consultar una lista de las principales anotaciones de Bean Validation en la [documentación oficial](https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints "documentación oficial") de la especificación.


### Para saber más: Error en la migración

Como se indicó a lo largo de esta clase, es importante detener siempre el proyecto al crear los archivos de migración, para evitar que Flyway los ejecute antes de tiempo, con el código aún incompleto, lo que podría causar problemas.

Sin embargo, eventualmente puede ocurrir que nos olvidemos de detener el proyecto y se produzca un error al intentar inicializar la aplicación. En este caso, se mostrará el siguiente error al intentar inicializar la aplicación:

```java
Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'flywayInitializer' defined in class path resource [org/springframework/boot/autoconfigure/flyway/FlywayAutoConfiguration$FlywayConfiguration.class]: Validate failed: Migrations have failed validation
```

Observe en el mensaje de error que se indica que alguna migración falló, lo que impide que el proyecto se inicie correctamente. Este error también puede ocurrir si el código de migración no es válido y contiene algún fragmento de SQL escrito incorrectamente.

Para solucionar este problema será necesario acceder a la base de datos de la aplicación y ejecutar el siguiente comando sql:

```sql
delete from flyway_schema_history where success = 0;
```
El comando anterior se usa para eliminar de la tabla Flyway todas las migraciones cuya ejecución falló. Después de eso, simplemente corrija el código de migración y ejecute el proyecto nuevamente.

### Para saber más: Lombok

Lombok, como se dijo anteriormente, es una biblioteca de Java especialmente enfocada en la reducción de código y en la productividad en el desarrollo de proyectos en ese lenguaje.

Él utiliza la idea de anotaciones (familiar a Spring ¿no?) para generar códigos en el tiempo de compilación. Pero recuerde que no vemos el código generado, y tampoco es posible cambiar lo que se ha generado.

Puede ser una buena herramienta aliada a la hora de escribir clases complejas, siempre que el desarrollador tenga conocimiento sobre ella. Para más información vea la documentación de Lombok: [https://projectlombok.org/](https://projectlombok.org/ "https://projectlombok.org/")

### Para saber más: Anotación @Autowired en Spring

Traducido del inglés, la palabra Autowired sería ''un cable automático''. En el contexto del framework Spring, que utiliza como una de sus bases el patrón de diseño “Inyección de Dependencias”, la idea sirve para definir una inyección automática en un determinado componente del proyecto Spring, ese componente puede ser atributos, métodos e incluso constructores.

Esta anotación se permite con la ayuda de la anotación @SpringBootApplication, en el archivo de configuración de Spring, disponible cada vez que se crea un proyecto Spring.

Al marcar un componente con la anotación @Autowired le estamos diciendo a Spring que el componente es un punto donde se debe inyectar una dependencia, en otras palabras, el componente se inyecta en la clase que lo posee, estableciendo una colaboración entre componentes.

Para más información sobre la anotación, echa un vistazo a la documentación oficial: [https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html")

### solucion de flyway cunado no migra

Parece que el problema está relacionado con la migración de Flyway que intentaste realizar. El error indica que la migración a la versión 2 (alter-table-medicos-add-telefono) ha fallado.

Flyway es muy estricto con las migraciones y si una migración falla, todas las migraciones posteriores también fallarán hasta que se resuelva el problema. En tu caso, parece que la migración a la versión 2 ha fallado, por lo que Flyway no permitirá que se realicen más migraciones hasta que se resuelva este problema.

Para solucionar este problema, intenta seguir estos pasos:

1. Primero, debes eliminar cualquier cambio a medio hacer que se haya producido como resultado de la migración fallida. Esto puede implicar eliminar manualmente cualquier cambio en la base de datos que se haya producido como resultado de la migración fallida.

2. A continuación, debes ejecutar el comando 'repair' de Flyway. Este comando corregirá el historial de esquemas de Flyway al marcar la migración fallida como resuelta. En Spring Boot, puedes hacer esto a través de la línea de comandos con `./mvnw spring-boot:run -Dspring-boot.run.arguments=--spring.flyway.repair` este comando lo debe usar desde la carpeta de la app.

3. Finalmente, debes volver a ejecutar la migración. Asegúrate de que el script de migración esté correcto y no cause errores. En tu caso, el script de migración sería el archivo V2__alter-table-medicos-add-telefono.sql.

Un ejemplo de cómo podría ser tu script de migración es:
`ALTER TABLE medicos ADD telefono VARCHAR(255);`

Tuve un problema similar, lo que hice (en caso de que no o hallas solucionado aun) fue escribir en MySQL la siguiente query "`delete from flyway_schema_history where success = 0;`"

```java
package med.voll.api;

import org.flywaydb.core.Flyway;

public class flywayRepair {
    public static void main(String[] args) {
        // Configura la instancia de Flyway con la configuración de tu base de datos, usuario y contraseña
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:mysql://localhost:3306/tu_base_de_datos", "tu_usuario", "tu_contraseña")
                .load();

        // Ejecuta la reparación de Flyway
        flyway.repair();

    }
}
```

### Lo que aprendimos

En esta clase, aprendiste a:
 
- Agregar nuevas dependencias en el proyecto;
- Asignar una entidad JPA y crear una interfaz de Repositorio para ella;
- Utilizar Flyway como herramienta de migración de proyectos;
- Realice validaciones con Bean Validation usando algunas de sus anotaciones, como `@NotBlank.`

### Proyecto del aula anterior

¿Comenzando esta etapa? Aquí puedes descargar los archivos del proyecto que hemos realizado anteriormente en el aula.

[Descarga los archivos en Github](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/tree/clase-3 "Descarga los archivos en Github") o haz clic [aquí](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/archive/refs/heads/clase-3.zip "aquí") para descargarlos directamente.

### Para saber más: ¿DTO o entidades?

Usamos DTO para representar los datos que recibimos y devolvemos a través de la API, pero probablemente se esté preguntando "¿Por qué, en lugar de crear un DTO, no devolvemos directamente la entidad JPA en el Controller?". Para hacer esto, simplemente cambie el método `list` en el Controller a:

```java
@GetMapping
public List<Medico> listar() {
    return repository.findAll();
}
```

De esa forma, el código sería más ligero y no necesitaríamos crear el DTO en el proyecto.

Pero, ¿es esto realmente una buena idea?

#### Problemas de recepción/devolución de la entidad JPA

De hecho, es mucho más simple y cómodo no usar DTO, sino tratar directamente con entidades JPA en los Controllers. Sin embargo, este enfoque tiene algunas desventajas, incluida la vulnerabilidad de la aplicación a los ataques de **Mass Assignment**.

Uno de los problemas es el hecho de que, al devolver una entidad JPA en un método del Controller, Spring generará el JSON que contiene **todos** sus atributos, y este no siempre es el comportamiento que queremos.

Eventualmente podemos tener atributos que no queremos que sean devueltos en el JSON, ya sea por razones de seguridad, en el caso de datos *sensibles*, o incluso porque no son utilizados por clientes API.

#### Uso de la anotación `@JsonIgnore`

En esta situación, podríamos usar la anotación `@JsonIgnore`, que nos ayuda a ignorar ciertas propiedades de una clase Java cuando se serializa en un objeto JSON.

Su uso consiste en agregar la anotación a los atributos que queremos ignorar cuando se genera el JSON. Por ejemplo, supongamos que tenemos una entidad JPA 'Empleado', en la que queremos ignorar el atributo 'salario':

```java
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Empleado")
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

    @JsonIgnore
    private BigDecimal salario;

    //restante del código omitido…
}
```

En el ejemplo anterior, el atributo 'salario' de la clase 'Empleado' no se mostrará en las respuestas JSON y el problema estaría resuelto.

Sin embargo, puede haber algún otro endpoint de la API en el que necesitemos enviar el salario de los empleados en el JSON, en cuyo caso tendríamos problemas, ya que con la anotación `@JsonIgnore` tal atributo nunca se enviará en el JSON, y al eliminar la anotación se enviará el atributo **siempre**. Por lo tanto, perdemos la flexibilidad de controlar cuándo se deben enviar ciertos atributos en el JSON y cuándo no.

#### DTO

El patrón DTO (Data Transfer Object) es un patrón arquitectónico que se usó ampliamente en aplicaciones Java distribuidas (arquitectura cliente/servidor) para representar los datos que eran enviados y recibidos entre aplicaciones cliente y servidor.

El patrón DTO puede (y debe) usarse cuando no queremos exponer todos los atributos de alguna entidad en nuestro proyecto, una situación similar a los salarios de los empleados que discutimos anteriormente. Además, con la flexibilidad y la opción de filtrar qué datos se transmiten, podemos ahorrar tiempo de procesamiento.

#### Bucle infinito que causa `StackOverflowError`

Otro problema muy recurrente cuando se trabaja directamente con entidades JPA ocurre cuando una entidad tiene alguna auto-relación o relación bidireccional. Por ejemplo, considere las siguientes entidades JPA:

```java
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Producto")
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = “id_categoria”)
    private Categoria categoria;

    //restante del código omitido…
}
```

```java
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Categoria")
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = “categoria”)
    private List<Producto> productos = new ArrayList<>();

    //restante del código omitido…
}
```
Al devolver un objeto de tipo 'Producto' en el Controller, Spring tendría problemas para generar el JSON de este objeto, lo que provocaría una excepción de tipo 'StackOverflowError'. Este problema ocurre porque el objeto producto tiene un atributo de tipo `Categoría`, que a su vez tiene un atributo de tipo `Lista<Producto>`, lo que provoca un bucle infinito en el proceso de serialización a JSON.

Este problema se puede resolver usando la anotación `@JsonIgnore` o usando las anotaciones `@JsonBackReference` y `@JsonManagedReference`, pero también se puede evitar usando un DTO que represente solo los datos que se deben devolver en el JSON.

en insomnia se puede siltrar por medio de agregarle mas comandos al link `size` y `page` por ejemplo:
`http://localhost:8080/medicos?size=1&page=2`
`size` la cantidad de datos que muestre y `page` las paginas que contiene los datos.

`sort` es para organizar los elementos como nombre, ejemplo:
`http://localhost:8080/medicos?size=3&page=0&sort=nombre`

### Para saber más: parámetros de paginación

Como aprendimos en videos anteriores, por defecto, los parámetros utilizados para realizar la paginación y el ordenamiento deben llamarse `page`, `size` y `order`. Sin embargo, Spring Boot permite modificar los nombres de dichos parámetros a través de la configuración en el archivo application.properties.

Por ejemplo, podríamos traducir al español los nombres de estos parámetros con las siguientes propiedades:

```java
spring.data.web.pageable.page-parameter=pagina
spring.data.web.pageable.size-parameter=tamano
spring.data.web.sort.sort-parameter=orden
```

Por lo tanto, en solicitudes que usen paginación, debemos usar estos nombres que fueron definidos. Por ejemplo, para listar los médicos de nuestra API trayendo solo 5 registros de la página 2, ordenados por email y en orden descendente, la URL de solicitud debe ser:

```html
http://localhost:8080/medicos?tamano=5&pagina=1&orden=email,desc
```

### Haga lo que hicimos en el aula: lista de pacientes

¡Ahora está contigo! Haga el mismo procedimiento que hice en clase para la funcionalidad `lista de pacientes`.

```java
@GetMapping
public Page<DatosListaPaciente> listar(@PageableDefault(page = 0, size = 10, sort = {"nombre"}) Pageable paginacion {
    return repository.findAll(paginacion).map(DatosListaPaciente::new);
}
```

También necesita crear el DTO `DatosListaPaciente`:
```java
public record DatosListaPaciente(String nombre, String email, String documentoIdentidad) {
    public DatosListaPaciente(Paciente paciente) {
        this(paciente.getNombre(), paciente.getEmail(), paciente.getDocumentoIdentidad());
    }
}
```

Y, si desea ver los comandos SQL ejecutados en la base de datos, deberá agregar las siguientes propiedades en el archivo `application.properties`:

```java
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Lo que aprendimos

**En esta clase, aprendiste a:**

- Usar la anotación `@GetMapping` para mapear métodos en los Controllers que producen datos;
- Usar la interfaz `Pageable` de Spring para realizar consultas con paginación;
- Controlar la paginación y el ordenamiento de los datos devueltos por la API con los parámetros `page`, `size` y `sort`;
- Configurar el proyecto para que los comandos SQL se visualicen en la consola.

### Proyecto del aula anterior

¿Comenzando esta etapa? Aquí puedes descargar los archivos del proyecto que hemos realizado anteriormente en el aula.

[Descarga los archivos en Github](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/tree/clase-4 "Descarga los archivos en Github") o haz clic [aquí](https://github.com/alura-es-cursos/1952-spring-boot-3-rest-api/archive/refs/heads/clase-4.zip "aquí") para descargarlos directamente.

### Para saber más: Mass Assignment Attack

**Mass Assignment Attack** o Ataque de asignación masiva, en español, ocurre cuando un usuario logra inicializar o reemplazar parámetros que no deben ser modificados en la aplicación. Al incluir parámetros adicionales en una solicitud, si dichos parámetros son válidos, un usuario malintencionado puede generar un efecto secundario no deseado en la aplicación.

El concepto de este ataque se refiere a cuando inyectas un conjunto de valores directamente en un objeto, de ahí la asignación masiva de nombres, que sin la debida validación puede causar serios problemas.

Tomemos un ejemplo práctico. Suponga que tiene el siguiente método, en una clase Controller, utilizado para registrar un usuario en la aplicación:

```java
@PostMapping
@Transactional
public void registrar(@RequestBody @Valid Usuario usuario) {
    repository.save(usuario);
}
```

Y la entidad JPA que representa al usuario:

```java
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity(name = "Usuario")
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private Boolean admin = false;

    //restante del código omitido…
}
```

Observe que el atributo `admin` de la clase `Usuario` se inicializa como `falso`, lo que indica que un usuario siempre debe estar registrado como administrador. Sin embargo, si se envía el siguiente JSON en la solicitud:

```java
{
    “nombre” : “Rodrigo”,
    “email” : “rodrigo@email.com”,
    “admin” : true
}
```

El usuario se registrará con el atributo `admin` con valor `true`. Esto sucede porque el atributo `admin` enviado en el JSON existe en la clase que se está recibiendo en el Controller, considerándose un atributo válido y que se llenará en el objeto `Usuario` que será instanciado por Spring.

Entonces, ¿cómo prevenimos este problema?

**Prevención**

El uso del patrón DTO nos ayuda a evitar este problema, ya que al crear un DTO definimos solo los campos que se pueden recibir en la API, y en el ejemplo anterior el DTO no tendría el atributo `admin`.

Nuevamente, vemos una ventaja más de usar el patrón DTO para representar los datos que entran y salen de la API.

### Para saber más: ¿PUT o PATCH?

Elegir entre el método HTTP PUT o PATCH es una pregunta común que surge cuando estamos desarrollando APIs y necesitamos crear un endpoint para la actualización de recursos. Comprendamos las diferencias entre las dos opciones y cuándo usar cada una.

**PUT**

El método PUT reemplaza todos los datos actuales de un recurso con los datos enviados en la solicitud, es decir, estamos hablando de una actualización completa. Entonces, con él, hacemos la actualización completa de un recurso en una sola solicitud.

**PATCH**

El método PATCH, a su vez, aplica modificaciones parciales a un recurso. Por lo tanto, es posible modificar solo una parte de un recurso. Con PATCH, entonces, realizamos actualizaciones parciales, lo que flexibiliza las opciones de actualización.

**¿Cuál elegir?**

En la práctica, es difícil saber qué método usar, porque no siempre sabremos si un recurso se actualizará parcial o completamente en una solicitud, a menos que lo verifiquemos, algo que no se recomienda.

Entonces, lo más común en las aplicaciones es usar el método PUT para las solicitudes de actualización de recursos en una API, que es nuestra elección en el proyecto utilizado a lo largo de este curso.
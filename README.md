
# 📚 Buscador de Libros - Gutenberg API (LiterAlura)

Una aplicación de consola desarrollada en **Java y Spring Boot** que permite explorar el catálogo de libros del Proyecto Gutenberg consumiendo la API de [Gutendex](https://gutendex.com/). La aplicación busca información de libros y autores, los guarda en una base de datos relacional local y ofrece un menú interactivo para realizar diversas consultas.

## ✨ Funcionalidades

A través de un menú interactivo en la consola, el usuario puede:

1. **Buscar libro por título:** Consume la API de Gutendex, formatea el JSON y guarda los datos relevantes del libro y su autor en la base de datos (evitando duplicados).
2. **Listar libros registrados:** Muestra todos los libros que se han guardado en la base de datos local.
3. **Listar autores registrados:** Muestra todos los autores de los libros buscados previamente.
4. **Listar libros por idioma:** Permite filtrar la colección de libros guardados según su idioma (ej. `es`, `en`, `fr`).
5. **Autores vivos en un determinado año:** Permite ingresar un año y devuelve qué autores registrados en la base de datos estaban vivos en esa época.

## 🛠️ Tecnologías y Herramientas Usadas

* **Java 21+:** Uso de características modernas como `Records` y `Text Blocks`.
* **Spring Boot:** Framework principal para la inyección de dependencias y configuración.
* **Spring Data JPA / Hibernate:** Para el mapeo objeto-relacional (ORM) y la persistencia de datos.
* **PostgreSQL:** Motor de base de datos relacional.
* **Java `HttpClient`:** Para realizar las peticiones HTTP (GET) a la API externa.
* **Jackson (`ObjectMapper`):** Para la deserialización de los datos JSON devueltos por la API.
* **Lombok:** Para reducir el código repetitivo (getters, setters, constructores).
* **Docker:** Para levantar una base de datos local.

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/msxd26/Challenge-Literalura.git
   cd Challenge-Literalura

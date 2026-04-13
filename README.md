# Books Search in API

Lightweight command-line application that queries the Gutendex API (Project Gutenberg index) to search books by title, display top downloads, and compute download statistics — all in-memory with no database required.

---

## Technologies

| Technology | Version |
|---|---|
| Java | 17 |
| Spring Boot | 3.4.0 |
| Jackson Databind | 2.18.1 |
| Java HttpClient (built-in) | — |

---

## Project Structure

```
desafio/
└── src/main/
    ├── java/com/aluracursos/desafio/
    │   ├── DesafioApplication.java
    │   ├── principal/
    │   │   └── Principal.java
    │   ├── model/
    │   │   ├── Datos.java
    │   │   ├── DatosLibros.java
    │   │   └── DatosAutor.java
    │   └── service/
    │       ├── ConsumoAPI.java
    │       ├── ConvierteDatos.java
    │       └── IConvierteDatos.java
    └── test/
        └── DesafioApplicationTests.java
```

---

## Features

On startup the application:

1. Fetches the default Gutendex book list
2. Displays the Top 10 most downloaded books (in-memory sort)
3. Prompts the user to search a book by title fragment
4. Prints the book details if found
5. Shows download statistics (average, max, min, count)

---

## Getting Started

### Prerequisites

- Java 17
- Maven

### Run

```bash
./mvnw spring-boot:run
```

No database or external configuration needed.

---

## Author

**C4mb3r0s** — [github.com/C4mb3r0s](https://github.com/C4mb3r0s)

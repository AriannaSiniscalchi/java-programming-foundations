# ☕ Java Object-Oriented Programming Projects

This repository contains a collection of academic applications developed during my second semester of Computer Engineering at the University of Bergamo (UniBG). 

The focus of these projects ranges from core exception handling to advanced Object-Oriented Software Design (OOP) and structural modeling.

---

## 📂 Project Directory

### 🧮 1. Exception Handling & Fractions (`01-exception-handling-fractions`)
* **Description**: A robust CLI utility designed to handle logic and runtime mathematical operations with fractions[cite: 2].
* **Key Features**:
    * **Custom Checked Exception**: Implements `FrazioneNonCorrettaException` to block domain-specific mathematical errors (e.g., zero denominator)[cite: 1].
    * **Error Tracking**: Demonstrates efficient file handling using `java.util.Scanner` protected by multi-catch blocks for `ArithmeticException` and `IndexOutOfBoundsException`[cite: 2].

### ♟️ 2. Chess Board Simulator (`02-chess-board-oop`)
* **Description**: A complete, object-oriented structural simulation of a classic chess game board, validating movement vectors and logic for every piece[cite: 3, 11].
* **Key Architecture & OOP Patterns**:
    * **Inheritance & Polymorphism**: Uses an abstract base `Pezzo` class extended by specialized pieces such as `Pedone`, `Cavallo`, `Alfiere`, `Torre`, `Regina`, and `Re`[cite: 4, 5, 6, 7, 8, 9, 10].
    * **Domain Validation**: Dynamic rule evaluation via `mossaValida()`, utilizing `Math.abs` and `Integer.signum` for vector tracking and path checking[cite: 4, 5, 10].
    * **Custom Logic Exceptions**: Integrates `MossaIllegaleException` to prevent invalid coordinates or illegal moves[cite: 3].
    * **Data Modeling**: Uses `Enum` for team alignment (`Color`) and object reference bindings to map matrix positions (`Casella`, `Coordinata`)[cite: 11, 12].

### 📄 3. Advanced I/O & Exception Hierarchy (`03-exceptions`)
* **Description**: Exploration of low-level file streaming and the creation of a tiered exception hierarchy[cite: 13, 14].
* **Key Features**:
    * **File Streaming**: Utilizes `FileInputStream` with a byte buffer for efficient data reading from external files like `pippo.txt`[cite: 13, 14].
    * **Exception Scoping**: Implementation of both **Checked** (`MyException`) and **Unchecked** (`MyExceptionNonControllata`) custom exceptions to demonstrate different error-handling strategies[cite: 15, 16].
    * **Resource Management**: Ensures proper closing of streams to prevent memory leaks within `try-catch` blocks[cite: 13].

### 📐 4. Geometry System & Interface-Driven Design (`04-EsercitazioneInterfacce`)
* **Description**: A geometric modeling system that uses interfaces to decouple mathematical logic from graphical representation[cite: 19, 23, 25].
* **Key Features**:
    * **Interface-Driven Development**: Uses `Rotatable` and `Scalable` interfaces to define behavioral contracts independently of the class hierarchy[cite: 21, 22].
    * **Software Decoupling**: Implements `TwoDimensionalCanvas` (via `TextualTwoDimensionalCanvas`) to separate "what" is drawn from "how" it is rendered[cite: 24, 25].
    * **Computational Geometry**: Logic for generating circle points using trigonometry (`sin`, `cos`) and handling 2D coordinate rotations[cite: 18, 20].

### 👥 5. Collections Framework & Object Identity (`05-collections`)
* **Description**: Practical application of the Java Collections Framework focusing on data uniqueness and object lifecycle management.
* **Key Features**:
    * **Set Management**: Utilizes `HashSet` to manage a collection of unique `Persona` objects.
    * **Identity Contract**: Overrides `hashCode()` and `equals()` using `java.util.Objects` to ensure logical equality rather than just reference equality.
    * **Performance Optimization**: Demonstrates how consistent hashing improves data retrieval efficiency in hash-based collections.

### 🛒 6. Retail Management System (`06-retail-connect-system`)
* **Description**: A comprehensive retail ecosystem simulator that manages the entire shopping lifecycle, from warehouse stocking to final receipt generation[cite: 29].
* **Key Architecture & OOP Patterns**:
    * **Advanced Collections (Maps & Sets)**: Utilizes `HashMap<Integer, Integer>` in the `Cliente` class to map product IDs to requested quantities for dynamic cart updates. It also uses `HashSet<Prodotto>` in the `Negozio` class to ensure catalog uniqueness.
    * **Java Stream API & Lambdas**: Implements modern search and filtering logic using `.stream()`, `.filter()`, and `.findFirst()` to efficiently locate products within the store's catalog[cite: 27].
    * **Business Logic Integration**: The `concludiSpesa` method simulates a real-world transaction by verifying availability, calculating totals, updating store stock, and printing a formatted receipt[cite: 26].
    * **Data Integrity & Contracts**: Management of the `hashCode` and `equals` contracts (based on unique product IDs) to ensure reliable object handling within hash-based data structures[cite: 28].
    * **Inventory Synchronization**: Implements logic to handle stock discrepancies using `Math.min()`, preventing sales that exceed current shop availability[cite: 26].

---

## 🛠️ Tech Stack & Concepts Covered
* **Language**: Java SE
* **Tools**: Git, GitHub, `java.util.Scanner`, `java.util.Collections`, `java.io.Stream`
* **Concepts**: Encapsulation, Polymorphism, Inheritance, Interface-driven design, Hashing contracts, Custom Exception Routing, Matrix Grid Mapping.

# ☕ Java Object-Oriented Programming Projects

This repository contains a collection of academic applications developed during my second semester of Computer Engineering at the University of Bergamo (UniBG). 

The focus of these projects ranges from core exception handling to advanced Object-Oriented Software Design (OOP) and structural modeling.

---

## 📂 Project Directory

### 🧮 1. Exception Handling & Fractions (`01-exception-handling-fractions`)
* **Description**: A robust CLI utility designed to handle logic and runtime mathematical operations with fractions.
* **Key Features**:
    * **Custom Checked Exception**: Implements `FrazioneNonCorrettaException` to block domain-specific mathematical errors (e.g., zero denominator).
    * **Error Tracking**: Demonstrates efficient file handling using `java.util.Scanner` protected by multi-catch blocks.

### ♟️ 2. Chess Board Simulator (`02-chess-board-oop`)
* **Description**: A complete, object-oriented structural simulation of a classic chess game board, validating movement vectors and logic for every piece.
* **Key Architecture & OOP Patterns**:
    * **Inheritance & Polymorphism**: Uses an abstract base `Pezzo` class extended by specialized pieces (e.g., `Pedone`, `Regina`).
    * **Data Modeling**: Uses `Enum` for team alignment (`Color`) and matrix mapping for board coordinates.

### 📄 3. Advanced I/O & Exception Hierarchy (`03-exceptions`)
* **Description**: Exploration of low-level file streaming and the creation of a tiered exception hierarchy (Checked vs. Unchecked).

### 📐 4. Geometry System & Interface-Driven Design (`04-EsercitazioneInterfacce`)
* **Description**: A geometric modeling system that uses interfaces (`Rotatable`, `Scalable`) to decouple mathematical logic from graphical representation.

### 👥 5. Collections Framework & Object Identity (`05-collections`)
* **Description**: Practical application of the Java Collections Framework focusing on `hashCode()` and `equals()` contracts to ensure logical object identity.

### 🛒 6. Retail Management System (`06-retail-connect-system`)
* **Description**: A comprehensive retail ecosystem simulator managing warehouse stocking, dynamic carts, and transaction logic.
* **Key Features**:
    * **Advanced Collections**: Utilizes `HashMap` for dynamic cart updates and `HashSet` for catalog uniqueness.
    * **Inventory Synchronization**: Implements logic to handle stock discrepancies using `Math.min()`, preventing sales that exceed shop availability.

### 💳 7. Advanced Retail Framework (`07-retail-connect-evolved`)
* **Description**: Evolution of the retail system introducing specialized loyalty programs and differentiated business logic through inheritance.
* **Key Architecture**:
    * **Inheritance (IS-A)**: Extends `Cliente` into `ClienteTesserato` to add persistent state (`saldoPunti`).
    * **Method Overriding**: Redefines `concludiSpesa` to integrate automated loyalty point calculations and tiered discounts.

### ✈️ 8. Airline Flight Management (`08-flight-management-system`)
* **Description**: An OO framework designed to manage commercial flight operations, passenger manifests, and revenue tracking.
* **Key Technical Implementation**:
    * **Resource Constraint Logic**: Implements rigid validation for seat availability, distinguishing between "First Class" and "Economy" capacities.
    * **Dynamic Manifest Management**: Uses `ArrayList` for real-time passenger tracking, supporting ID-based ticket removal and data persistence.
    * **Financial Aggregation**: Logic for calculating total flight revenue by iterating through the passenger list and aggregating multi-class ticket prices.
    * **Object Formatting**: Overrides `toString()` to provide professional, formatted string representations of passenger data and flight manifests.

---

## 🛠️ Tech Stack & Concepts Covered
* **Language**: Java SE
* **Tools**: Git, GitHub, `java.util.Scanner`, `java.util.Collections`, `java.io.Stream`
* **Concepts**: 
    * **Encapsulation & Access Control**: Protecting internal state across complex class interactions.
    * **Polymorphism & Inheritance (IS-A)**: Building scalable hierarchies for specialized entities.
    * **Interface-Driven Design**: Decoupling logic from rendering and implementation.
    * **Hashing Contracts**: Managing `hashCode` and `equals` for reliable data structures.
    * **Stream API & Lambdas**: Functional-style filtering and searching in large collections.
    * **Resource Constraint Management**: Implementing real-world business rules (stock limits, seat capacity).

# ☕ Java Object-Oriented Programming Projects

This repository contains a collection of academic applications developed during my second semester of Computer Engineering at the University of Bergamo (UniBG). 

The focus of these projects ranges from core exception handling to advanced Object-Oriented Software Design (OOP) and structural modeling.

---

## 📂 Project Directory

### 🧮 1. Exception Handling & Fractions (`01-exception-handling-fractions`)
* **Description:** A robust CLI utility designed to handle logic and runtime mathematical operations with fractions.
* **Key Features:** * Implements a custom checked exception (`FrazioneNonCorrettaException`) to block domain-specific mathematical errors.
  * Demonstrates efficient file handling using `java.util.Scanner` protected by multi-catch error tracking blocks.

### ♟️ 2. Chess Board Simulator (`02-chess-board-oop`)
* **Description:** A complete, object-oriented structural simulation of a classic chess game board, validating movement vectors and logic for every piece.
* **Key Architecture & OOP Patterns Demonstrated:**
  * **Inheritance & Polymorphism:** A generalized abstract approach using a base `Pezzo` class, specialized through structural extensions for individual pieces (`Pedone`, `Cavallo`, `Alfiere`, `Torre`, `Regina`, `Re`).
  * **Domain Validation:** Dynamic rule evaluation (`mossaValida`) using vector tracking, utilizing mathematical calculations (like `Math.abs` and `Integer.signum`) to calculate path steps and check line-of-sight blocks.
  * **Custom Business Logic Exceptions:** Integrates `MossaIllegaleException` to stop invalid coordinates or illegal gameplay movements.
  * **Clean Data Modeling:** Uses robust Enum types for piece team alignment (`Color`) and object reference bindings to map matrix positions (`Casella`, `Coordinata`).

---

## 🛠️ Tech Stack & Concepts Covered
* **Language:** Java SE
* **Concepts:** Encapsulation, Polymorphism, Inheritance, Exception Routing, Data Structures, Matrix Grid Mapping.

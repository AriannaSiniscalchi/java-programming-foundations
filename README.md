# ☕ Java Object-Oriented Programming Projects
> *Computer Engineering Coursework • University of Bergamo (UniBG)*

---

### 💻 Overview
This repository contains a collection of academic applications developed during the **Second Semester** of the Computer Engineering degree at the University of Bergamo (UniBG). 

The focus of these projects ranges from core exception handling to advanced Object-Oriented Software Design (OOP), structural modeling, and robust data management via the Java Collections Framework.

---

### 🛠️ Technical Stack & Core Concepts

| Category | Topics Implemented |
| :--- | :--- |
| **🟢 OOP Core Pillars** | Encapsulation, Access Control modifiers, Polymorphism, and Inheritance structures (`IS-A`). |
| **🔵 Advanced Architecture** | Interface-Driven Design to decouple logic, Abstract classes, Method Overriding, and Method Overloading. |
| **🟠 Data & Collections** | Java Collections Framework (`ArrayList`, `HashMap`, `HashSet`), Hashing Contracts (`hashCode`/`equals`), and `Comparable` natural ordering. |
| **🟡 Defensive Programming** | Custom Checked/Unchecked Exception hierarchies, Multi-Catch blocks, Resource Management (`scanner.close()`), and strict Input Validation. |

---

### 📂 Detailed Project Directory

Below is a comprehensive breakdown of each project included in this repository, highlighting its core functionality and technical implementation details.

#### 🧮 1. Exception Handling & Fractions (`01-exception-handling-fractions`)
> **Core Focus:** Custom Checked Exceptions, `java.util.Scanner`
* **Description:** A robust CLI utility designed to handle logic and runtime mathematical operations with fractions.
* **Technical Details:** Implements a custom checked exception `FrazioneNonCorrettaException` to block domain-specific mathematical errors (e.g., zero denominator) and uses multi-catch blocks for error tracking.

#### ♟️ 2. Chess Board Simulator (`02-chess-board-oop`)
> **Core Focus:** Inheritance, Polymorphism, Matrix Mapping
* **Description:** A complete, object-oriented structural simulation of a classic chess game board, validating movement vectors and logic for every piece.
* **Technical Details:** Uses an abstract base `Pezzo` class extended by specialized pieces (e.g., `Pedone`, `Regina`). Uses `Enum` for team alignment (`Color`) and matrix mapping for board coordinates.

#### 📄 3. Advanced I/O & Exception Hierarchy (`03-exceptions`)
> **Core Focus:** File Streaming, Exception Tiering
* **Description:** Exploration of low-level file streaming and the creation of a tiered exception hierarchy distinguishing between Checked and Unchecked Exceptions.

#### 📐 4. Geometry System & Interface-Driven Design (`04-EsercitazioneInterfacce`)
> **Core Focus:** Decoupling, Java Interfaces
* **Description:** A geometric modeling system that uses custom interfaces (`Rotatable`, `Scalable`) to completely decouple mathematical behavior and logic from graphical representation.

#### 👥 5. Collections Framework & Object Identity (`05-collections`)
> **Core Focus:** `hashCode()` and `equals()` Contracts
* **Description:** Practical application of the Java Collections Framework focusing heavily on the `hashCode()` and `equals()` contracts to ensure logical object identity within data structures.

#### 🛒 6. Retail Management System (`06-retail-connect-system`)
> **Core Focus:** `HashMap`, `HashSet`, Inventory Synchronization
* **Description:** A comprehensive retail ecosystem simulator managing warehouse stocking, dynamic carts, and transaction logic.
* **Technical Details:** Utilizes `HashMap` for dynamic cart updates and `HashSet` for catalog uniqueness. Implements synchronization logic to handle stock discrepancies using `Math.min()`.

#### 💳 7. Advanced Retail Framework (`07-retail-connect-evolved`)
> **Core Focus:** Code Evolution, Specialized Business Logic
* **Description:** Evolution of the retail system introducing specialized loyalty programs and differentiated business logic through inheritance.
* **Technical Details:** Extends `Cliente` into `ClienteTesserato` to add persistent state (`saldoPunti`) and redefines `concludiSpesa` via method overriding to integrate automated loyalty point calculations and tiered discounts.

#### ✈️ 8. Airline Flight Management (`08-flight-management-system`)
> **Core Focus:** Dynamic Manifests, Financial Aggregation, `toString()` Overriding
* **Description:** An OO framework designed to manage commercial flight operations, passenger manifests, and revenue tracking.
* **Technical Details:** Implements rigid validation for seat availability (First Class vs. Economy) using an `ArrayList` for real-time passenger tracking. Overrides `toString()` to provide professional console outputs.

#### 📅 9. Event Hierarchy & Comparators (`09-event-collections`)
> **Core Focus:** Polymorphic Collections, `Comparable` Interface
* **Description:** A project focused on modeling event hierarchies and ensuring object identity integrity.
* **Technical Details:** Implements `hashCode` and `equals` in the `Animale` class for precise data-based identification. Uses the `Comparable` interface to enable natural sorting based on occurrence frequency inside polymorphic `ArrayList<Evento>` structures.

#### 🎲 10. Robust Random Division (`10-random-division-handler`)
> **Core Focus:** Multi-Catch Strategy, Resource Lifecycle, UX Errors
* **Description:** A defensive programming exercise designed to handle unpredictable runtime scenarios through user input validation and random value generation.
* **Technical Details:** Differentiates between `InputMismatchException` and `ArithmeticException` (division by zero). Manages safe closing of I/O resources using `scanner.close()` to completely prevent systemic memory leaks.

#### 📊 11. University Grade Parser & Exception Handling (`11-grade-parser-exception`)
> **Core Focus:** Fault-Tolerant Parsing, Domain Validation
* **Description:** A multi-class system designed to parse, validate, and analyze academic grade strings using a robust exception handling architecture.
* **Technical Details:** Implements a `VotoStudente` model that enforces business rules (18-30 range). Uses a `try-catch` mechanism inside loops to isolate and skip corrupted data, storing valid inputs in an `ArrayList` for statistical aggregation.

#### 🔤 12. String Manipulation & Substring Extractor (`12-substring-extractor`)
> **Core Focus:** String API, Sub-buffer Slicing, Buffer Evaluation
* **Description:** A text-processing CLI utility designed to read user string inputs, dynamically evaluate buffer properties, and safely extract subsets of text based on numeric coordinate indices.
* **Technical Details:** Utilizes standard Java API methods (`s.length()`, `s.substring(inizio, fine)`) with explicit safe boundary check logic and alternates `nextLine()` / `nextInt()` tokens using a unified `Scanner` instance.

#### 🎓 13. Student Records & Grade Classifier (`13-student-grade-classifier`)
> **Core Focus:** Constructor Overloading, Buffer Masking, Encapsulated Modification
* **Description:** An academic management framework designed to encapsulate student profiles, process primitive grade buffers dynamically, and compile a performance-based leaderboard using custom natural ordering.
* **Technical Details:** Features constructor overloading for optional states, implements `Comparable<Studente>` leveraging `Double.compare()` for descending sort based on averages, and wraps mutations under strict conditional boundaries.

---

### 🚀 How to Run the Projects

Every project is structured as an autonomous Java application. Make sure you have a Java Development Kit (JDK 11 or higher) installed on your system.

1. **Clone the repository locally:**
   ```bash
   git clone [https://github.com/YourGitHubUsername/java-oop-projects.git](https://github.com/YourGitHubUsername/java-oop-projects.git)

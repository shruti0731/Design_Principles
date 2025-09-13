# 📚 Library Management System

A Java application to manage library items such as books, CDs and DVDs, including late fee calculation.  
The project is built with a strong emphasis on **SOLID design principles** for clean, maintainable and extensible code.

---

## 🚀 Features
- Add and manage different library items (Book, CD, DVD).
- Track borrowed items and calculate late fees.
- Easily extend the system for new item types or fee rules.

---

## 🛠 Tech Stack
- **Language**: Java 17+  
- **Build/IDE**: IntelliJ IDEA (project files included)  
- **Version Control**: Git

---

## 📂 Project Structure
LibrarySystem/
│

├─ .idea/ # IntelliJ IDEA project settings (not needed for deployment)

├─ out/ # Compiled bytecode (ignored by Git)

├─ src/

│ ├─ items/ # Library item types

│ │ ├─ Book.java

│ │ ├─ CD.java

│ │ ├─ DVD.java

│ │ └─ LibraryItem.java # Base class/interface for all items

│ └─ main/ # Core application logic

│ ├─ LateFeeCalculate.java # Interface for late fee calculation

│ ├─ LateFeeCalculator.java # Implementation of late fee rules

│ └─ Library.java # Entry point and overall library management

│

├─ .gitignore

└─ LibrarySystem.iml # IntelliJ module file


---

## 🧩 SOLID Principles in Action

1. **Single Responsibility Principle (SRP)**  
   - `Book`, `CD` and `DVD` each handle only their own attributes and behavior.  
   - `LateFeeCalculator` focuses solely on fee calculation.

2. **Open/Closed Principle (OCP)**  
   - Add a new media type (e.g., `Magazine`) by creating a new class extending `LibraryItem` without modifying existing classes.

3. **Liskov Substitution Principle (LSP)**  
   - Any subclass of `LibraryItem` can replace its parent without breaking functionality.

4. **Interface Segregation Principle (ISP)**  
   - `LateFeeCalculate` interface ensures classes only implement the fee-calculation contract they need.

5. **Dependency Inversion Principle (DIP)**  
   - `Library` depends on the abstraction `LateFeeCalculate` instead of a concrete implementation, allowing easy swapping of fee rules.

---

## 🏃‍♀️ Getting Started

### Prerequisites
- Java 17+  
- Git

### Steps
**1. Clone the repository**
   git clone https://github.com/shruti0731/Design_Principles.git
   cd LibrarySystem
   
**2. Compile**
   javac src/main/*.java src/items/*.java
   
**3. Run**
   java -cp src main.Library

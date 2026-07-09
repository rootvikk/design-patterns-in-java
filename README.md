# Java Design Patterns & Principles Practice

A clean repository dedicated to learning, implementing, and practicing object-oriented programming (OOP) design principles and software design patterns in Java. The code examples here are hands-on implementations built while studying core architectural concepts through resources like *Head First Design Patterns* (O'Reilly).

## 🚀 Current Demos

*   **`coupling-demo`**  
    A practical demonstration contrasting **tight coupling** (classes rigidly dependent on each other) versus **loose coupling** (using interfaces to make classes flexible and easily interchangeable).
    
*   **`DuckSimApp`**  
    An implementation of the **Strategy Pattern**. This simulator models various duck behaviors (flying and quacking) by encapsulating behaviors into separate interface implementations, allowing a duck's behavior to be dynamically changed at runtime.

*   **`RPG-design`**  
    Another implementation of the **Strategy Pattern** applied to an action-adventure game. The demo features various Characters classes that can dynamically change their attack strategies during Runtime.

*   **`observer-pattern`** An implementation of the **Observer Pattern**. This demo models an employment agency system where an `EmploymentAgency` (the Subject/Observable) maintains a list of registered `JobSeeker`s (the Observers). Whenever a new `JobPost` is published, all interested job seekers are automatically notified, demonstrating a clean one-to-many dependency.

---

## 🛠️ Tech Stack & Tools

*   **Language:** Java
*   **IDE:** IntelliJ IDEA
*   **Version Control:** Git & GitHub

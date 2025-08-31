# Software Design Principles

## 1. Low-Level Design (LLD) Notes

### SOLID Principles:
    1.1 Single Responsibility Principle (SRP)  
        - A class should have a single responsibility — only one reason to change.  
        - Promotes loose coupling between multiple classes.  

    1.2 Open/Closed Principle (OCP)  
        - A class should be open for extension but closed for modification.  
        - Modifying an existing class is more prone to bugs than extending it.  

    1.3 Liskov Substitution Principle (LSP)  
        - If `B` (Base) is extended by `D` (Derived), `B` should be replaceable by `D` without breaking code.  
        - Derived classes should add to the parent's capabilities, not narrow them down.  

    1.4 Interface Segregation Principle (ISP)  
        - Interfaces should not force clients to implement unnecessary methods.  

    1.5 Dependency Inversion Principle (DIP)  
        - High-level modules should not depend on low-level modules; both should depend on abstractions.  
        - Dependencies should be inverted towards an abstraction.  
        - Classes should depend on interfaces, not concrete implementations (avoid tight coupling).  
---

## Design patterns:

    1. Strategy
        - Sharing the same codebase and avoid duplicacy in childs which is not present int the parent. using constructor injection of interface in the parent class.
    2. Observers
        - 
    3. 

## 2. High-Level Design (HLD) Notes
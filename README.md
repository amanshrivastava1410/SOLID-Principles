# SOLID Principles
This repository consists info about the SOLID Principles.

**SOLID:** Acronym for the first five object-oriented design (OOD) principles. These principles establishes practices for developing software with considerations for maintaining and extending it as the project grows. The SOLID principle helps in reducing tight coupling. Tight coupling means a group of classes are highly dependent on one another which we should avoid in our code.

**S:** Single Responsibility Principle

**O:** Open-Closed Principle

**L:** Liskov Substitution Principle

**I:** Interface Segregation Principle

**D:** Dependency Inversion Principle

## Benefits of SOLID Principles

- **Improved Readability**: The code becomes more understandable because it follows common design patterns.
- **Better Extensibility**: By following principles like the Open/Closed Principle, developers can add new functionality without modifying existing code.
- **Reduced Risk of Bugs**: When code is structured well, there's less chance for new changes to introduce bugs.


## All about Principles
1. Single-Responsibility Principle **(SRP)**: A class should have one and only one reason to change. In other words, a class should have only one job or purpose within the software system.
2. Open/Closed Principle **(OCP)**: Objects or entities should be open for extension but closed for modification. In other words, we should be able to extend a class behavior, without modifying it.
3. Liskov Substitution Principle **(LSP)**: Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T. This means that derived or child classes must be substitutable for their base or parent classes.
4. Interface Segregation Principle **(ISP)**: A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use. In ISP, main focus is on avoiding fat interface and give preference to many small client-specific interfaces.
5. Dependency Inversion Principle **(DSP)**: Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
6. Don't Repeat Yourself **(DRY)**: Every piece of knowledge must have a single, unambiguous, authoritative representation in a system.
7. Avoid Premature Optimization **(APO)**: Don’t optimize code before it's necessary. Focus on solving the problem first, then optimize only if needed.
8. Keep It Simple, Stupid **(KISS)**: Simplicity should be a key goal in design, and unnecessary complexity should be avoided.
9. You Aren't Gonna Need It **(YAGNI)**: Only implement features that are necessary for the current functionality, avoiding speculative design or unnecessary features.
10. Tell, Don't Ask **(TDA)**: Instead of querying an object for data and making decisions externally, ask the object to perform an action, thus encapsulating behavior.
11. Law of Demeter **(LoD)**: A principle that states an object should only communicate with its immediate friends, not with objects that are indirectly related.
12. Composition Over Inheritance **(CoI)**: Prefer using composition (has-a relationship) over inheritance (is-a relationship) to build more flexible and modular systems.

**SRP, OCP, ISP, LSP, DIP** focuses on modular and extensible design.

**DRY, KISS, YAGNI, APO** emphasizes maintainability and simplicity.

**TDA, LoD, CoI** ensures clean and flexible interactions between classes.

## Use Cases

1. **Single-Responsibility Principle** Use Cases: 

**When to Use:**
When a class or module has multiple, distinct reasons to change.
Example: If a class is handling both data storage and data processing, split these responsibilities.
Building software with long-term maintainability in mind.

**When Not to Use:**
For small, one-off scripts or prototypes where simplicity outweighs separation of concerns.
When the added complexity of dividing responsibilities doesn't justify the benefits.

2. **Open/Closed Principle** Use Cases: 

**When to Use:**
When you anticipate adding new functionality over time, such as new types, operations, or behaviors.
Example: Adding a new shape to a geometry processing system without modifying existing code.
When the cost of modifying existing, well-tested code is high.

**When Not to Use:**
For short-lived projects or scenarios where extensibility is unnecessary.
Over-applying this principle can lead to excessive abstraction and complexity.

3. **Liskov Substitution Principle** Use Cases: 

**When to Use:**
When creating hierarchies where derived classes must fully honor the behavior of their base classes.
Example: A Rectangle class and its Square subclass must have consistent behavior.
Ensuring reusable components without unexpected behavior.

**When Not to Use:**
If inheritance is not needed at all, and composition or interfaces could serve better.
Overcomplicating hierarchies just to satisfy LSP when simpler solutions are available.

4. **Interface Segregation Principle** Use Cases:

**When to Use:**
When you have multiple clients with distinct needs for methods in an interface.
Example: Robots and human workers may require different interfaces for work and rest.
To avoid forcing classes to implement unnecessary functionality.

**When Not to Use:**
For simple applications where a single interface suffices.
If splitting the interface results in unnecessary fragmentation for low-complexity use cases.

5. **Dependency Inversion Principle** Use Cases:
   
**When to Use:**
When the high-level module's behavior depends on low-level details that may change.
Example: Payment systems where different payment methods (e.g., credit card, PayPal) may be added or removed.
When you need flexibility and decoupling between layers of your application.

**When Not to Use:**
In simple, static applications where dependencies are unlikely to change.
Overuse can lead to unnecessary abstraction and boilerplate code.

6. **Don’t Repeat Yourself** Use Cases:
   
**When to Use:**
When similar logic or data is duplicated across your application.
Example: Validating user input in multiple places should be abstracted into a common utility function.
To make code easier to maintain and test.

**When Not to Use:**
When the duplication is minor and trying to abstract it leads to overly generic, hard-to-read code.
Prematurely applying DRY in cases where patterns are not yet stable or reusable.

7. **Avoid Premature Optimization (APO)** Use Cases:

**When to Use:**
When writing code for features that aren't confirmed to need optimization.
Focus first on correctness, readability, and maintainability.
Example: Avoid micro-optimizing loops unless profiling indicates it's a bottleneck.

**When Not to Use:**
For performance-critical sections where the cost of later optimizations would be too high.
When you know a specific feature or system will require optimization (e.g., real-time systems).

8. **Keep It Simple, Stupid** Use Cases:
   
**When to Use:**
In all aspects of software development to ensure clarity and maintainability.
Example: Writing straightforward code instead of complex solutions for simple problems.

**When Not to Use:**
When simplicity sacrifices necessary functionality or flexibility.
In scenarios requiring advanced, optimized, or complex algorithms for high-performance applications.

9. **You Aren’t Gonna Need It** Use Cases:
    
**When to Use:**
During early development to avoid adding features "just in case."
Example: Don’t implement a feature for exporting reports if it's not in the initial requirements.

**When Not to Use:**
When designing a system that explicitly requires future extensibility (e.g., plug-in architectures).
In cases where adding features later would require substantial rework.

10. **Tell, Don’t Ask** Use Cases:
    
**When to Use:**
When designing classes that encapsulate behavior rather than exposing raw data.
Example: Instead of asking an object for its state and making decisions, delegate decisions to the object.
To promote encapsulation and reduce coupling.

**When Not to Use:**
When the object doesn’t have enough context or authority to make decisions.
In simple data-transfer objects (DTOs) or value objects where exposing state is appropriate.

11. **Law of Demeter** Use Cases:
    
**When to Use:**
To reduce coupling between modules and ensure that objects communicate only with immediate collaborators.
Example: A Car object should interact with its Engine directly but not with the internal components of the Engine.
In large, complex applications where minimizing dependencies improves maintainability.

**When Not to Use:**
In simple or prototype applications where strict adherence adds complexity without value.
Over-enforcing LoD can lead to overly verbose and indirect code.

12. **Composition Over Inheritance** Use Cases:
    
**When to Use:**
When objects share behavior but not necessarily a common ancestry.
Example: A Bird can Fly or Swim, and you can use composition for those behaviors rather than a complex inheritance hierarchy.
To avoid fragile hierarchies and increase flexibility.

**When Not to Use:**
When true is-a relationships exist, and inheritance is more natural.
For simple inheritance hierarchies where the overhead of composition adds unnecessary complexity.


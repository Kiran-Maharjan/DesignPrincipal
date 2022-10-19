# DesignPrincipal

S: Sinle Responsibility Principle (SRP)
O:Open & Close Principle (OCP)
L: Leskov's Subsitude Principle (LSP)
I: Interface Segregation Principle (ISP)
D: Depenency Inversion Principle(DIP)


Sinle Responsibility Principle:
The single responsibility principle states that every java class must perform
a single functionality. Implementation of multiple functionalities
in a single class mashup the code.

The Open close principle states that according to new requirements
the module should be open for extension but closed for modification.

Liskov Substitution Principle
It applies to inheritance in such a way that the derived classes must
be completely substitutable for their base classes. In other words,
if class A is a subtype of class B, then we should be able to replace B
with A without interrupting the behaviour of the program.

Inferface Segregation Principle
The principle states that the larger interfaces split into smaller ones.
Because the implementation classes use only the methods that are required. We
should not force the client to use the methods that they do not want to use.
The gola of the interface segregation principle is similar to the single responsibility principle.

Dependency Inversion Principle
The principle states that we must use abstraction (abstract classes and interfaces)
instead of concrete implementations. High-level modules
should not depend on the low-level module but both should depend on the
abstraction.

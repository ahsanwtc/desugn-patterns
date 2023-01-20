# Design Patterns
A simple project to learn about design patterns in software engineering.

## Momento Pattern


## State Pattern
![State Pattern](./images/state-pattern.svg)

## Iterator Pattern
![Iterator Pattern](./images/iterator-pattern.svg)

## Strategy Pattern
![Strategy Pattern](./images/strategy-pattern.svg)

## Template Method Pattern
![Template Method Pattern](./images/template-method-pattern.svg)

## Command Pattern
![Command Pattern](./images/command-pattern.svg)

### Undo Command 
![Undo Command Pattern](./images/undo-command-pattern.svg)

## Observer Pattern
![Observer Pattern](./images/observer-pattern.svg)

## Mediator Pattern
![Mediator Pattern](./images/mediator-pattern.svg)

## Chain of Responsibility Pattern
![Chain of Responsibility Pattern](./images/chain-of-responsibility-pattern.svg)

## Visitor Pattern
![Visitor Pattern](./images/visitor-pattern.svg)

## Composite Pattern

The Composite Design Pattern achieves two goals. To compose nested structures of objects, and to deal with the classes 
for these objects uniformly. The pattern follows this basic design.

![Composite Pattern](./images/composite-pattern.svg)

The composite design pattern is used to address:
- How do we use individual types of objects to build a tree-like structure? and
- How can we treat the individual types of objects uniformly without checking their types?

![Composite Pattern](./images/composite-pattern-example.svg)

the composite design pattern is used to solve the issues of how to build a tree-like structure of objects, and how to 
treat the individual types of those objects uniformly. This is achieved by enforcing polymorphism across each class 
through implementing an interface or inheriting from a superclass. And using a technique called recursive composition, 
which allows objects to be composed of other objects that are of a common type.

## Adapter Pattern

An Adapter design pattern is meant to:
- Wrap the adaptee and expose a target interface to the client.
- Indirectly change the adaptee`s interface into one that the client is expecting by implementing a target interface.
- Indirectly translate the client`s request into one that the adaptee is expecting.
- Reuse an existing adaptee with an incompatible interface.

![Adapter Pattern](./images/adapter-pattern.svg)


## Decorator Pattern
![Decorator Pattern](./images/decorator-pattern.svg)

## Facade Pattern

A facade simply acts as a point of entry into your subsystem.

A facade design pattern: 
- Is a means to hide the complexity of a subsystem by encapsulating it behind a unifying wrapper called a facade class.
- Removes the need for client classes to manage a subsystem on their own, resulting in less coupling between the
  subsystem and the client classes.
- Handles instantiation and redirection of tasks to the appropriate class within the subsystem.
- Provides client classes with a simplified interface for the subsystem.
- Acts simply as a point of entry to a subsystem and does not add more functionality to the subsystem.

![Facade Pattern](./images/facade-pattern.svg)

## Flyweight Pattern
![Flyweight Pattern](./images/flyweight-pattern.svg)

## Bridge Pattern
![Bridge Pattern](./images/bridge-pattern.svg)

## Proxy Pattern

The proxy design pattern provides your system with a powerful means of indirection. Proxy classes are robust and can 
let you build systems that are more secure and less resource-intensive.

The main features of the proxy design pattern are:

- to use the proxy class to wrap the real subject class,
- to have a polymorphic design so that the client class can expect the same interface for the proxy and real subject
  classes,
- to use a lightweight proxy in place of a resource intensive object until it is actually needed,
- to implement some form of intelligent verification of requests from client code in order to determine if, how,
  and to whom the requests should be forwarded to,
- and to present a local representation of a system that is not in the same physical or virtual space.

![Proxy Pattern](./images/proxy-pattern.svg)

## Prototype Pattern
![Prototype Pattern](./images/prototype-pattern.svg)

## Singleton Pattern
- Enforces one and only one object of a Singleton class.
- Has the Singleton object globally accessible.

## Factory Pattern
If there are multiple clients that want to instantiate the same set of classes, then by using a Factory object, you 
have cut out redundant code and made the software easier to modify.

The Factory Method design intent is to define an interface for creating objects, but let the subclasses decide which
class to instantiate.

![Factory Pattern](./images/factory-pattern.svg)

## Abstract Factory Pattern
Provides an interface for creating families of related objects.
![Abstract Factory Pattern](./images/abstract-factory-pattern.svg)

## Builder Pattern
To separate the construction of object from its representation.
![Builder Pattern](./images/builder-pattern.svg)

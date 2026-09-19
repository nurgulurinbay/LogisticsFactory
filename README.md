# Factory Method and Abstract Factory

## Project Description

This project demonstrates two creational design patterns implemented in Java:

- Factory Method
- Abstract Factory

The application is a console-based program that allows the user to select and demonstrate either pattern.

## Factory Method

The Factory Method pattern is demonstrated through a logistics transport system.

The system supports:

- Truck
- Ship

`Transport` is the common product interface.
`TruckFactory` and `ShipFactory` are concrete creators responsible for creating the corresponding transport objects.

## Abstract Factory

The Abstract Factory pattern is demonstrated through a cross-platform GUI system.

The system supports two GUI families:

- Windows
- Linux

Each family provides:

- Button
- Checkbox

`GUIFactory` defines the creation methods, while `WindowsFactory` and `LinuxFactory` create their corresponding families of components.

# Technologies
Java
Maven
IntelliJ IDEA
PlantUML
Git & GitHub

# How to Run
Clone the repository.
Open the project in IntelliJ IDEA.
Make sure Maven dependencies are loaded.
Run Main.java.
Select the desired design pattern from the console menu.

## Design Patterns
# Factory Method

Used when the application needs to create one type of product while allowing subclasses to determine the concrete product.

# Abstract Factory

Used when the application needs to create families of related objects without depending directly on their concrete implementations.

## Author

`Nurgul Urinbay`
# Bubble Tea Ordering System

## Project Description

This project demonstrates the Facade design pattern using a simple Bubble Tea Ordering System written in Java.

The system allows a customer to place an order without calling each subsystem separately. The `BubbleTeaFacade` coordinates the ordering process.

## Subsystems

The project contains four subsystem classes:

- **InventorySystem** — checks if the selected drink and topping are available.
- **PaymentSystem** — checks the price and simulates payment.
- **TeaPreparation** — validates the drink size and sugar level and simulates drink preparation.
- **PackingSystem** — simulates packing the finished drink.

## Facade Pattern

The `BubbleTeaFacade` provides a simple method called `orderBubbleTea()`. It coordinates the subsystems in the correct order:

1. Check ingredients.
2. Validate the order.
3. Process payment.
4. Prepare the drink.
5. Pack the order.

If the ingredients are unavailable, the order is invalid, or the payment fails, the process stops.

The `Main` class uses only the facade instead of calling the subsystem classes directly.

## Clean Code Principles

**1. Single Responsibility Principle**

Each subsystem class has one main responsibility. For example, `PaymentSystem` handles payment, while `PackingSystem` handles packaging.

**2. Meaningful Names**

Class names and method names describe their purpose. For example, `checkIngredients()` checks the ingredients, and `orderBubbleTea()` starts the ordering process.

**3. Encapsulation**

The subsystem references inside `BubbleTeaFacade` are declared `private`. This prevents other classes from accessing these fields directly.

**4. Separation of Concerns**

Inventory checking, payment, preparation, and packaging are implemented in separate classes. This keeps the code organized and easier to understand.

**5. Error Handling**

The facade checks the results of ingredient validation, order validation, and payment. If a step fails, the order is cancelled before the next step begins.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure a Java JDK is configured.
3. Open `src/Main.java`.
4. Run the `main()` method.

The program prints the ordering process to the console.

## Technologies

- Java
- IntelliJ IDEA
- Facade Design Pattern
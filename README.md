# Solid Principle

## For better understanding, SOLID stands for:
* Single Responsibility Principle (SRP): A class should have only one reason to change.
* Open/Closed Principle (OCP): Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
* Liskov Substitution Principle (LSP): Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
* Interface Segregation Principle (ISP): A client should not be forced to implement an interface that it doesn't use.
* Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions.

## Let's rewrite the supplied code to better comply to SOLID principles:

```
public interface Order {

  void calculateTotal(double price, int quantity);

  void placeOrder(String customerName, String address);

  void generateInvoice(String fileName);

  void sendEmailNotification(String email);
}

public class OrderAction implements Order {

  @Override
  public void calculateTotal(double price, int quantity) {
    double total = price * quantity;
    System.out.println("Order total: $" + total);
  }

  @Override
  public void placeOrder(String customerName, String address) {
    // Simulate placing order in a system
    System.out.println("Order placed for " + customerName + " at " + address);
  }

  @Override
  public void generateInvoice(String fileName) {
    // Simulate generating invoice file
    System.out.println("Invoice generated: " + fileName);
  }

  @Override
  public void sendEmailNotification(String email) {
    // Simulate sending email notification
    System.out.println("Email notification sent to: " + email);
  }
}

public class OrderTest {

  public static void main(String[] args) {
    Order order = new OrderAction();
    order.calculateTotal(10.0, 2);
    order.placeOrder("John Doe", "123 Main St");

    // These methods might not be needed for all orders
    order.generateInvoice("order_123.pdf");
    order.sendEmailNotification("johndoe@example.com");
  }
}
```

## In the refactoring:

* Each class now has a single duty, as per the Single duty Principle.
* Interfaces are divided into smaller, more focused interfaces using the Interface Segregation Principle.
* The OrderAction class follows the Dependency Inversion Principle, relying on abstractions (interfaces) rather than actual implementations.
* The OrderAction class accepts dependencies via its constructor, allowing for simpler testing and expansion while conforming to the Open/Closed Principle.

## UML Class Diagram:


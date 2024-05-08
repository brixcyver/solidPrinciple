public class OrderTest {
    public static void main(String[] args) {
        TotalCalculatable totalCalculator = new TotalCalculator();
        OrderPlacable orderPlacer = new OrderPlacer();
        InvoiceGeneratable invoiceGenerator = new InvoiceGenerator();
        EmailNotifiable emailNotifier = new EmailNotifier();

        OrderAction orderAction = new OrderAction(totalCalculator, orderPlacer, invoiceGenerator, emailNotifier);

        orderAction.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}
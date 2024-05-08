public class OrderTest {
    public static void main(String[] args) {
        TotalCalculatable totalCalculator = new TotalCalculator();
        OrderPlaceable orderPlacer = new OrderPlacer();
        InvoiceGeneratable invoiceGenerator = new InvoiceGenerator();
        EmailNotifiable emailNotifier = new EmailNotifier();

        OrderAction orderAction = new OrderAction(totalCalculator, orderPlacer, invoiceGenerator, emailNotifier);

        orderAction.processOrder(10.0, 2, "Brix Cyver", "Taytay, Rizal", "order#612.pdf", "brixcyver@gmail.com");
    }
}
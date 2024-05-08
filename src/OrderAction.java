public class OrderAction {
    private final TotalCalculatable totalCalculator;
    private final OrderPlaceable orderPlacer;
    private final InvoiceGeneratable invoiceGenerator;
    private final EmailNotifiable emailNotifier;

    public OrderAction(TotalCalculatable totalCalculator, OrderPlaceable orderPlacer,
                       InvoiceGeneratable invoiceGenerator, EmailNotifiable emailNotifier) {
        this.totalCalculator = totalCalculator;
        this.orderPlacer = orderPlacer;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(double price, int quantity, String customerName, String address, String fileName, String email) {
        double total = totalCalculator.calculateTotal(price, quantity);
        orderPlacer.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        emailNotifier.sendEmailNotification(email);
    }
}

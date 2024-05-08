public class InvoiceGenerator implements InvoiceGeneratable {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}

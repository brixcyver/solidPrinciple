public class TotalCalculator implements TotalCalculatable {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}

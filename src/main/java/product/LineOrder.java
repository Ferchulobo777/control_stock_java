package product;

public class LineOrder {
    private Product product;
    private int quantity;

    public LineOrder(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    public double calculateTotal() {
        return product.getPrice() * quantity;
    }
}

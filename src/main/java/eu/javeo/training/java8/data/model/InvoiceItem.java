package eu.javeo.training.java8.data.model;

public class InvoiceItem {
    private final Product product;
    private final int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return product + " (" + quantity + ")";
    }
}

package product;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int counter = 0;
    private int id;
    private List<LineOrder> products;


    public Order() {
        this.id = ++counter;
        this.products = new ArrayList<>();
    }

    public void addProduct(LineOrder lineOrder) {
      products.add(lineOrder);
    }

    public double calculateTotal(){
        double total = 0;
        for (LineOrder line : products) {
            total += line.calculateTotal();
        }
        return total;
    }

    public void showOrder(){
        System.out.println("Pedido ID: " + id);
        for (LineOrder lineOrder : products) {
            System.out.println(lineOrder.getProduct() + " , Cantidad: " + lineOrder.getQuantity());
        }
        System.out.println("Total: " + calculateTotal());
    }

    public int getId() {
        return id;
    }
}

package product;


public class Product {
    private static int counter = 0;
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.id = ++counter;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(){

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Nombre: " + name + ", Precio: " + price + ", Stock: " + stock;
    }
}

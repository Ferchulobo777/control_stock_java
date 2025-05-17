package app;
import product.LineOrder;
import product.Product;
import product.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static List<Product> products = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String arg[]) {
        int option;
        do {
            showMenu();
            option = Integer.parseInt(keyboard.nextLine());


            switch (option) {
                case 1: addProduct(); break;
                case 2: listProducts(); break;
                case 3: searcUpdateProduct(); break;
                case 4: deleteProduct(); break;
                case 5: createOrder(); break;
                case 6: listOrders(); break;
                case 7: System.out.println("Saliendo...."); break;
                default:System.out.println("Opción no valida");
            }
        } while (option != 7);
    }


    private static void showMenu(){
        System.out.println("\n----------MENU----------");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar/Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Crear pedido");
        System.out.println("6. Listar pedidos");
        System.out.println("7. Salir");
        System.out.println("---------------------------");
        System.out.println("Elije una opción: ");
    }
    private static void addProduct(){
        System.out.println("Nombre del producto: ");
        String name = keyboard.nextLine();
        System.out.println("Precio del Producto: ");
        double price = Double.parseDouble(keyboard.nextLine());
        System.out.println("Cantidad en Stock: ");
        int stock = Integer.parseInt(keyboard.nextLine());

        Product product = new Product(name, price, stock);
        products.add(product);
        System.out.println("Producto agregado.");
    }

    private static void listProducts(){
        if (products.isEmpty()) {
            System.out.println("No hay productos agregados.");
            return;
        }
        System.out.println("\nProductos:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void searcUpdateProduct() {
        System.out.println("Ingresa el ID o nombre del producto a buscar:");
        String input = keyboard.nextLine();
        Product product = null;

        try {
            int id = Integer.parseInt(input);
            product = searchProductForId(id);
        } catch (NumberFormatException e) {
            product = searchProductForName(input);
        }

        if (product != null) {
            System.out.println("Producto encontrado: " + product);
            System.out.println("¿Deseas actualizar el precio? (si/no): ");
            if (keyboard.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Nuevo precio: ");
                double price = Double.parseDouble(keyboard.nextLine());
                product.setPrice(price);
            }
            System.out.println("¿Deseas actualizar el stock? (si/no): ");
            if (keyboard.nextLine().equalsIgnoreCase("si")) {
                System.out.println("Nuevo Stock: ");
                int stock = Integer.parseInt(keyboard.nextLine());
                product.setStock(stock);
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    private static void deleteProduct(){
        System.out.println("Ingrese el ID del producto a eliminar: ");
        int id = Integer.parseInt(keyboard.nextLine());

        Product product = searchProductForId(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Producto eliminado");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Product searchProductForName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    private static Product searchProductForId(int id) {
      for (Product product : products) {
          if (product.getId() == id) {
              return product;
          }
      }
      return null;
    }


    private static void createOrder(){
        Order order = new Order();
        System.out.println("Crear nuevo pedido");

        while (true) {
            listProducts();
            System.out.println("Introduce el ID del producto que deseas agregar al pedido o (0) para terminar: \n");
            int id = Integer.parseInt(keyboard.nextLine());

            if (id == 0 ) break;

            Product product = searchProductForId(id);
            if (product != null) {
                System.out.println("Cantidad: ");
                int quantity = Integer.parseInt(keyboard.nextLine());



                if (quantity <= product.getStock()) {
                    LineOrder line = new LineOrder(product, quantity);
                    order.addProduct(line);
                    product.setStock(product.getStock() - quantity);
                    System.out.println("Producto agregado al pedido");
                } else {
                    System.out.println("No hay suficiente Stock");
                }
            } else {
                System.out.println("Producto no encontrado");
            }
        }
        orders.add(order);
        System.out.println("Pedido creado.");
    }


    private static void listOrders() {
        if (orders.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        System.out.println("\nPedidos: ");
        for (Order order : orders) {
            order.showOrder();
        }
    }
}

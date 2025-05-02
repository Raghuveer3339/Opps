public class ProductDemo {
    private String productId;
    private String productName;
    private String category;
    private double price;

    private static int totalProducts = 0;

    public ProductDemo() {
        this.productId = "P000";
        this.productName = "Unknown Product";
        this.category = "Miscellaneous";
        this.price = 0.0;
        totalProducts++;
    }

    public ProductDemo(String productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }

    public double getPrice() {
        return price;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("--------------------------");
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    public double calculateStockValue(int quantity, double discountRate) {
        double discountedPrice = price * (1 - discountRate / 100);
        return discountedPrice * quantity;
    }

    public static void main(String[] args) {
        ProductDemo product1 = new ProductDemo();
        ProductDemo product2 = new ProductDemo("P101", "Laptop", "Electronics", 1500.0);
        ProductDemo product3 = new ProductDemo("P102", "Smartphone", "Electronics", 800.0);

        ProductDemo.displayTotalProducts();

        product1.displayProductInfo();
        System.out.println("Stock Value (10 units): $" + product1.calculateStockValue(10));

        product2.displayProductInfo();
        System.out.println("Stock Value (5 units): $" + product2.calculateStockValue(5));
        System.out.println("Stock Value (5 units with 10% discount): $" + product2.calculateStockValue(5, 10));

        product3.displayProductInfo();
        System.out.println("Stock Value (8 units): $" + product3.calculateStockValue(8));
        System.out.println("Stock Value (8 units with 15% discount): $" + product3.calculateStockValue(8, 15));
    }
}

import java.util.Scanner;

public class View {

    private final Controller controller = new Controller();
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        while (true) {

            // First object
            System.out.println("Welcome to the Westeros!");
            System.out.println("1. Add Product");
            System.out.println("2. Show All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");

            // Second object
            System.out.println("5. Add");
            System.out.println("6. Show All");
            System.out.println("7. Update");
            System.out.println("8. Delete");

            // Helper „Buy” method
            System.out.println("9. Buy");

            // First filter
            System.out.println("10. Filter X by Y");

            // Second filter
            System.out.println("11. Filter Y by Z");

            // Sort
            System.out.println("12. Sort X in ascending/descending order");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> showAllProducts();
                case 3 -> updateProduct();
                case 4 -> deleteProduct();
            }
        }
    }

    // CRUD Film
    private void addProduct() {
        System.out.println("Enter the product ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the product name");
        String name = scanner.nextLine();
        System.out.println("Enter the product price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the product region");
        String region = scanner.nextLine();

        controller.addProduct(new Product(id, name, price, region));
    }

    private void showAllProducts() {
        controller.getProductList().forEach(System.out::println);
    }

    private void updateProduct() {
        showAllProducts();
        System.out.println("Enter the product ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the product name");
        String name = scanner.nextLine();
        System.out.println("Enter the product price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the product region");
        String region = scanner.nextLine();
        controller.updateProduct(id, name, price, region);
    }

    private void deleteProduct() {
        System.out.println("Enter the product ID");
        int id = scanner.nextInt();
        controller.deleteProduct(id);
    }

}
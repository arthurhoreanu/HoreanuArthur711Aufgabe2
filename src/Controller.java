import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Controller {

    private List<Product> productList = new ArrayList<>();
    private List<Character> characterList= new ArrayList<>();

    // CRUD Film
    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void updateProduct(int id, String newName, double newPrice, String newRegion) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setRegion(newRegion);
            }
        }
    }

    public void deleteProduct(int id) {
        productList.removeIf(product -> product.getId() == id);
    }

}

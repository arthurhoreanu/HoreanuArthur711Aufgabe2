import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<Product> productList = new ArrayList<>();
    private List<Character> characterList= new ArrayList<>();

    // CRUD Product
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

    // CRUD Character
    public void addCharacter(Character character) {
        characterList.add(character);
    }

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void updateCharacter(int id, String newName, String newRegion) {
        for (Character character : characterList) {
            if (character.getId() == id) {
                character.setName(newName);
                character.setRegion(newRegion);
            }
        }
    }

    public void deleteCharacter(int id) {
        characterList.removeIf(character -> character.getId() == id);
    }

    // Helper method: buy
    public void buyProducts(int characterID, int productID) {
        for (Character character : characterList) {
            if (character.getId() == characterID) {
                for (Product product : productList) {
                    if (product.getId() == productID) {
                        character.getProducts().add(product);
                    }
                }
            }
        }
    }

    // Filter: characters by region
    public List<Character> filterCharactersByRegion(String region) {
        List<Character> filteredList = new ArrayList<>();
        for (Character character : characterList) {
            if (character.getRegion().equals(region)) {
                filteredList.add(character);
            }
        }
        return filteredList;
    }

}


package owusuemmanuelproject1;

/**
 *
 * @author Emmanuel
 */

/**
 * Represents information about a product.
 */
public class Product {
    private int productId;
    private String title;
    private int type; // Using integer constants
    private double price;
    private int quantityInInventory;

    // Constants for product types
    public static int BOOK = 1;
    public static int CD = 2;
    public static int DVD = 3;
    
    /**
     * Constructs a new Product with the specified details.
     *
     * @param productId          The unique identifier for the product.
     * @param title              The title of the product.
     * @param type               The type of the product (use constants BOOK, CD, or DVD).
     * @param price              The price of the product.
     * @param quantityInInventory The quantity of the product in the inventory.
     */
    public Product(int productId, String title, int type, double price, int quantityInInventory) {
        this.productId = productId;
        this.title = title;
        this.type = type;
        this.price = price;
        this.quantityInInventory = quantityInInventory;
    }

    // Getters and setters
    public int getProductId() {
        return productId;
    }
    
    /**
     * Sets the unique identifier for the product.
     *
     * @param productId The unique identifier for the product.
     */
    public void setProductId(int productId) {
        this.productId = productId; // Set the productId field
    }

    /**
     * Retrieves the title of the product.
     *
     * @return The title of the product.
     */
    public String getTitle() {
        return title;
    }
    

    /**
     * Retrieves the type of the product.
     *
     * @return The type of the product (BOOK, CD, or DVD).
     */
    public int getType() {
        return type;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return The price of the product.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Retrieves the quantity of the product in the inventory.
     *
     * @return The quantity of the product in the inventory.
     */
    public int getQuantityInInventory() {
        return quantityInInventory;
    }
    
    /**
    * Sets the quantity of the product in the inventory.
    *
    * @param quantityInInventory The new quantity of the product in the inventory.
    */
    public void setQuantityInInventory(int quantityInInventory) {
        this.quantityInInventory = quantityInInventory;
    }

}
 
    
    
    


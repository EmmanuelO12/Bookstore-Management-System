
package owusuemmanuelproject1;
import java.util.*;

/**
 *
 * @author Emmanuel
 */

/**
 * Represents information about a purchase made by a member.
 */
public class Purchase {
    private int purchaseId;
    private int memberId;
    private List<Product> purchasedProducts;
    private double totalAmount;
    

    /**
     * Constructs a new Purchase with the specified details.
     *
     * @param purchaseId        The unique identifier for the purchase.
     * @param memberId          The ID of the member making the purchase.
     */
    public Purchase(int purchaseId, int memberId) {
        this.purchaseId = purchaseId;
        this.memberId = memberId;
        this.purchasedProducts = new ArrayList<>();
        this.totalAmount = 0.0;
    }
    
    /**
     * Retrieves the unique identifier for the purchase.
     *
     * @return The purchase ID.
     */
    public int getPurchaseId() {
        return purchaseId;
    }
    
    /**
     * Retrieves the ID of the member making the purchase.
     *
     * @return The member ID.
     */
    public int getMemberId() {
        return memberId;
    }
    
    /**
     * Retrieves the list of products purchased in this transaction.
     *
     * @return The list of purchased products.
     */
    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
    
    /**
     * Sets the list of products purchased in this transaction.
     *
     * @param purchasedProducts The list of purchased products.
     */
    public void setPurchasedProducts(List<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
    
    /**
     * Retrieves the total amount spent in this purchase.
     *
     * @return The total amount of the purchase.
     */
    public double getTotalAmount() {
        return totalAmount;
    }
    
    /**
     * Sets the total amount spent in this purchase.
     *
     * @param totalAmount The total amount of the purchase.
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
} 
    
    



package owusuemmanuelproject1;
import java.util.*;

/**
 *
 * @author Emmanuel
 */
    // Fields for storing members, inventory, completed purchases, and ID counters
public class Bookstore {
    private List<Member> members;
    private List<Product> inventory;
    private List<Purchase> completedPurchases;
    private int memberIdCounter = 1;
    private int productIdCounter = 1;
    private int purchaseIdCounter = 1;
    /**
     * Constructs a new Bookstore with initial members, inventory, and purchase ID counters.
     * Prepopulates the inventory with some initial products and members.
     */
    public Bookstore() {
        this.members = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.completedPurchases = new ArrayList<>();
        
          // Prepopulate the inventory with some initial products
        Product product1 = new Product(productIdCounter++, "Book 1", Product.BOOK, 19.99, 10);
        Product product2 = new Product(productIdCounter++, "CD 1", Product.CD, 9.99, 5);
        Product product3 = new Product(productIdCounter++, "DVD 1", Product.DVD, 14.99, 8);
        
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        
        // Prepopulate the members list with some initial members
        Member member1 = new Member(memberIdCounter++, "John Doe", Member.REGULAR_MEMBERSHIP, Member.CREDIT_CARD);
        Member member2 = new Member(memberIdCounter++, "Jane Smith", Member.PREMIUM_MEMBERSHIP, Member.PAYPAL);
        
        members.add(member1);
        members.add(member2);
        
    }

    /**
     * Registers a new member in the bookstore.
     *
     * @param member The member to be registered.
     */
    public void registerNewMember(Member member) {
        member.setMemberId(memberIdCounter++);
        members.add(member);
        System.out.println("New member registered successfully with ID: " + member.getMemberId());
    }
    
    /**
     * Retrieves the list of members in the system.
     *
     * @return The list of members.
     */
    
    public List<Member> getMembers() {
    return members;
    }
    
    /**
     * Adds a product to the inventory with a unique product ID.
     *
     * @param product The product to be added to the inventory.
     */
    public void addProductToInventory(Product product) {
        product.setProductId(productIdCounter++);
        inventory.add(product);
        System.out.println("Product added to inventory successfully.");
    }
    
    /**
     * Retrieves the current inventory of products.
     *
     * @return The list of products in the inventory.
     */
    public List<Product> getInventory() {
    return inventory;
    }

    /**
     * Makes a purchase for a member, deducting quantities from the inventory, updating member spending,
     * and recording the purchase details.
     *
     * @param memberId    The ID of the member making the purchase.
     * @param productIds  The list of product IDs to be purchased.
     */
    public void makePurchase(int memberId, List<Integer> productIds) {
        Member member = getMemberById(memberId);
        if (member == null) {
            System.out.println("Member not found. Please enter a valid member ID.");
            return;
        }
        
        List<Product> purchasedProducts = new ArrayList<>();
        double totalAmount = 0.0;

        for (int productId : productIds) {
            Product product = getProductById(productId);
            if (product != null) {
                if (product.getQuantityInInventory() > 0) {
                    purchasedProducts.add(product);
                    totalAmount += product.getPrice();
                    product.setQuantityInInventory(product.getQuantityInInventory() - 1);
                } else {
                    System.out.println("Product out of stock: " + product.getTitle());
                }
            }
        }

        if (!purchasedProducts.isEmpty()) {
    Purchase purchase = new Purchase(purchaseIdCounter++, memberId);
    purchase.setPurchasedProducts(purchasedProducts);
    purchase.setTotalAmount(totalAmount);
    completedPurchases.add(purchase);
    member.setTotalSpending(member.getTotalSpending() + totalAmount);
    System.out.println("Purchase completed successfully.");
} else {
    System.out.println("No valid products selected for purchase.");
}
    
    
    }
    // Method to track member spending
    public void trackMemberSpending(int memberId) {
        Member member = getMemberById(memberId);
        if (member != null) {
            System.out.println("Member ID: " + member.getMemberId());
            System.out.println("Member Name: " + member.getName());
            System.out.println("Total Spending: $" + member.getTotalSpending());
        } else {
            System.out.println("Member not found. Please enter a valid member ID.");
        }
    }


// Method to get a Member object by memberId
    public Member getMemberById(int memberId) {
        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null; // Member not found
    }

    // Method to get a Product object by productId
    public Product getProductById(int productId) {
        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }
    
    /**
     * Displays the current inventory of products in the bookstore.
     */
  public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Product product : inventory) {
            System.out.println("Product ID: " + product.getProductId() +
                    ", Title: " + product.getTitle() +
                    ", Quantity: " + product.getQuantityInInventory());
        }
    }  
    
    
    
}

    

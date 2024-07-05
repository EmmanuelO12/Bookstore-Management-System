
package owusuemmanuelproject1;
import java.util.*;

/**
 *
 * @author Emmanuel
 */
public class OwusuEmmanuelProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner to take users inputs
        Scanner scanner = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();
        
        //Options display statements for users selection
        while (true) {
            System.out.println("Bookstore Management System");
            System.out.println("1. Register a new member");
            System.out.println("2. Add a product to inventory");
            System.out.println("3. Make a purchase");
            System.out.println("4. Track member spending");
            System.out.println("5. Display inventory");
            System.out.println("6. Display existing members");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Register a new member
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter membership type (1 for Regular, 2 for Premium): ");
                    int membershipType = scanner.nextInt();
                    System.out.print("Enter payment method (1 for Credit Card, 2 for PayPal, 3 for Cash): ");
                    int paymentMethod = scanner.nextInt();
                    Member newMember = new Member(0, memberName, membershipType, paymentMethod);
                    bookstore.registerNewMember(newMember);
                    break;
                case 2:
                    // Add a product to inventory
                    System.out.print("Enter product title: ");
                    String productTitle = scanner.nextLine();
                    System.out.print("Enter product type (1 for Book, 2 for CD, 3 for DVD): ");
                    int productType = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("How many are you adding: ");
                    int initialQuantity = scanner.nextInt();
                    Product newProduct = new Product(0, productTitle, productType, productPrice, initialQuantity);
                    bookstore.addProductToInventory(newProduct);
                    break;
                case 3:
                    // Make a purchase
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    Member member = bookstore.getMemberById(memberId); // Check if the member exists
                    if (member == null) {
                    System.out.println("Member not found. Please enter a valid member ID.");
                    break;
                    }

                    System.out.print("Enter the number of products to purchase: ");
                    int numProducts = scanner.nextInt();
                    List<Integer> productIds = new ArrayList<>();
                    for (int i = 0; i < numProducts; i++) {
                        System.out.print("Enter product ID for product " + (i + 1) + ": ");
                        int productId = scanner.nextInt();
                        productIds.add(productId);
                        Product product = bookstore.getProductById(productId); // Check if the product exists

                    if (product == null) {
                     System.out.println("Product not found. Please enter a valid product ID.");
                     break; // Exit the loop if an invalid product ID is entered
                        }
                    }
                    bookstore.makePurchase(memberId, productIds);
                    
                      // Display updated inventory
                     System.out.println("Updated Inventory:");
                    for (Product product : bookstore.getInventory()) {
                    System.out.println("Product ID: " + product.getProductId() +
                           ", Title: " + product.getTitle() +
                           ", Quantity: " + product.getQuantityInInventory());
                    }
                    // Ask the user for their next action
                    System.out.println("What would you like to do next?");
                    break;
                case 4:
                    // Track member spending
                    System.out.print("Enter member ID: ");
                    int memberToTrack = scanner.nextInt();
                    bookstore.trackMemberSpending(memberToTrack);
                    break;
                    case 5:
                     // Display inventory
                     System.out.println("Current Inventory:");
                    int productNumber = 1;
                    for (Product product : bookstore.getInventory()) {
                    System.out.println("Product Number: " + productNumber);
                    System.out.println("Product ID: " + product.getProductId() +
                       ", Title: " + product.getTitle() +
                       ", Quantity: " + product.getQuantityInInventory());
                    productNumber++;
                    bookstore.displayInventory();
                    }
                    break;
                case 6:
                    // Display existing members
                    System.out.println("Existing Members:");
                    List<Member> existingMembers = bookstore.getMembers();
                    for (Member existingmember : existingMembers) {
                    System.out.println("Member ID: " + existingmember.getMemberId() +
                    ", Name: " + existingmember.getName() +
                    ", Membership Type: " + (existingmember.getMembershipType() == Member.REGULAR_MEMBERSHIP ? "Regular" : "Premium"));    
                    }
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
} 
        
    
    


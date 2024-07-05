
package owusuemmanuelproject1;
import java.util.List;

/**
 *
 * @author Emmanuel
 */

/**
 * Represents information about a member.
 */

public class Member {
    private int memberId;
    private String name;
    private int membershipType; // Using integer constants
    private int paymentMethod;  // Using integer constants
    private boolean monthlyFeePaid;
    private double totalSpending;

    /**
     * Constant representing a regular membership type.
     * Members with this type have standard privileges.
     */
    public static final int REGULAR_MEMBERSHIP = 1;
    /**
     * Constant representing a premium membership type.
     * Members with this type may have additional privileges or benefits.
     */
    public static final int PREMIUM_MEMBERSHIP = 2;

    /**
    * Constant representing a credit card payment method.
    * Payments made using credit cards are processed through this method.
    */
    public static final int CREDIT_CARD = 1;
    /**
    * Constant representing a PayPal payment method.
    * Payments made using PayPal are processed through this method.
    */
    public static final int PAYPAL = 2;
    /**
    * Constant representing a cash payment method.
    * Payments made in cash are processed through this method.
    */
    public static final int CASH = 3;

    /**
     * Constructs a new Member with the specified details.
     *
     * @param memberId       The unique identifier for the member.
     * @param name           The name of the member.
     * @param membershipType The type of membership (use constants REGULAR_MEMBERSHIP or PREMIUM_MEMBERSHIP).
     * @param paymentMethod  The payment method used by the member (use constants CREDIT_CARD, PAYPAL, or CASH).
     */
    
    public Member(int memberId, String name, int membershipType, int paymentMethod) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.paymentMethod = paymentMethod;
        this.monthlyFeePaid = false;
        this.totalSpending = 0.0;
    }

    /**
    * Gets the member's ID.
    *
    * @return The member's ID.
    */
    public int getMemberId() {
        return memberId;
    }
    /**
    * Gets the member's name.
    *
    * @return The member's name.
    */
    public String getName() {
        return name;
    }
    /**
    * Retrieves the type of membership.
    *
    * @return The membership type.
    */
    public int getMembershipType() {
        return membershipType;
    }
    /**
    * Retrieves the payment method used by the member.
    *
    * @return The payment method.
    */ 
    public int getPaymentMethod() {
        return paymentMethod;
    }
    
    /**
     * Checks if the monthly fee is paid by the member.
     *
     * @return {@code true} if the monthly fee is paid, {@code false} otherwise.
     */
    public boolean isMonthlyFeePaid() {
        return monthlyFeePaid;
    }

    /**
     * Retrieves the total spending of the member.
     *
     * @return The total spending of the member.
     */
    public double getTotalSpending() {
        return totalSpending;
    }

    /**
     * Sets the status of the monthly fee payment.
     *
     * @param monthlyFeePaid {@code true} if the monthly fee is paid, {@code false} otherwise.
     */
    public void setMonthlyFeePaid(boolean monthlyFeePaid) {
        this.monthlyFeePaid = monthlyFeePaid;
    }

    /**
     * Sets the total spending of the member.
     *
     * @param totalSpending The total spending of the member.
     */
    public void setTotalSpending(double totalSpending) {
        this.totalSpending = totalSpending;
    }

    /**
     * Sets the member's unique identifier.
     *
     * @param memberId The unique identifier for the member.
     */    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
     
   
    }
    


    
    


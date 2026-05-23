public class MegaSystemManager {
    public void processOrder(OrderRequest request);
    public void notifyUser(String userName, String message);
    public void exportLogs();
    public void loadSettings();
    public double verifyDiscount(UserType type, double bill);
    public int calculateShipping(int distance);
    public void printUser(String name, int age);
    public static void main(String[] args);
    
    void updateOrderQuantityForUrgency(OrderRequest request);
    boolean isValidQuantity(int quantity);
    boolean isValidPrice(double price);
    double calculateTotal(OrderRequest request);
    double applyUserTypeAdjustment(double total);
    void validateOrderBasics(OrderRequest request);
    void writeOrderDataToFile(OrderRequest request, double total);
    void printOrderReport(OrderRequest request, double total);
    void printOrderSummary(OrderRequest request, double total);
}

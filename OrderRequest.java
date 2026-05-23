public class OrderRequest {
    public OrderRequest(String userName, int productId, int quantity, 
                        double price, String address, boolean isUrgent, 
                        String notes, Date orderDate);
    
    public String getUserName();
    public int getProductId();
    public int getQuantity();
    public void setQuantity(int quantity);  
    public double getPrice();
    public String getAddress();
    public boolean isUrgent();
    public String getNotes();
    public Date getOrderDate();
}

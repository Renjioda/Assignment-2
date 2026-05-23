public class FileLogger {
    public void writeToFile(String filename, String content, boolean append);
    public void writeOrderData(OrderRequest request, double total);
    public void exportLogs(List<String> logs);
}

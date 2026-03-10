package quickcart.reading.and.writing.files;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;


public class QuickcartReadingAndWritingFiles {

    // Reads each line from items.txt and stores them in a list
    public static ArrayList<String> readItemsFromFile() {
        ArrayList<String> items = new ArrayList<>();

        try {
            // BufferedReader lets us read the file line by line
            BufferedReader reader = new BufferedReader(new FileReader("src/textfile/items.txt"));
            String line;

            // Read until the end of the file
            while ((line = reader.readLine()) != null) {
                items.add(line);  // Add each item line to the list
            }

            reader.close(); // Always close files after reading
        } catch (IOException e) {
            System.out.println("Error reading items.txt");
        }

        return items;
    }

    // Writes a receipt message to receipt.txt
    public static void writeReceiptToFile(String message) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/textfile/receipt.txt"));

            writer.write(message);  // Write the entire receipt
            writer.close();         // Save and close the file

            System.out.println("Receipt successfully written to receipt.txt");
        } catch (IOException e) {
            System.out.println("Error writing receipt.txt");
        }
    }

    // Extracts the price from a line like "Milk,80"
    public static double parsePrice(String line) {
        String[] parts = line.split(",");    // Split item and price
        return Double.parseDouble(parts[1]); // Convert price to double
    }

    // Applies discount depending on amount purchased
    public static double applyDiscount(double total) {
    
    // Applies a 5% discount if purchase is greater than 500    
        if (total > 500) {
            total = total - (total * 0.05);
    // Applies a 10% discount if purchase is greater than 1000
        } else if (total > 1000) {
            total = total - (total * 0.10);
        }
        
        return total;
    }
    
    public static void main(String[] args) {

        // Load item lines from items.txt
        ArrayList<String> items = readItemsFromFile();
        double total = 0;
        
        // Initialize discount variables
        double discountTotal = 0;
        double discountAmount = 0;
        
        System.out.println("Checkout Summary:");

        // Process each item and add up the prices
        for (String item : items) {
            double price = parsePrice(item); // Get the numeric price
            System.out.println(item);        // Display the item line
            total += price;                  // Update total
            discountTotal = applyDiscount(total);   // Applies discount if purchase amount meets requirements
            discountAmount = total - discountTotal;  // Specifies how much is the discount amount from the total
        }
       
        System.out.println("Total: " + total);

        // Build the receipt text to be written into receipt.txt
        String receipt = "QuickCart Receipt (Thank you for your Purchase!)\n"
                        + "-------------------\n"
                        + "Items Purchased:\n";
                        for (String item : items) {
                            receipt += " " + item + "\n";
                        }
                        receipt += "-------------------\n"
                        + String.format("Subtotal: %.2f\n", total)
                        + String.format("Discounted Amount: %.2f\n", discountAmount)
                        + String.format("Total (After Discount): %.2f\n", discountTotal);

        // Save the receipt to a file
        writeReceiptToFile(receipt);
    }
}

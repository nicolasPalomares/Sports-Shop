package sales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {
	
	private int orderID;
	private List<Product> productsList;
	
	public PurchaseOrder() {
		productsList = new ArrayList<Product>();
	}
	
	public int getOrderID() {
		return this.orderID;
	}
	
	public void setOrderID(int orderID) {
		this.orderID = orderID;
		
		try {
			if(this.orderID < 0) {
				throw new IllegalArgumentException("Order ID can't be a negative number");
			}
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	public void addProduct(Product a) {
		productsList.add(a);
	}
	
	public int getProductsAmount() {
		return productsList.size();
	}
	
	public double totalPrice() {
		double total = 0.0;
		
		for(Product product : productsList) {
			total += product.getPrice();
		}
		return total;
	}
	
	// The following method shows the receipt in console:
	
	public void showOrder() {
		String productsOrder = "";
		
		for(Product product : productsList) {
			productsOrder += product.productData();
		}
		System.out.println("Order ID: " + this.orderID + "\n\nProducts:\n" + 
						    productsOrder + "\nTotal: $" + this.totalPrice());
	}
	
	// The following method is used to convert the receipts in a text file, passing the order ID 
	
	public void generateReceipt(int receipt_index) {
		String productsOrder = "";

		for(Product producto : productsList) {
			productsOrder += producto.productData();
		}
		String receipt = "Order ID: " + this.orderID + "\n\nProducts:\n" + 
				productsOrder + "\nTotal: $" + this.totalPrice();
		
		String directory = "generated_receipts";
		String fileName = "receipt" + receipt_index + ".txt";
		
		File fileDir = new File(directory);
		File file = new File(fileDir, fileName);
		
		try(PrintWriter out = new PrintWriter(file)) {
			out.println(receipt);
			out.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

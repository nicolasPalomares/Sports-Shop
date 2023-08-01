package stock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sales.Product;

public class Stock {
	
	private List<Product> productsInStock;
	
	public Stock() {
		productsInStock = new ArrayList<Product>(); 
			
		productsInStock.add(new Product("Running Sneakers", 700.0, "AT432TFR671"));
		productsInStock.add(new Product("Tennis racket", 250.50, "8RHHO9ANCKQ"));
		productsInStock.add(new Product("Football ball", 300.70, "1BZ6HBITBB3"));
		productsInStock.add(new Product("Winter jacket", 170.0, "6AU5RH3MKMP"));
		productsInStock.add(new Product("Football Shirt", 140.10, "3IO70MVHY5Z"));
		productsInStock.add(new Product("Golf club", 260.0, "WSHR8OH450J"));
		productsInStock.add(new Product("Boxing gloves", 85.40, "AY1G767SIKC"));
		productsInStock.add(new Product("Goalkeeper gloves", 90.40, "HPTIZB5S5E3"));
		productsInStock.add(new Product("Hoodie", 360.56, "LQCEO6EQBE2"));
		productsInStock.add(new Product("Hair band", 32.0, "V82YWI5DW37"));
		productsInStock.add(new Product("Voleyball net", 670.0, "NURZNMA14IZ"));
		productsInStock.add(new Product("Baseball bate", 196.70, "NJHKBVEYKPY"));
		productsInStock.add(new Product("Socks", 40.90, "26HJ172OY4H"));
		productsInStock.add(new Product("Rugby ball", 175.10, "6H2NGIWZJC3"));
		productsInStock.add(new Product("Tennis balls set", 180.10, "WCFBYWFG6II"));
		productsInStock.add(new Product("Golf flag", 70.30, "616PZQH86EV"));
		productsInStock.add(new Product("Winter gloves", 70.40, "277HD4BRKLI"));
		productsInStock.add(new Product("Dive suit", 5300.0, "6NXNWTGDYOJ"));
		productsInStock.add(new Product("Training knife", 160.56, "218B0R7SZ3D"));
		productsInStock.add(new Product("Fencing foil", 300.0, "IUKANIN1GYE"));
	}
	
	public Product getProductInStock(int product_index) {
		return productsInStock.get(product_index);
	}
	
	public void showAllProductsInStock() {
		for(Product product : productsInStock) {
			System.out.println(product.getId() + " " + product.getName() + ": " + product.getPrice());
		}
	}
	
	public void addProductToStock(Product p) {
		productsInStock.add(p);
	}
	
	public void removeProductFromStock(int product_index) {
		productsInStock.remove(product_index);
	}
	
	// Products in stock are ordered by their ID:
	
	public void sortStock() {
		Collections.sort(productsInStock, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return p1.getId().compareTo(p2.getId());
			}
		});
	}
	
	public int stockSize() {
		return productsInStock.size();
	}

}

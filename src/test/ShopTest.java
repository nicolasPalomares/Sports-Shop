package test;

import sales.*;
import stock.Stock;

public class ShopTest {

	public static void main(String[] args) {
		//Creating the product stock:
		
		Stock s = new Stock();
		
		System.out.println("************************************************************************************************");
		System.out.println("CREATING ORDER TEST 1...");
		System.out.println("************************************************************************************************\n");
		PurchaseOrder o1 = new PurchaseOrder();
		o1.setOrderID(1);
		o1.addProduct(s.getProductInStock(2));
		o1.addProduct(s.getProductInStock(9));
		o1.addProduct(s.getProductInStock(0));
		o1.showOrder();
		
		// Generating receipt 1 in a text file:
		
		o1.generateReceipt(1);
		
		System.out.println("\n************************************************************************************************");
		System.out.println("CREATING ORDER TEST 2...");
		System.out.println("************************************************************************************************\n");
		PurchaseOrder o2 = new PurchaseOrder();
		o2.setOrderID(2);
		o2.addProduct(s.getProductInStock(4));
		o2.addProduct(s.getProductInStock(6));
		o2.showOrder();
		
		// Generating receipt 2 in a text file:
		
		o2.generateReceipt(2);
		
		System.out.println("\n************************************************************************************************");
		System.out.println("SHOWING PRODUCTS IN STOCK...");
		System.out.println("************************************************************************************************\n");
		s.sortStock();
		s.showAllProductsInStock();
		
		System.out.println("\n************************************************************************************************");
		System.out.println("ADDING NEW PRODUCTS TO STOCK...");
		System.out.println("(SKI BOARDS, BASKETBALL BALL, MOTOCROSS HELMET AND MOUNTAIN BIKE WHEEL)");
		System.out.println("************************************************************************************************");
		s.addProductToStock(new Product("Ski boards", 1964.55, "ZJ6L532ZP6U"));
		s.addProductToStock(new Product("Basketball ball", 120.0, "WOPYC9HVZ7J"));
		s.addProductToStock(new Product("Motocross helmet", 460.40, "6UQHAKT3JUQ"));
		s.addProductToStock(new Product("Mountain bike wheel", 1290.75, "J2AWITQQSWS"));
		
		System.out.println("\n************************************************************************************************");
		System.out.println("SHOWING UPDATED STOCK...");
		System.out.println("************************************************************************************************\n");
		
		//Stock is ordered after adding or removing products:
		
		s.sortStock();
		s.showAllProductsInStock();
		
		System.out.println("\n************************************************************************************************");
		System.out.println("CREATING ORDER TEST 3...");
		System.out.println("************************************************************************************************\n");
		PurchaseOrder o3 = new PurchaseOrder();
		o3.setOrderID(3);
		o3.addProduct(s.getProductInStock(9));
		o3.addProduct(s.getProductInStock(15));
		o3.addProduct(s.getProductInStock(21));
		o3.addProduct(s.getProductInStock(23));
		o3.showOrder();
		
		// Generating receipt 3 in a text file:
		
		o3.generateReceipt(3);
		
		System.out.println("\n************************************************************************************************");
		System.out.println("NO MORE SKI BOARDS. REMOVING FROM STOCK...");
		System.out.println("************************************************************************************************");
		s.removeProductFromStock(23);
		
		System.out.println("\n************************************************************************************************");
		System.out.println("SHOWING UPDATED STOCK...");
		System.out.println("************************************************************************************************\n");
		s.sortStock();
		s.showAllProductsInStock();
	}

}
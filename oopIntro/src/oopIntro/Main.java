package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product();//Referans olu�turma 
		product1.setId(1);
		product1.setName("Lenova 15");
		product1.setUnitPrice(10000);
		product1.setDetail("16 gb ram");
		product1.setDiscount(10);
		product1.getUnitPriceAfterDiscount();
		
	
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		
		Category category = new Category(1,"i�ecek");
		Category category2 = new Category(2,"yiyecek");
		
		System.out.println(category.getName());
		System.out.println(category2.getName());
		
	
	}

}

package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring ile çalışıldığı zaman buna gerek kalmayacak.
		
		ProductService productService1 = new ProductManager(new HibernateProductDao());
		
		Product product1 = new Product(1,2,"Çikolata",12,60);
		productService1.add(product1);
		
		
		ProductService productService2 = new ProductManager(new AbcProductDao());
		
		Product product2 = new Product(1,2,"Çikolata",12,60);
		productService2.add(product2);
		
		////////////////////////////////////////////////////////////
	}

}

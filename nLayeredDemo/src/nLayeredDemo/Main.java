package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring ile çalışıldığı zaman buna gerek kalmayacak.
		
		ProductService productService1 = new ProductManager(new HibernateProductDao(), new jLoggerManagerAdapter());
		
		Product product1 = new Product(1,2,"Çikolata",12,60);
		productService1.add(product1);
		
		
		ProductService productService2 = new ProductManager(new AbcProductDao(), new jLoggerManagerAdapter());
		
		Product product2 = new Product(1,2,"Elma",7,32);
		productService2.add(product2);
		
		////////////////////////////////////////////////////////////
	}

}

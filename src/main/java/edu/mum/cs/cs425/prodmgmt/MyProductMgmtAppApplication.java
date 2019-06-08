package edu.mum.cs.cs425.prodmgmt;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.prodmgmt.model.Product;
import edu.mum.cs.cs425.prodmgmt.repository.productRepository;

@SpringBootApplication
public class MyProductMgmtAppApplication implements CommandLineRunner {
	
    @Autowired    
	productRepository productrepository;
    
    public static void saveProduct(Product prod)
    {
    	
    }
	public static void main(String[] args) {
		SpringApplication.run(MyProductMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product prod=new Product(1001,"iPhone XS Max", 1500, Date.valueOf(LocalDate.of(2018, 10, 24)));
		//{ productId:1001, name:iPhone XS Max, unitPrice:1,500.00, dateMfd:2018/10/24 }
		saveProduct(prod);
		
	}

}

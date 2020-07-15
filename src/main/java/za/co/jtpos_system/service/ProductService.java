/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.jtpos_system.entities.Product;
import za.co.jtpos_system.repositories.ProductRepository;

/**
 *
 * @author ayuk
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;
    List<Product>products = new ArrayList<>();
 
    
      public Long generatedValues(){
         String generateAccountNumber = String.valueOf(new Random().nextInt()).substring(1);
        long value = Long.parseLong(generateAccountNumber);
      return value;
   } 
    
    public Product addProduct(Product product){
        product.setProductBarcode(generatedValues());
        Product p = productRepo.save(product);
      return  p; 
       
    }
    
    public List<Product> addProducts(List<Product>products){
        for (Product product : products) {
            product.setProductBarcode(generatedValues());
            this.products.add(product);
        }
        return productRepo.saveAll(this.products);
    }
    
    
    public Product updateProduct(Product product){
         Product existingProduct = productRepo.findById(product.getProductBarcode()).get();
         existingProduct.setName(product.getName());
         existingProduct.setPrice(product.getPrice());
         existingProduct.setType(product.getType());
         existingProduct.setQuantity(product.getQuantity());
       return  productRepo.save(existingProduct);
    }
     
      public String deleteProduct(long id){
         productRepo.deleteById(id);
         return "Product's " + id + "Deleted"; 
     }
      
   public Product getByName(String productNames){
        return productRepo.findByName(productNames);
    }
   
   public List<Product> getAllProducts(){
        
        return productRepo.findAll();
    }
  
}

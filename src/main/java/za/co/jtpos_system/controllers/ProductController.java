/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.jtpos_system.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.jtpos_system.entities.Product;
import za.co.jtpos_system.service.ProductService;

/**
 *
 * @author ayuk
 */
@RestController
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "register/addProduct")
    public Product addProductToInventory(@RequestBody Product products){
       return productService.addProduct(products);
        
    }
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.POST, value = "register/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
       return productService.addProducts(products);
    }
    
    @CrossOrigin(origins = "*")
     @RequestMapping(method = RequestMethod.GET, value = "productByName/getProduct/{name}")
    public Product getByName(@PathVariable String name){
       return productService.getByName(name);
    }
    
    @CrossOrigin(origins = "*")
     @RequestMapping(method = RequestMethod.DELETE, value = "productDelete/deleteProduct/{id}")
    public String deleteProduct(@PathVariable long id){
       return productService.deleteProduct(id);
    }
    
    @CrossOrigin(origins = "*")
    @RequestMapping(method = RequestMethod.GET, value = "inventoryList/getAllProducts")
    public List<Product> getAllProducts(){
       return productService.getAllProducts();
    }
    
     @CrossOrigin(origins = "*")
     @RequestMapping(method = RequestMethod.PUT, value = "productUpdate/updateProduct")
    public Product updateProduct(@RequestBody Product product){
       return productService.updateProduct(product);
    }
}
